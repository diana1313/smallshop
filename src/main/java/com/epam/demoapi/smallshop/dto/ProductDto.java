package com.epam.demoapi.smallshop.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
public class ProductDto {
    @NonNull
    private String name;
    @NonNull
    private Integer price;
}
