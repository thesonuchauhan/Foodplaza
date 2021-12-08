package com.foodPlaza.Dao;




import java.util.List;


import com.foodPlaza.Pojo.Cart;


public interface CartDao_20890 
{
	
boolean addToCart(Cart cart);
	
List<Cart> showCart(String emailId);
	
boolean deletCart(int cartId);
	
boolean clearCart(String emailId);
	


}
