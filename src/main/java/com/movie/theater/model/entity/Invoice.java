package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Invoice extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int accountId;

    @Column(length = 10, nullable = false)
    private int addScore;

    private LocalDate bookingDate;

    @Column(nullable = false)
    private String movieName;

    private LocalDate scheduleShow;

    @Column(length = 1, nullable = false)
    private int status;

    @Column(length = 19, nullable = false)
    private int totalMoney;

    @Column(length = 10, nullable = false)
    private int userScore;

    @Column( nullable = false)
    private String seat;


}
