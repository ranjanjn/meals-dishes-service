package com.meals.dishes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meals.dishes.api.domain.Mealdishes;
import com.meals.dishes.api.service.MealdishesService;

@RestController
@RequestMapping("/mealdishes")
public class MealdishesController {
	
	@Autowired
	private MealdishesService mealdishesService;
	
	@PostMapping("/create")
	public void createMealdishes(@RequestBody Mealdishes mealdishes) {
		mealdishesService.createMealdishes(mealdishes);		
	}
	
	@GetMapping("/findAll")
	public List<Mealdishes> findAllMealdishes(){
		List<Mealdishes>mealdishesList=mealdishesService.findAllMealdishes();
		return mealdishesList;	
	}
	
	@GetMapping("/findByquantity/{quantity}")
	public Mealdishes findByquantity(@PathVariable String quantity) {
		return mealdishesService.findByquantity(quantity);	
	}
}
