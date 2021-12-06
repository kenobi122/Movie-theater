package com.movie.theater.controller;

import com.movie.theater.model.common.SystemResponse;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.model.response.Response;
import com.movie.theater.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<SystemResponse<Object>> create(@Valid @RequestBody AccountRequest request){
         accountService.createMember(request);

         return Response.ok();
    }

}
