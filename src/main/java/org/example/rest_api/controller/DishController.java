package org.example.rest_api.controller;

import jakarta.validation.Valid;
import org.example.rest_api.model.Dish;
import org.example.rest_api.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping
    public ResponseEntity<Dish> addDish(@Valid @RequestBody Dish dish) {
        return ResponseEntity.ok(dishService.addDish(dish));
    }

    @GetMapping
    public ResponseEntity<List<Dish>> getAllDishes() {
        return ResponseEntity.ok(dishService.getAllDishes());
    }
}
