package com.meals.dishes.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.dishes.api.domain.Mealdishes;
import com.meals.dishes.api.repository.MealdishesRepository;
import com.meals.dishes.api.service.MealdishesService;

@Service
public class MealdishesServiceimpl implements MealdishesService{
	
	@Autowired
	private MealdishesRepository mealdishesRepository;

	@Override
	public void createMealdishes(Mealdishes mealdishes) {
		mealdishesRepository.save(mealdishes);
		
	}

	@Override
	public void findMealdishesById(String mealdishesID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mealdishes> findAllMealdishes() {
		List<Mealdishes>mealdishesList=new ArrayList<>();
		mealdishesList = mealdishesRepository.findAll();
		return mealdishesList;
	}

	@Override
	public Mealdishes findByquantity(String quantity) {
		Mealdishes mealdishes=new Mealdishes();
		mealdishes=mealdishesRepository.findByquantity(quantity);
		return mealdishes;
	}

}
