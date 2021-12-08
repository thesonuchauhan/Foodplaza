package com.foodPlaza.Dao;


import java.util.List;


import com.foodPlaza.Pojo.Customer;

import com.foodPlaza.Pojo.Food;


public interface Customer_20890 
{
	
boolean addCustomer(Customer c);
	
boolean updateCustomer(Customer c1);
	
boolean deleteCustomer(String emailId);
	
Customer  searchByEmailid(String emailId);
	
List<Customer> getAllCustomer();
	
	
	

}
