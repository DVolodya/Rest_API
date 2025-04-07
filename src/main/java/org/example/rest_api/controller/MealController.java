package org.example.rest_api.controller;

import jakarta.validation.Valid;
import org.example.rest_api.model.Meal;
import org.example.rest_api.model.User;
import org.example.rest_api.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping
    public ResponseEntity<Meal> addMeal(@Valid @RequestBody Meal meal) {
        return ResponseEntity.ok(mealService.addMeal(meal));
    }

    @GetMapping("/user/{userId}/date/{date}")
    public ResponseEntity<List<Meal>> getMealsForUser(@PathVariable Long userId, @PathVariable String date) {
        User user = new User(); // Получите пользователя по ID
        return ResponseEntity.ok(mealService.getMealsForUser(user, LocalDate.parse(date)));
    }
}

