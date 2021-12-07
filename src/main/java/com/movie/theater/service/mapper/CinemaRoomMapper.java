package com.movie.theater.service.mapper;

import com.movie.theater.model.entity.CinemaRoom;
import com.movie.theater.model.entity.ScheduleSeat;
import com.movie.theater.model.response.CinemaRoomResponse;

public class CinemaRoomMapper {
    public CinemaRoomResponse map(CinemaRoom cinemaRoom){
        CinemaRoomResponse cinemaRoomResponse = new CinemaRoomResponse();

        cinemaRoomResponse.setCinemaRoomId(cinemaRoom.getCinemaRoomId());
        cinemaRoomResponse.setCinemaRoomName(cinemaRoom.getCinemaRoomName());
        cinemaRoomResponse.setSeatQuantity(cinemaRoom.getSeatQuantity());

        return cinemaRoomResponse;
    }
}
