package com.movie.theater.controller;

import com.movie.theater.model.common.SystemResponse;
import com.movie.theater.model.request.SeatRequest;
import com.movie.theater.model.request.TicketRequest;
import com.movie.theater.model.response.Response;
import com.movie.theater.model.response.SeatResponse;
import com.movie.theater.model.response.TicketResponse;
import com.movie.theater.service.ISeatService;
import com.movie.theater.service.ITicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seat")
@RequiredArgsConstructor
public class SeatController {
    @Autowired
    private ISeatService iSeatService;
    @Autowired
    private ITicketService iTicketService;

    @GetMapping("/getTicket")
    public ResponseEntity<SystemResponse<TicketResponse>> getTicket(@RequestBody TicketRequest ticketRequest) {
        TicketResponse ticketResponse = iTicketService.read(ticketRequest);
        return Response.ok(ticketResponse);
    }
    @GetMapping("/updateSeat")
    public ResponseEntity<SystemResponse<Object>> updateTicket(@RequestBody SeatRequest seatRequest) {
        iSeatService.updateStatus(seatRequest);
        SeatResponse seatResponse = iSeatService.read(seatRequest);
        return Response.ok(seatResponse);
    }
}
