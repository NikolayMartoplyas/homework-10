package ru.netology.domain;

import ru.netology.Movie;

public class PostersManager {
    private Movie[] moviePosters = new Movie[0];
    private int limit;

    public PostersManager() {        //конструктор с лимитом
        this.limit = 5;
    }

    public PostersManager(int limit) {       //конструктор без лимита
        this.limit = limit;
    }

    public void addMovie(Movie movies) {
        Movie[] tmp = new Movie[moviePosters.length + 1];   //добавляет филь в список
        for (int i = 0; i < moviePosters.length; i++) {
            tmp[i] = moviePosters[i];
        }
        tmp[moviePosters.length] = movies; //добавление в конец масива
        moviePosters = tmp; //обновленние ссылки на масив

    }

    public Movie[] getMovie() {
        return moviePosters;
    }

    public Movie[] findAll() {
        for (Movie movie : getMovie()) {                 // вывод всех фильмов
            System.out.println(movie.getName());
        }
        return getMovie();
    }

    public Movie[] findLast() {
        int resultSize = Math.min(moviePosters.length, limit);
        Movie[] result = new Movie[resultSize];

        for (int i = 0; i < resultSize; i++) {
            result[i] = moviePosters[moviePosters.length - 1 - i];
        }
        return result;
    }

}

