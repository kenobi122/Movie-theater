package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class CinemaRoom extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cinemaRoomId;

    @Column(nullable = false)
    private String cinemaRoomName;

    @Column(length = 10, nullable = false)
    private int seatQuantity;

}
