package com.example.MovieTicket.MovieBooking.Model;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Movie {
    @NotNull
    @Size(min = 1)
    private String id;

    @NotNull
    @Size(min = 3, max = 20)
    private String movieName;

    @NotNull
    private String movieDirector;

    @Min(1)
    @NotNull
    private long movieRating;

    @NotNull
    private String movieLanguage;

    @NotNull
    private List<String> writers;

    @NotNull
    private List<String> actors;

    @NotNull
    private List<String> genre;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public long getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(long movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
