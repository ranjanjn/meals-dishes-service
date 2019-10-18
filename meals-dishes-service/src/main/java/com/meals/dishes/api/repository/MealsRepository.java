package com.meals.dishes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meals.dishes.api.domain.Meals;

@Repository
public interface MealsRepository extends JpaRepository<Meals, String>{

}
