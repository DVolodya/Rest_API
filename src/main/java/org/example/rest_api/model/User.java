package org.example.rest_api.model;

import  jakarta.persistence.*;
import  jakarta.validation.constraints.Email;
import  jakarta.validation.constraints.Min;
import  jakarta.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    @Min(0)
    private int age;

    @Min(0)
    private double weight;

    @Min(0)
    private double height;

    @NotNull
    private String goal; // "Похудение", "Поддержание", "Набор массы"

    private double dailyCaloricIntake;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDailyCaloricIntake() {
        return dailyCaloricIntake;
    }

    public void setDailyCaloricIntake(double dailyCaloricIntake) {
        this.dailyCaloricIntake = dailyCaloricIntake;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
// Геттеры и сеттеры

    @PrePersist
    @PreUpdate
    public void calculateDailyCaloricIntake() {
        // Пример использования формулы Харриса-Бенедикта
        if (goal.equals("Похудение")) {
            dailyCaloricIntake = (10 * weight) + (6.25 * height) - (5 * age) - 161 - 500; // Уменьшение на 500 ккал
        } else if (goal.equals("Поддержание")) {
            dailyCaloricIntake = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        } else {
            dailyCaloricIntake = (10 * weight) + (6.25 * height) - (5 * age) - 161 + 500; // Увеличение на 500 ккал
        }
    }
}

