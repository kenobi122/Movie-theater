package com.movie.theater.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class PromotionRequest {
    @NotBlank
    private String title;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate startTime;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate endTime;

    private int discountLevel;

    @NotBlank
    private String details;

    @NotBlank
    private String image;


}
