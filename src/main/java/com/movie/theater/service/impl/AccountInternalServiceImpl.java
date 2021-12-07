package com.movie.theater.service.impl;

import com.movie.theater.model.entity.Account;
import com.movie.theater.repository.AccountRepository;
import com.movie.theater.service.AccountInternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountInternalServiceImpl implements AccountInternalService {
    private final AccountRepository repository;

    @Override
    public List<Account> findByActiveAccount() {
        return repository.findAccountByActive();
    }
}
