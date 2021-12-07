package com.movie.theater.service.impl;

import com.movie.theater.model.entity.CinemaRoom;
import com.movie.theater.model.entity.ScheduleSeat;
import com.movie.theater.model.response.CinemaRoomResponse;
import com.movie.theater.repository.ICinemaRoomRepository;
import com.movie.theater.service.ICinemaRoom;
import com.movie.theater.service.mapper.CinemaRoomMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CinemaRoomImpl implements ICinemaRoom {
    @Autowired
    private ICinemaRoomRepository iCinemaRoomRepository;
    @Autowired
    private CinemaRoomMapper mapper;

    public List<CinemaRoomResponse> getAllCinemaRoom() {
        List<CinemaRoom> scheduleSeat = iCinemaRoomRepository.findAll();
        return scheduleSeat.stream().map(mapper::map).collect(Collectors.toList());
    }
    public CinemaRoomResponse getCinemaRoomInfo(int cinemaRoomId) {
        Optional<CinemaRoom> scheduleSeat = iCinemaRoomRepository.findById(cinemaRoomId);
        CinemaRoomResponse cinemaRoomResponse = new CinemaRoomResponse();
        cinemaRoomResponse.setCinemaRoomId(scheduleSeat.get().getCinemaRoomId());
        cinemaRoomResponse.setCinemaRoomName(scheduleSeat.get().getCinemaRoomName());
        cinemaRoomResponse.setSeatQuantity(scheduleSeat.get().getSeatQuantity());
        return cinemaRoomResponse;
    }
}