package com.movie.theater.model.request;

import lombok.Data;

@Data
public class SeatRequest {
    private int seatId;
    private int cinemaRoomId;
    private String seatColumn;
    private int seatRow;
    private int seatStatus;
}
