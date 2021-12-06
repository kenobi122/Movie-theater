package com.movie.theater.service.impl;

import com.movie.theater.exception.AppException;
import com.movie.theater.model.common.ErrorCode;
import com.movie.theater.model.entity.Account;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.repository.AccountRepository;
import com.movie.theater.service.AccountService;
import com.movie.theater.service.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;
    private final AccountMapper mapper;

    @Override
    public void create(AccountRequest request) {
        if(repository.findAccountByUsername(request.getAccount()).isPresent()){
            throw new AppException(ErrorCode.ACCOUNT_ALREADY_EXISTS);
        }

        Account account = mapper.map(request);
        repository.save(account);

    }
}
