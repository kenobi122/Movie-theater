package com.movie.theater.service;

import com.movie.theater.model.request.SeatRequest;
import com.movie.theater.model.response.SeatResponse;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ISeatService {
    public void creat(SeatRequest seatRequest);
    public SeatResponse read(SeatRequest seatRequest);
    public void updateStatus(SeatRequest seatRequest);
    public List<String> getAvailableSeat(int cinemaRoomId);
}
