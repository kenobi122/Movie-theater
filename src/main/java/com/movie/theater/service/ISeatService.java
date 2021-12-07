package com.movie.theater.service;

import com.movie.theater.model.request.SeatRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISeatService {
    List<String> getAvailableSeat(int cinemaRoomId);
}
