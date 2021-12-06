package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Employee extends BaseEntity{
    @Id
    @Column(length = 10)
    private String id;

    @Column(length = 10, nullable = false)
    private String accountId;
}
