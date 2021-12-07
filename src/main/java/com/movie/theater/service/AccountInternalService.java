package com.movie.theater.service;

import com.movie.theater.model.entity.Account;

import java.util.List;

public interface AccountInternalService {
    List<Account> findByActiveAccount();
}
