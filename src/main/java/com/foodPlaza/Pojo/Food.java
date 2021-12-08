package com.foodPlaza.Pojo;

// create table food(foodId int primary key auto_increment,foodName varchar(30)
//,foodType varchar(30),foodCategory varchar(30),foodDesc varchar(30),foodPrice double,image varchar(30));
public class Food 
{
	 
private int foodId;
	 
private  String foodName;
	 
private String foodType;
	 
private String foodCatagory;
	 
private String foodDesc;
	 
private double foodPrice;
	 
private String image;
	 

public Food()
	 
{
		 
	 
}
	 
	 

public Food(String foodName, String foodType, String foodCatagory,String 
foodDesc,double foodPrice,String image)
	 
{
		 
		 
this.foodName=foodName;
		 
this.foodType=foodType;
		 
this.foodCatagory=foodCatagory;
		 
this.foodDesc=foodDesc;
		 
this.foodPrice=foodPrice;
		 
this.image=image;
	 
}

	
	 
	 
	
	 

	

	
@Override
	
public String toString() 
{
		
return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", foodCatagory="
+ foodCatagory + ", foodDesc=" + foodDesc + ", foodPrice=" + foodPrice + ", image=" + image + "]";
	
}

	

public int getFoodId() 
{
		
return foodId;
	
}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodCatagory() {
		return foodCatagory;
	}
	public void setFoodCatagory(String foodCatagory) {
		this.foodCatagory = foodCatagory;
	}
	public String getFoodDesc() {
		return foodDesc;
	}
	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	 
	
	 

}
