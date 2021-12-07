package com.movie.theater.service.impl;

import com.movie.theater.model.entity.ScheduleSeat;
import com.movie.theater.model.entity.Seat;
import com.movie.theater.model.request.ScheduleSeatRequest;
import com.movie.theater.model.request.SeatRequest;
import com.movie.theater.model.response.ScheduleSeatResponse;
import com.movie.theater.repository.IScheduleSeatRepository;
import com.movie.theater.service.IScheduleSeatService;
import com.movie.theater.service.mapper.ScheduleSeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleSeatServiceImpl implements IScheduleSeatService {
    @Autowired
    private IScheduleSeatRepository iScheduleSeatRepository;

    @Autowired
    private ScheduleSeatMapper mapper;

    @Override
    public List<ScheduleSeatResponse> getAvailableScheSeat(ScheduleSeatRequest scheduleSeatRequest) {
        List<ScheduleSeat> scheduleSeat = iScheduleSeatRepository.findAll();
        return scheduleSeat.stream().map(mapper::map).collect(Collectors.toList());
    }
}
