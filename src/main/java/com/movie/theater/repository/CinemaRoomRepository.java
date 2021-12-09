package com.movie.theater.repository;

import com.movie.theater.model.entity.CinemaRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRoomRepository extends JpaRepository<CinemaRoom, Integer > {
    CinemaRoom findCinemaRoomByCinemaRoomName(String name);
}