package com.example.cardapio.DTO;

import com.example.cardapio.entity.Food;

public record FoodResponseDTO (Long Id, String title, String img, Integer price){
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImg(), food.getPrice());
    }
}
