package com.example.cardapio.entity;

import com.example.cardapio.DTO.FoodRequestDTO;
import com.example.cardapio.DTO.FoodResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Foods")
@Entity(name = "Foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String img;
    private Integer price;

    public Food(FoodResponseDTO data){
        this.title = data.title();
        this.img = data.img();
        this.price = data.price();
    }
}
