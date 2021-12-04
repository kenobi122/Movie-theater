package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ScheduleSeat extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(255) not null")
    private int movieId;

    @Column(columnDefinition = "int(10) default 0")
    private int scheduleId;

    @Column(columnDefinition = "int(10) default 0")
    private int seatId;

    @Column(columnDefinition = "varchar(255) not null")
    private String seatColumn;

    @Column(columnDefinition = "int(10) default 0")
    private int seatRow;

    @Column(columnDefinition = "int(1) ")
    private int seatStatus;

    @Column(columnDefinition = "int(1) ")
    private int seatType;
}
