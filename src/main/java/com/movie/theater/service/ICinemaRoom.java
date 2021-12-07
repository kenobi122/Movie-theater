package com.movie.theater.service;

import com.movie.theater.model.request.CinemaRoomRequest;
import com.movie.theater.model.response.CinemaRoomResponse;

import java.util.List;

public interface ICinemaRoom {
    public void create(CinemaRoomRequest cinemaRoomRequest);
    public List<CinemaRoomResponse> getAllCinemaRoom();
    public CinemaRoomResponse getCinemaRoomInfo(int cinemaRoomId);
}
