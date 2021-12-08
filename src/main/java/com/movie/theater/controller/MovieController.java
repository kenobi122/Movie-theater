package com.movie.theater.controller;

import com.movie.theater.DTO.MovieDTO;
import com.movie.theater.model.entity.Movie;
import com.movie.theater.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie-management")
public class MovieController {
    public final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/get-moives")
    public List<MovieDTO> getMovies() {
        return movieService.findAll();
    }

    @GetMapping(value = "/get-movie/{movieId}")
    public MovieDTO getMovie(@PathVariable("movieId") String movieId) {
        return movieService.findOne(movieId);
    }

    @PostMapping(value = "/post")
    public MovieDTO create(@RequestBody MovieDTO movieDTO){
        return movieService.save(movieDTO);
    }

    @PutMapping(value = "/update")
    public MovieDTO update(@RequestBody MovieDTO movieDTO) {
        return movieService.update(movieDTO);
    }

    @DeleteMapping(value = "/delete/{movieId}")
    public void delete(@PathVariable("movieId") String movieId, @RequestBody MovieDTO movieDTO) {
        movieService.delete(movieId);
    }
}
