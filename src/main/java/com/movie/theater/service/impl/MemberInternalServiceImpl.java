package com.movie.theater.service.impl;

import com.movie.theater.model.entity.Member;
import com.movie.theater.repository.MemberRepository;
import com.movie.theater.service.MemberInternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberInternalServiceImpl implements MemberInternalService {
    private final MemberRepository memberRepository;

    @Override
    public void create(Member member) {
        memberRepository.save(member);
    }
}
