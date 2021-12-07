package com.movie.theater.controller;

import com.movie.theater.model.common.SystemResponse;
import com.movie.theater.model.response.AccountEmployeeResponse;
import com.movie.theater.model.response.Response;
import com.movie.theater.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/get/active")
    public ResponseEntity<SystemResponse<List<AccountEmployeeResponse>>> getEmployee(){
       return Response.ok(employeeService.get());
    }

}
