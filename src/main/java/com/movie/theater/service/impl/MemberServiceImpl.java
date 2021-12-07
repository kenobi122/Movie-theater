package com.movie.theater.service.impl;

import com.movie.theater.model.entity.Account;
import com.movie.theater.model.entity.Member;
import com.movie.theater.model.response.AccountMemberResponse;
import com.movie.theater.repository.MemberRepository;
import com.movie.theater.service.AccountInternalService;
import com.movie.theater.service.MemberService;
import com.movie.theater.service.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository repository;
    private final AccountMapper mapper;
    private final AccountInternalService accountInternalService;

    @Override
    public List<AccountMemberResponse> get() {
        List<Account> accountList = accountInternalService.findAccount();
        List<Member> memberList = repository.findAll();

        List<AccountMemberResponse> accountMemberResponses = new ArrayList<>();


        for (Member member : memberList) {
            for(Account account : accountList){
                if(member.getAccountId().equals(account.getAccountId())){
                    accountMemberResponses.add(mapper.mapMemberResponse(member.getMemberId(), account));
                }
            }
        }

        return accountMemberResponses;
    }
}
