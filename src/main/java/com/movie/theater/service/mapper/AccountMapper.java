package com.movie.theater.service.mapper;

import com.movie.theater.model.entity.Account;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.model.response.AccountMemberResponse;
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
        account.setImage(request.getImage());

        return account;
    }

    public Account map(Account account, AccountRequest request){

        account.setUsername(request.getAccount());
        account.setAddress(request.getAddress());
        account.setEmail(request.getEmail());
        account.setGender(request.getGender());
        account.setFullName(request.getFullName());
        account.setDateOfBirth(request.getDateOfBirth());
        account.setPhoneNumber(request.getPhoneNumber());
        account.setIdentityCard(request.getIdentityCard());
        account.setPassword(request.getPassword());
        account.setImage(request.getImage());

        return account;
    }

    public AccountMemberResponse mapMemberResponse(String memberId, Account account){
        AccountMemberResponse accountMemberResponse = new AccountMemberResponse();

        accountMemberResponse.setAccountId(account.getAccountId());
        accountMemberResponse.setAccount(account.getUsername());
        accountMemberResponse.setAddress(account.getAddress());
        accountMemberResponse.setEmail(account.getEmail());
        accountMemberResponse.setGender(account.getGender());
        accountMemberResponse.setFullName(account.getFullName());
        accountMemberResponse.setDateOfBirth(account.getDateOfBirth());
        accountMemberResponse.setPhoneNumber(account.getPhoneNumber());
        accountMemberResponse.setIdentityCard(account.getIdentityCard());
        accountMemberResponse.setPassword(account.getPassword());
        accountMemberResponse.setImage(account.getImage());
        accountMemberResponse.setMemberId(memberId);

        return accountMemberResponse;
    }
}
