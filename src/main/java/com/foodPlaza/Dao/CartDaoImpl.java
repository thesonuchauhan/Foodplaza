package com.foodPlaza.Dao;


import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;


import com.foodPlaza.Pojo.Cart;

import com.foodPlaza.Pojo.Food;

import com.foodPlaza.Utility.DButility;



public class CartDaoImpl implements CartDao_20890 
{

	
@Override
	
public boolean addToCart(Cart cart) 
{
		
try {
			
Connection con=DButility.getconnect();
			
String sql="insert into cart(foodId,foodPrice,foodQuanty,email,foodName,totalPrice)values(?,?,?,?,?,?)";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setInt(1,cart.getFoodId());
			
ps.setDouble(2,cart.getFoodPrice());
			
ps.setInt(3,cart.getFoodQuanty());
			
ps.setString(4,cart.getEmailId());
			
ps.setString(5, cart.getFoodName());
			
ps.setDouble(6, cart.getTotalPrice());
			
			
int i=ps.executeUpdate();
			
if(i>0)
			
{
				
return true;//here will not write sop beczo addfood method return type is boolean 
			
}
			
else
			
{
				
return false;
			
}
		
}
		
catch(Exception a)
		
{
			
a.printStackTrace();
		
}
		
		
		
		
// TODO Auto-generated method stub
		
return false;
	
}

	

@Override
	
public List<Cart> showCart(String emailId) 
{
		
List<Cart> l=new ArrayList<>();
		
try {
			
String sql="select * from cart ";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);

//ps.setString(1, emailId);

ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
				
Cart c=new Cart();
				
c.setFoodId(rs.getInt(1));
				
c.setCartId(rs.getInt(2));
				
c.setFoodPrice(rs.getDouble(3));
				
c.setFoodQuanty(rs.getInt(4));
				
c.setEmailId(rs.getString(6));
				
c.setFoodName(rs.getString(7));
				
l.add(c);
			
}
			
		
}
		
catch(Exception e)
		
{
			
e.printStackTrace();
		
}
		
		

// TODO Auto-generated method stub
		
return l;
	
}

	

@Override
	
public boolean deletCart(int cartId) 
{
		
		
try {
			
Connection con=DButility.getconnect();
			
String sql="delete from cart where  cartId=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setInt(1,cartId);
			
int i=ps.executeUpdate();
			
if(i>0)
			
{
				
return true;//here will not write sop beczo addfood method return type is boolean 
				
				
			
}
			
else
			
{
				
return false;
			
}
		
}
		
catch(Exception a)
		
{
			
a.printStackTrace();
		
}
		

// TODO Auto-generated method stub
		
return false;
	
}

	

@Override
	
public boolean clearCart(String emailId) 
{

		
try {
			
Connection con=DButility.getconnect();
			
String sql="delete from cart where  email=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setString(1,emailId);
			
int i=ps.executeUpdate();
			
if(i>0)
			
{
				
return true;//here will not write sop beczo addfood method return type is boolean 
				
				
			
}
			
else
			
{
				
return false;
			
}
		
}
		
catch(Exception a)
		
{
			
a.printStackTrace();
		
}

		
		
		
		

// TODO Auto-generated method stub
		
return false;
	
}
	


}