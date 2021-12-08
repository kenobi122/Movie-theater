package com.movie.theater.service.mapper;

import com.movie.theater.DTO.MovieDTO;
import com.movie.theater.model.entity.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieDTO mapEntityToDto(Movie movieEntity) {
        MovieDTO result = new MovieDTO();
        result.setMovieId(movieEntity.getMovieId());
        result.setActor(movieEntity.getActor());
        result.setCinemaRoom(movieEntity.getCinemaRoom().getCinemaRoomName());
        result.setContent(movieEntity.getContent());
        result.setDirector(movieEntity.getDirector());
        result.setDuration(movieEntity.getDuration());
        result.setFromDate(movieEntity.getFromDate());
        result.setLargeImage(movieEntity.getLargeImage());
        result.setMovieNameEnglish(movieEntity.getMovieNameEnglish());
        result.setMovieNameVn(movieEntity.getMovieNameVn());
        result.setMovieProductionCompany(movieEntity.getMovieProductionCompany());
        result.setSmallImage(movieEntity.getSmallImage());
        result.setToDate(movieEntity.getToDate());
        result.setVersion(movieEntity.getVersion());
        return result;
    }

    public Movie mapDtoToEntity(MovieDTO movieDTO) {
        Movie result = new Movie();
        result.setMovieId(movieDTO.getMovieId());
        result.setActor(movieDTO.getActor());
        result.setContent(movieDTO.getContent());
        result.setDirector(movieDTO.getDirector());
        result.setDuration(movieDTO.getDuration());
        result.setFromDate(movieDTO.getFromDate());
        result.setLargeImage(movieDTO.getLargeImage());
        result.setMovieNameEnglish(movieDTO.getMovieNameEnglish());
        result.setMovieNameVn(movieDTO.getMovieNameVn());
        result.setMovieProductionCompany(movieDTO.getMovieProductionCompany());
        result.setSmallImage(movieDTO.getSmallImage());
        result.setToDate(movieDTO.getToDate());
        result.setVersion(movieDTO.getVersion());
        return result;
    }
}
