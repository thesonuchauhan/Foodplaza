package com.foodPlaza.Pojo;


public class Cart 
{

	
private int foodId;
	
private int cartId;
	
private double foodPrice;
	
private int foodQuanty;
	
private double totalPrice;
	
private String emailId;
	
private String foodName;
	
	
	

public Cart()
	
{
		
	
}
	

public Cart(int foodId,double foodPrice,int foodQuanty,String emailId,String foodName,double totalPrice)
	
{
		
this.foodId=foodId;
		
		
this.foodPrice=foodPrice;
		
this.foodQuanty=foodQuanty;
		
		
this.emailId=emailId;
		
this.foodName=foodName;
		
this.totalPrice=totalPrice;
	
}
	
	
	

@Override
	
public String toString() 
{
		
return "Cart [foodId=" + foodId + ", cartId=" + cartId + ", foodPrice=" + foodPrice + ", foodQuanty="
				+ foodQuanty + ", totalPrice=" + totalPrice + ", emailId=" + emailId + ", foodName=" + foodName + "]";
	
}
	
	
	
	

public int getFoodId() 
{
		
return foodId;
	
}

	
public void setFoodId(int foodId) 
{
		
this.foodId = foodId;
	
}

	
public int getCartId() 
{
		
return cartId;
	
}

	
public void setCartId(int cartId) 
{
		
this.cartId = cartId;
	
}
	

public double getFoodPrice() 
{
		
return foodPrice;
	
}
	

public void setFoodPrice(double foodPrice) 
{
		
this.foodPrice = foodPrice;
	
}
	

public int getFoodQuanty() 
{
		
return foodQuanty;
	
}
	

public void setFoodQuanty(int foodQuanty) 
{
		
this.foodQuanty = foodQuanty;
	
}
	

public double getTotalPrice() 
{
		
return totalPrice;
	
}
	

public void setTotalPrice(double totalPrice) 
{
		
this.totalPrice = totalPrice;
	
}
	

public String getEmailId() 
{
		
return emailId;
	
}
	

public void setEmailId(String emailId) 
{
		
this.emailId = emailId;
	
}
	

public String getFoodName() 
{
		
return foodName;
	
}
	

public void setFoodName(String foodName) 
{
		
this.foodName = foodName;
	
}

	
	
	
	
	
}


