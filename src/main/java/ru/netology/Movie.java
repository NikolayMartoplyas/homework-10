package ru.netology;

public class Movie {
    private String Name;
    private double releaseYear;
    private String genre;


    public Movie(String Name, double releaseYear, String genre) {
        this.Name = Name;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(double releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
