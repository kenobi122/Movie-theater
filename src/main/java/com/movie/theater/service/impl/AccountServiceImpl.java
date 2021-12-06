package com.movie.theater.service.impl;

import com.movie.theater.exception.AppException;
import com.movie.theater.model.common.ErrorCode;
import com.movie.theater.model.entity.Account;
import com.movie.theater.model.entity.Employee;
import com.movie.theater.model.entity.Member;
import com.movie.theater.model.request.AccountRequest;
import com.movie.theater.repository.AccountRepository;
import com.movie.theater.service.AccountService;
import com.movie.theater.service.EmployeeInternalService;
import com.movie.theater.service.MemberInternalService;
import com.movie.theater.service.mapper.AccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;
    private final AccountMapper mapper;
    private final MemberInternalService memberInternalService;
    private final EmployeeInternalService employeeInternalService;

    @Override
    public void createMember(AccountRequest request) {
        if(repository.findAccountByUsername(request.getAccount()).isPresent()){
            throw new AppException(ErrorCode.ACCOUNT_ALREADY_EXISTS);
        }

        Account account = mapper.map(request);
        repository.save(account);

        Member member = new Member();
        member.setAccountId(account.getAccountId());
        memberInternalService.create(member);

    }

    @Override
    public void createEmployee(AccountRequest request) {
        if(repository.findAccountByUsername(request.getAccount()).isPresent()){
            throw new AppException(ErrorCode.ACCOUNT_ALREADY_EXISTS);
        }

        Account account = mapper.map(request);
        repository.save(account);

        Employee employee = new Employee();
        employee.setAccountId(account.getAccountId());
        employeeInternalService.create(employee);
    }
}
