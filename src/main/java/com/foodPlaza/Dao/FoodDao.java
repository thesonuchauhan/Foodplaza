package com.foodPlaza.Dao;


import java.util.List;

import com.foodPlaza.Pojo.Feedback;
import com.foodPlaza.Pojo.Food;


public interface FoodDao 
{
	
boolean addFood(Food f);
	
boolean updateFood(Food foodobj);
	
boolean deleteFood(int foodId);
	
Food  searchFood(int foodId);
	
List<Food> getAllFood();
	
List<Food> searchFoodByName(String foodName);
	
List<Food> seatchFoodByCategory(String Category);

boolean addFeedback(Feedback foodback);
List<Feedback>getAllFeedback();
	

}
