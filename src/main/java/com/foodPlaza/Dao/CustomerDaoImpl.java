package com.foodPlaza.Dao;


import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;


import com.foodPlaza.Pojo.Customer;

import com.foodPlaza.Pojo.Food;

import com.foodPlaza.Utility.DButility;



public class CustomerDaoImpl implements Customer_20890 
{

	
@Override
	
public boolean addCustomer(Customer c) 
{
		
try {
			
Connection con=DButility.getconnect();
			
String sql="insert into customer(custName,emailId,custPassword,"
+ "custAddress,contactNo,custLocation)values(?,?,?,?,?,?)";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setString(1,c.getCustName());
			
ps.setString(2,c.getEmailId());
			
ps.setString(3,c.getCustPassword());
			
ps.setString(4,c.getCustAddress());
			
ps.setString(5, c.getContactNo());
			
ps.setString(6, c.getCustLocaton());
			
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
	
public boolean updateCustomer(Customer c1) 
{
		
try {
			
			
Connection con=DButility.getconnect();
			
String sql="update customer set custName=?,custPassword=?,"
+ "custAddress=?, contactNo=?,custLocation=? where emailId=?";
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ps.setString(1,c1.getCustName());
			
			
ps.setString(2,c1.getCustPassword());
			
ps.setString(3,c1.getCustAddress());
			
ps.setString(4, c1.getContactNo());
			
ps.setString(5,c1.getCustLocaton());
			
ps.setString(6, c1.getEmailId());
			
			
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
	
public boolean deleteCustomer(String emailId) 
{
		
try {
			
Connection con=DButility.getconnect();
			
String sql="delete from customer where  emailId=?";
			
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

	
@Override
	
public Customer searchByEmailid(String emailId) 
{
		
List<Customer> l=new ArrayList<>();
		
Customer c=null;
		
try {
			
String sql="select * from customer where emailId=?";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);
			
ps.setString(1, emailId);
			
ResultSet rs=ps.executeQuery();
		
if(rs.next())
			
{
			
c=new Customer();
				
c.setCustName(rs.getString(1));
				
c.setEmailId(rs.getString(2));
				
c.setCustPassword(rs.getString(3));
				
c.setCustAddress(rs.getString(4));
				
c.setContactNo(rs.getString(5));
				
c.setCustLocaton(rs.getString(6));
				
			
			
}	
		
}
		
catch(Exception e)
		
{
			
e.printStackTrace();
		
}
		
		
// TODO Auto-generated method stub
		
return c;
	
}

	
@Override
	
public List<Customer> getAllCustomer() 
{
		
List<Customer> l=new ArrayList<>();
		
try {
			
String sql="select * from customer";
			
Connection con=DButility.getconnect();
			
PreparedStatement ps=con.prepareStatement(sql);
			
			
ResultSet rs=ps.executeQuery();
			
while(rs.next())
			
{
				
Customer c=new Customer();
				
c.setCustName(rs.getString(1));
				
c.setEmailId(rs.getString(2));
				
				
c.setCustPassword(rs.getString(3));
				
c.setCustAddress(rs.getString(4));
				
c.setContactNo(rs.getString(5));
				
c.setCustLocaton(rs.getString(6));
				
				
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
	


}
