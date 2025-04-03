package org.example.rest_api.Controller;

import org.example.rest_api.Eat.Dish;
import org.example.rest_api.Repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    @Autowired
    private DishRepository dishRepository;

    @PostMapping
    public Dish createDish(@Valid @RequestBody Dish dish) {
        return dishRepository.save(dish);
    }

    @GetMapping
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDishById(@PathVariable Long id) {
        return dishRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Другие методы для редактирования и удаления блюд
}
