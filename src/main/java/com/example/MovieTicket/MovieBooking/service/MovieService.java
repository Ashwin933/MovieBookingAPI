package com.example.MovieTicket.MovieBooking.service;

//import com.example.moviebooking.exceptions.IdAlreadyExistException;
//import com.example.moviebooking.exceptions.IdNotFoundException;
// import com.example.MovieBooking.model.Movie;
import com.example.MovieTicket.MovieBooking.Model.Movie;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService implements MovieServiceInterface {
    private final Map<String, Movie> movies = new HashMap<>();

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies.values());
    }

    @Override
    public Movie addMovie(Movie movie) {
        if (movies.containsKey(movie.getId())) {
            throw new IdAlreadyExistException("ID already exists");
        }
        movies.put(movie.getId(), movie);
        return movie;
    }

    @Override
    public Movie getMovieById(String id) {
        Movie movie = movies.get(id);
        if (movie == null) {
            throw new IdNotFoundException("ID not found");
        }
        return movie;
    }

    @Override
    public void deleteMovie(String id) {
        if (!movies.containsKey(id)) {
            throw new IdNotFoundException("ID not found");
        }
        movies.remove(id);
    }

    @Override
    public Movie updateMovie(String id, Movie updatedMovie) {
        if (!movies.containsKey(id)) {
            throw new IdNotFoundException("ID not found");
        }
        movies.put(id, updatedMovie);
        return updatedMovie;
    }
}
