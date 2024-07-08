package com.example.cardapio.controller;

import com.example.cardapio.DTO.FoodResponseDTO;
import com.example.cardapio.entity.Food;
import com.example.cardapio.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    private final FoodRepository repository;

    @Autowired
    public FoodController(FoodRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void saveFood(@RequestBody FoodResponseDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
    }

    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList;
        foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void deleteFood(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
