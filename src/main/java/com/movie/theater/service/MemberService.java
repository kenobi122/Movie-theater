package com.movie.theater.service;

import com.movie.theater.model.response.AccountMemberResponse;

import java.util.List;

public interface MemberService {
    List<AccountMemberResponse> get();

}
