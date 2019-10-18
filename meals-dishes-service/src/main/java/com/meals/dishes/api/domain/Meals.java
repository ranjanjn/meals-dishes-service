package com.meals.dishes.api.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="meals")
public class Meals {
	
	@Id
	private String mealId;
	
	private String dateOfMeal;
	private String costOfMeal;
	private String mainCourse;
	private String desert;
	
	@JsonBackReference("mealdishes-meals")
	@ManyToOne
	@JoinColumn(name="mealdish_id")
	private Mealdishes mealdishes;
	
	public  Meals() {
		
	}

	public Meals(String mealId, String dateOfMeal, String costOfMeal, String mainCourse, String desert,
			Mealdishes mealdishes) {
		super();
		this.mealId = mealId;
		this.dateOfMeal = dateOfMeal;
		this.costOfMeal = costOfMeal;
		this.mainCourse = mainCourse;
		this.desert = desert;
		this.mealdishes = mealdishes;
	}

	public String getMealId() {
		return mealId;
	}

	public void setMealId(String mealId) {
		this.mealId = mealId;
	}

	public String getDateOfMeal() {
		return dateOfMeal;
	}

	public void setDateOfMeal(String dateOfMeal) {
		this.dateOfMeal = dateOfMeal;
	}

	public String getCostOfMeal() {
		return costOfMeal;
	}

	public void setCostOfMeal(String costOfMeal) {
		this.costOfMeal = costOfMeal;
	}

	public String getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	public String getDesert() {
		return desert;
	}

	public void setDesert(String desert) {
		this.desert = desert;
	}

	public Mealdishes getMealdishes() {
		return mealdishes;
	}

	public void setMealdishes(Mealdishes mealdishes) {
		this.mealdishes = mealdishes;
	}

	@Override
	public String toString() {
		return "Meals [mealId=" + mealId + ", dateOfMeal=" + dateOfMeal + ", costOfMeal=" + costOfMeal + ", mainCourse="
				+ mainCourse + ", desert=" + desert + ", mealdishes=" + mealdishes + "]";
	}
	

}
