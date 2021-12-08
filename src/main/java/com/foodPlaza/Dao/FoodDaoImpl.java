package com.foodPlaza.Dao;


import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.foodPlaza.Pojo.Feedback;
import com.foodPlaza.Pojo.Food;

import com.foodPlaza.Utility.DButility;



public class FoodDaoImpl implements FoodDao 

{
	

	
@Override
	
public boolean addFood(Food f) 
{
		
try {
			
	Connection con=DButility.getconnect();
	
	String sql="insert into Food(FoodName,Foodtype,FoodCategory,FoodDesc,FoodPrice,Image)values(?,?,?,?,?,?)";
				
	PreparedStatement ps=con.prepareStatement(sql);			
			
ps.setString(1,f.getFoodName());
			
ps.setString(2,f.getFoodType());
			
ps.setString(3,f.getFoodCatagory());
			
ps.setString(4,f.getFoodDesc());
			
ps.setDouble(5, f.getFoodPrice());
			
ps.setString(6, f.getImage());
			
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
	
return false;
	
}

	

@Override
	
public boolean updateFood(Food f) 
{
		
try {
			
Connection con=DButility.getconnect();
			
String sql="update food set foodName=?,foodType=?,foodCategory=?"
+ ",foodDesc=?, foodPrice=?,image=? where foodId=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setString(1,f.getFoodName());
			
ps.setString(2,f.getFoodType());
			
ps.setString(3,f.getFoodCatagory());
			
ps.setString(4,f.getFoodDesc());
			
ps.setDouble(5,f.getFoodPrice());
			
ps.setString(6, f.getImage());
			
ps.setInt(7,f.getFoodId());
			
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
	
public boolean deleteFood(int foodId) 
{
		
try {
			
Connection con=DButility.getconnect();
			
String sql="delete from food where  foodId=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setInt(1,foodId);
			
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
	
public Food searchFood(int foodId) 
{
		
Food f1=null;
		
try {
			
Connection con=DButility.getconnect();
			
String sql="select * from food where foodId=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
		
			
ps.setInt(1,foodId);
			
ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
				
f1=new Food();
				
				
f1.setFoodId(rs.getInt(1));
				
f1.setFoodName(rs.getString(2));
				
f1.setFoodType(rs.getString(3));
				
f1.setFoodCatagory(rs.getString(4));
				
f1.setFoodDesc(rs.getString(5));
				
f1.setFoodPrice(rs.getDouble(6));
				
f1.setImage(rs.getString(7));
			
}
		
}
		
catch(Exception e)
		
{
e.printStackTrace();
		
}
			
		

// TODO Auto-generated method stub
		
return f1;//its returning beczo f1 having setFodid,setFoodname,setfoodtypoe etc
	
}

	

@Override
	
public List<Food> getAllFood() 
{
		
List<Food> l=new ArrayList<>();
		
try {
			
String sql="select * from food ";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
				
Food f=new Food();
				
f.setFoodId(rs.getInt(1));
				
f.setFoodName(rs.getString(2));
				
f.setFoodType(rs.getString(3));
				
f.setFoodCatagory(rs.getString(4));
				
f.setFoodDesc(rs.getString(5));
				
f.setFoodPrice(rs.getDouble(6));
				
f.setImage(rs.getString(7));
				
l.add(f);
			
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
	
public List<Food> searchFoodByName(String foodName) 
{
		
List<Food> l=new ArrayList<>();
		
try {
			
String sql="select * from food where foodName=?";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);
			
ps.setString(1, foodName);
			
ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
				
Food f=new Food();
				
f.setFoodId(rs.getInt(1));
				
f.setFoodName(rs.getString(2));
				
f.setFoodType(rs.getString(3));
				
f.setFoodCatagory(rs.getString(4));
				
f.setFoodDesc(rs.getString(5));
				
f.setFoodPrice(rs.getDouble(6));
				
f.setImage(rs.getString(7));
				
l.add(f);
			
}
			
		
}
		
catch(Exception e)
		
{
			
e.printStackTrace();
		
}
		

// TODO Auto-generated method stub
		
return l;
		
// TODO Auto-generated method stub
		
	
}

	

@Override
	
public List<Food> seatchFoodByCategory(String Category) 
{
		
List<Food> l=new ArrayList<>();
		
try {
			
String sql="select * from food where foodCategory=?";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);
			
ps.setString(1, Category);
			
ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
Food f=new Food();
				
f.setFoodId(rs.getInt(1));
				
f.setFoodName(rs.getString(2));
				
f.setFoodType(rs.getString(3));
				
f.setFoodCatagory(rs.getString(4));
				
f.setFoodDesc(rs.getString(5));
				
f.setFoodPrice(rs.getDouble(6));
				
f.setImage(rs.getString(7));
				
l.add(f);
			
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

public boolean addFeedback(Feedback foodback) {
	// TODO Auto-generated method stub
	try {
		Connection con=DButility.getconnect();
		
		String sql="insert into Feedback(custName,emailId,review)values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, foodback.getCustName());
		ps.setString(2, foodback.getEmailId());
		ps.setString(3, foodback.getReview());
		
		int i=ps.executeUpdate();
		
		if(i>0)
					
		{
						
		return true;
					
		}
					
		else
					
		{
						
		return false;
					
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		


	return false;
}


@Override

public List<Feedback> getAllFeedback() {
	
	List<Feedback> l=new ArrayList<>();		
	try {
		String sql="select * from feedback ";
		
		Connection con=DButility.getconnect();
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
					
		{
			Feedback fb=new Feedback();
			fb.setFeedbackId(rs.getInt(1));
			fb.setCustName(rs.getString(2));
			fb.setEmailId(rs.getString(3));
			fb.setReview(rs.getString(4));
			l.add(fb);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return l;
}







}



