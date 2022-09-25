package com.java.advertproject.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertDto {
    private String title;
    private String description;
    private BigDecimal price;
    private UserNameDto user;
}
