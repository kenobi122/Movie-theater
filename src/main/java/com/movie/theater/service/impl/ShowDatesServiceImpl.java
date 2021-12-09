package com.movie.theater.service.impl;

import com.movie.theater.model.entity.ShowDates;
import com.movie.theater.repository.ShowDateRepository;
import com.movie.theater.service.ShowDatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowDatesServiceImpl implements ShowDatesService {
    private final ShowDateRepository showDateRepository;

    @Autowired
    public ShowDatesServiceImpl(ShowDateRepository showDateRepository) {
        this.showDateRepository = showDateRepository;
    }

    @Override
    public List<ShowDates> findAll() {
        return showDateRepository.findAll();
    }

    @Override
    public ShowDates save(ShowDates showDates) {
        return showDateRepository.save(showDates);
    }

    @Override
    public ShowDates findByShowDateId(Integer showDateId) {
        return showDateRepository.findByShowDateId(showDateId);
    }
}
