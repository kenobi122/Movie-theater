package com.movie.theater.repository;

import com.movie.theater.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findMemberByAccountId(String accountId);
}
