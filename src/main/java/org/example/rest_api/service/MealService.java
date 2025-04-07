package org.example.rest_api.service;

import org.example.rest_api.model.Dish;
import org.example.rest_api.model.Meal;
import org.example.rest_api.model.User;
import org.example.rest_api.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public Meal addMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public List<Meal> getMealsForUser(User user, LocalDate date) {
        return mealRepository.findByUserAndDate(user, date);
    }

    public int calculateTotalCalories(List<Dish> dishes) {
        return dishes.stream().mapToInt(Dish::getCaloriesPerServing).sum();
    }
}

