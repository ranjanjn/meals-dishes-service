package com.meals.dishes.api.service;

import java.util.List;

import com.meals.dishes.api.domain.Mealdishes;

public interface MealdishesService {
	
	public void createMealdishes(Mealdishes mealdishes);
	
	public void findMealdishesById(String mealdishesID);
	
	public List<Mealdishes>findAllMealdishes();
	
	public Mealdishes findByquantity(String quantity);
}
