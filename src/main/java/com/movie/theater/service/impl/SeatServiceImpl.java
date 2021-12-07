package com.movie.theater.service.impl;

import com.movie.theater.model.entity.Seat;
import com.movie.theater.model.request.SeatRequest;
import com.movie.theater.repository.ISeatRepository;
import com.movie.theater.service.ISeatService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SeatServiceImpl implements ISeatService {
    @Autowired
    private ISeatRepository iSeatRepository;

    @Override
    public List<String> getAvailableSeat(int cinemaRoomId) {
        List<String> seatAvaiList = new ArrayList<>();
        List<Seat> seatlist = iSeatRepository.findAll();
        for (Seat seat : seatlist) {
            seatAvaiList.add(seat.getSeatColumn() + Integer.toString(seat.getSeatRow()));
        }
        return seatAvaiList;
    }

}
