package com.movie.theater.service;

import com.movie.theater.model.request.AccountRequest;

public interface AccountService {
    void createMember(AccountRequest request);
}
