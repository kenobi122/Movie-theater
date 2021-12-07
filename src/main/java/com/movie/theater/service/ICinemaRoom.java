package com.movie.theater.service;

import com.movie.theater.model.response.CinemaRoomResponse;

import java.util.List;

public interface ICinemaRoom {
    public List<CinemaRoomResponse> getAllCinemaRoom();
    public CinemaRoomResponse getCinemaRoomInfo(int cinemaRoomId);
}
