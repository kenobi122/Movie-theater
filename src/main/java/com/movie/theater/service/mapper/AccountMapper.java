package com.movie.theater.service.mapper;

import com.movie.theater.model.entity.Account;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.model.response.AccountResponse;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account map(AccountRequest request){
        Account account = new Account();
        account.setStatus(1);
        account.setRoleId(1);
        account.setUsername(request.getAccount());
        account.setAddress(request.getAddress());
        account.setEmail(request.getEmail());
        account.setGender(request.getGender());
        account.setFullName(request.getFullName());
        account.setDateOfBirth(request.getDateOfBirth());
        account.setPhoneNumber(request.getPhoneNumber());
        account.setIdentityCard(request.getIdentityCard());
        account.setPassword(request.getPassword());

        return account;
    }

    public AccountResponse map(Account account){
        AccountResponse accountResponse = new AccountResponse();

        accountResponse.setAccountId(account.getAccountId());
        accountResponse.setAccount(account.getUsername());
        accountResponse.setAddress(account.getAddress());
        accountResponse.setEmail(account.getEmail());
        accountResponse.setGender(account.getGender());
        accountResponse.setFullName(account.getFullName());
        accountResponse.setDateOfBirth(account.getDateOfBirth());
        accountResponse.setPhoneNumber(account.getPhoneNumber());
        accountResponse.setIdentityCard(account.getIdentityCard());
        accountResponse.setPassword(account.getPassword());

        return accountResponse;
    }
}
