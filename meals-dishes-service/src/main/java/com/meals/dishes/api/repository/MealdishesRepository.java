package com.meals.dishes.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meals.dishes.api.domain.Mealdishes;

@Repository
public interface MealdishesRepository extends JpaRepository<Mealdishes, String>{
	
	public Mealdishes findByquantity(String quantity);

}
