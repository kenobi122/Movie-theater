package com.movie.theater.service.mapper;

import com.movie.theater.model.entity.ScheduleSeat;
import com.movie.theater.model.response.ScheduleSeatResponse;
import org.springframework.stereotype.Component;

@Component
public class ScheduleSeatMapper {

    public ScheduleSeatResponse map(ScheduleSeat scheduleSeat){
        ScheduleSeatResponse scheduleSeatResponse = new ScheduleSeatResponse();

        scheduleSeatResponse.setScheduleId(scheduleSeat.getScheduleId());
        scheduleSeatResponse.setSeatId(scheduleSeat.getSeatId());
        scheduleSeatResponse.setScheduleSeatId(scheduleSeat.getScheduleSeatId());
        scheduleSeatResponse.setSeatRow(scheduleSeat.getSeatRow());
        scheduleSeatResponse.setSeatColumn(scheduleSeat.getSeatColumn());
        scheduleSeatResponse.setSeatStatus(scheduleSeat.getSeatStatus());
        scheduleSeatResponse.setSeatType(scheduleSeat.getSeatType());
        scheduleSeatResponse.setMovieId(scheduleSeat.getMovieId());


        return scheduleSeatResponse;
    }
}
