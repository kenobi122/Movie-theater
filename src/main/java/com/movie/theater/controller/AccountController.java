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

}
