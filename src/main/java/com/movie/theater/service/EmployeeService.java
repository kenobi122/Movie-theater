package com.movie.theater.service;

import com.movie.theater.model.response.AccountEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<AccountEmployeeResponse> get();
}
