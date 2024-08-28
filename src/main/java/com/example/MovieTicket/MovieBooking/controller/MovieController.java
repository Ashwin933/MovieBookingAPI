package com.example.MovieTicket.MovieBooking.controller;



import com.example.MovieTicket.MovieBooking.Model.Movie;
import com.example.MovieTicket.MovieBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movie")
    public Movie addMovie(@Valid @RequestBody Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new RuntimeException("Validation error");
        }
        return movieService.addMovie(movie);
    }

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovieById(@PathVariable String id) {
        movieService.deleteMovie(id);
    }

    @PutMapping("/update/{id}")
    public Movie updateMovie(@PathVariable String id, @Valid @RequestBody Movie movie, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new RuntimeException("Validation error");
        }
        return movieService.updateMovie(id, movie);
    }
}