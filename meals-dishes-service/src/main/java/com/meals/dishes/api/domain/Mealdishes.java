package com.meals.dishes.api.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="mealdishes")
public class Mealdishes {
	
	@Id
	private String mealdishId;
	
	private String quantity;
	
	@JsonManagedReference("mealdishes-meals")
	@OneToMany(mappedBy = "mealdishes",cascade = CascadeType.ALL)
	List<Meals>mealsList=new ArrayList<>();
	
	public Mealdishes() {
		
	}

	public Mealdishes(String mealdishId, String quantity, List<Meals> mealsList) {
		super();
		this.mealdishId = mealdishId;
		this.quantity = quantity;
		this.mealsList = mealsList;
	}

	public String getMealdishId() {
		return mealdishId;
	}

	public void setMealdishId(String mealdishId) {
		this.mealdishId = mealdishId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<Meals> getMealsList() {
		return mealsList;
	}

	public void setMealsList(List<Meals> mealsList) {
		this.mealsList = mealsList;
	}

	@Override
	public String toString() {
		return "Mealdishes [mealdishId=" + mealdishId + ", quantity=" + quantity + ", mealsList=" + mealsList + "]";
	}
  
}
