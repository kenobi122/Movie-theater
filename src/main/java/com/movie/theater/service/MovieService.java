package com.movie.theater.service;

import com.movie.theater.DTO.MovieDTO;
import com.movie.theater.model.entity.Movie;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MovieService {
    MovieDTO save(MovieDTO movie);
    MovieDTO update(MovieDTO updateMovie);
    void delete(String id);
    List<MovieDTO> findAll(Pageable pageble);
    List<MovieDTO> findAll();
    int getTotalItem();
    MovieDTO findOne(String id);
}
