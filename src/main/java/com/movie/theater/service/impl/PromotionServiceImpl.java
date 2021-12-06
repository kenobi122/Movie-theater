package com.movie.theater.service.impl;

import com.movie.theater.exception.AppException;
import com.movie.theater.model.entity.Promotion;
import com.movie.theater.model.request.PromotionRequest;
import com.movie.theater.model.response.PromotionResponse;
import com.movie.theater.repository.PromotionRepository;
import com.movie.theater.service.PromotionService;
import com.movie.theater.service.mapper.PromotionMapper;
import org.springframework.stereotype.Service;

@Service
public class PromotionServiceImpl implements PromotionService{
    private final PromotionMapper promotionMapper;
    private final PromotionRepository promotionRepository;

    public PromotionServiceImpl(PromotionMapper promotionMapper, PromotionRepository promotionRepository) {
        this.promotionMapper = promotionMapper;
        this.promotionRepository = promotionRepository;
    }

    @Override
    public PromotionResponse create(PromotionRequest promotionRequest) {
        Promotion promotion = promotionMapper.map(promotionRequest);

        promotionRepository.save(promotion);

        return promotionMapper.map(promotion);
    }
}
