package com.movie.theater.repository;

import com.movie.theater.model.entity.CinemaRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICinemaRoomRepository extends JpaRepository<CinemaRoom, Integer>{
}
