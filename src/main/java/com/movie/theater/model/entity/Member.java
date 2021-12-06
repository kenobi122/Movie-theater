package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Member extends BaseEntity {
    @Id
    @Column(length = 10)
    private String memberId;

    @Column(length = 10, nullable = false)
    private int score;


    @Column(length = 10, nullable = false)
    private String accountId;
}
