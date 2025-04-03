package org.example.rest_api.Repository;

import org.example.rest_api.Eat.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
