package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Movie extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String actor;

    @Column(length = 10,nullable = false)
    private int cinemaRoomId;

    @Column(length = 1000,nullable = false)
    private String content;

    @Column(nullable = false)
    private String director;

    @Column(length = 10,nullable = false)
    private int duration;

    private LocalDate fromDate;

    @Column(nullable = false)
    private String movieProductionCompany;

    private LocalDate toDate;

    @Column(nullable = false)
    private String version;

    @Column(nullable = false)
    private String movieNameEnglish;

    @Column(nullable = false)
    private String movieNameVn;

    @Column(nullable = false)
    private String largeImage;

    @Column(nullable = false)
    private String smallImage;


}
