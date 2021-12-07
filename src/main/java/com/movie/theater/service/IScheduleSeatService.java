package com.movie.theater.service;

import com.movie.theater.model.request.ScheduleSeatRequest;
import com.movie.theater.model.response.ScheduleSeatResponse;

import java.util.List;

public interface IScheduleSeatService {
    public List<ScheduleSeatResponse> getAvailableScheSeat(ScheduleSeatRequest scheduleSeatRequest);
}
