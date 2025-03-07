package ru.netology;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PostersManager;


public class PostersManagerTest {

    Movie item1 = new Movie("Бладшот",12.03, "Боевик");
    Movie item2 = new Movie("Вперед",03.03, "Мультфильм");
    Movie item3 = new Movie("Отель Белград",05.03, "комедия");
    Movie item4 = new Movie("Дженетельмены",13.02, "Боевик");
    Movie item5 = new Movie("Человек-неведимка",20.04, "триллер");
    Movie item6 = new Movie("Тролли",10.06, "Мультфильм");
    Movie item7 = new Movie("Номер один",12.05, "комедия");



    @Test
    public void addingMovieToThePoster() {
        PostersManager poster = new PostersManager(7);
        poster.addMovie(item1);
        poster.addMovie(item2);
        poster.addMovie(item3);
        poster.addMovie(item4);
        poster.addMovie(item5);
        poster.addMovie(item6);
        poster.addMovie(item7);
        poster.findAll();

        Movie[] expected = {item1, item2, item3, item4, item5, item6, item7};
        Movie[] actual = poster.getMovie();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void outputMoviesInReverseOrder(){
        PostersManager poster = new PostersManager();
        poster.addMovie(item1);
        poster.addMovie(item2);
        poster.addMovie(item3);
        poster.addMovie(item4);
        poster.addMovie(item5);
        poster.addMovie(item6);
        poster.addMovie(item7);
        Movie[] expected = { item7, item6, item5, item4, item3};
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void outputMoviesInReverseOrderTwo(){
        PostersManager poster = new PostersManager(3);
        poster.addMovie(item1);
        poster.addMovie(item2);
        poster.addMovie(item3);
        poster.addMovie(item4);
        poster.addMovie(item5);
        poster.addMovie(item6);
        poster.addMovie(item7);
        Movie[] expected = { item7, item6, item5, };
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void filmsLessThanLimit(){
        PostersManager poster = new PostersManager();
        poster.addMovie(item1);
        poster.addMovie(item2);
        poster.addMovie(item3);


        Movie[] expected = { item3, item2, item1, };
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void numberOfFilmsMeetTheLimit(){
        PostersManager poster = new PostersManager();
        poster.addMovie(item1);
        poster.addMovie(item2);
        poster.addMovie(item3);
        poster.addMovie(item4);
        poster.addMovie(item5);

        Movie[] expected = { item5, item4, item3, item2, item1 };
        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
