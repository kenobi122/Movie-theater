package com.movie.theater.controller;

import com.movie.theater.model.common.SystemResponse;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.model.request.SeatRequest;
import com.movie.theater.model.request.TicketRequest;
import com.movie.theater.model.response.Response;
import com.movie.theater.model.response.SeatResponse;
import com.movie.theater.model.response.TicketResponse;
import com.movie.theater.service.AccountService;
import com.movie.theater.service.ISeatService;
import com.movie.theater.service.ITicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @Autowired
    private ITicketService iTicketService;
    @Autowired
    private ISeatService iSeatService;

    @PostMapping("/register/member")
    public ResponseEntity<SystemResponse<Object>> createMember(@Valid @RequestBody AccountRequest request){
         accountService.createMember(request);

         return Response.ok();
    }

    @PostMapping("/register/employee")
    public ResponseEntity<SystemResponse<Object>> createEmployee(@Valid @RequestBody AccountRequest request){
        accountService.createEmployee(request);

        return Response.ok();
    }
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
