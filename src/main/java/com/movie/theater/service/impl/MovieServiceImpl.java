package com.movie.theater.service.impl;

import com.movie.theater.DTO.MovieDTO;
import com.movie.theater.model.entity.*;
import com.movie.theater.repository.CinemaRoomRepository;
import com.movie.theater.repository.MovieRepository;
import com.movie.theater.service.MovieService;
import com.movie.theater.service.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final CinemaRoomRepository cinemaRoomRepository;
    private final MovieMapper movieMapper;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository, CinemaRoomRepository cinemaRoomRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.cinemaRoomRepository = cinemaRoomRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public MovieDTO save(MovieDTO movie) {
        CinemaRoom cinemaRoom = cinemaRoomRepository.findCinemaRoomByCinemaRoomName(movie.getCinemaRoom());
        Movie newMovie = new Movie();
        newMovie = movieMapper.mapDtoToEntity(movie);
        newMovie.setCinemaRoom(cinemaRoom);
        newMovie.setSchedules(Arrays.asList(new Schedule("09:00")));
        newMovie.setTypes(Arrays.asList(new Type("Hanh dong")));
        newMovie.setShowDates(Arrays.asList(new ShowDates("date name")));
        return movieMapper.mapEntityToDto(movieRepository.save(newMovie));
    }

    @Override
    public MovieDTO update(MovieDTO updateMovie) {
        CinemaRoom cinemaRoom = cinemaRoomRepository.findCinemaRoomByCinemaRoomName(updateMovie.getCinemaRoom());
        Movie newUpdateMovie = new Movie();
        newUpdateMovie = movieMapper.mapDtoToEntity(updateMovie);
        newUpdateMovie.setCinemaRoom(cinemaRoom);
        return movieMapper.mapEntityToDto(movieRepository.save(newUpdateMovie));
    }

    @Override
    public void delete(String id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<MovieDTO> findAll(Pageable pageable) {
        List<MovieDTO> movieDTOList = new ArrayList<>();
        List<Movie> movieList = movieRepository.findAll(pageable).getContent();
        for (Movie item: movieList
             ) {
            MovieDTO movieDTO = movieMapper.mapEntityToDto(item);
            movieDTOList.add(movieDTO);
        }
        return movieDTOList;
    }

    @Override
    public List<MovieDTO> findAll() {
        List<MovieDTO> movieDTOList = new ArrayList<>();
        List<Movie> movieList = movieRepository.findAll();
        for (Movie item: movieList
        ) {
            MovieDTO movieDTO = movieMapper.mapEntityToDto(item);
            movieDTOList.add(movieDTO);
        }
        return movieDTOList;
    }

    @Override
    public int getTotalItem() {
        return 0;
    }

    @Override
    public MovieDTO findOne(String id) {
        Movie movie = movieRepository.findMovieByMovieId(id);
        return movieMapper.mapEntityToDto(movie);
    }
}
