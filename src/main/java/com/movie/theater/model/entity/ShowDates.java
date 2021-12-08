package com.movie.theater.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ShowDates extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showDateId;

    private LocalDate showDate;

    @Column(columnDefinition = "varchar(255)")
    private String dateName;

    @ManyToMany(mappedBy = "showDates")
    private List<Movie> movies = new ArrayList<>();

    public ShowDates(String date_name) {
        super();
        this.dateName = date_name;
    }
}
