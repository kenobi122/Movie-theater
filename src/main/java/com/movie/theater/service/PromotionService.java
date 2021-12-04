package com.movie.theater.service;

import com.movie.theater.model.request.PromotionRequest;
import com.movie.theater.model.response.PromotionResponse;

public interface PromotionService {
    PromotionResponse create(PromotionRequest promotionRequest);
}
