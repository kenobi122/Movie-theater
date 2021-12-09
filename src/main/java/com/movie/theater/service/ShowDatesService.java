package com.movie.theater.service;

import com.movie.theater.model.entity.ShowDates;

import java.util.List;

public interface ShowDatesService {
    List<ShowDates> findAll();
    ShowDates save(ShowDates showDates);
    ShowDates findByShowDateId(Integer showDateId);
}
