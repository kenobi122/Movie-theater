package com.movie.theater.service;

import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.model.response.AccountMemberResponse;

public interface AccountService {
    void createMember(AccountRequest request);
    void createEmployee(AccountRequest request);

    AccountMemberResponse editMember(String accountId, AccountRequest accountRequest);
}
