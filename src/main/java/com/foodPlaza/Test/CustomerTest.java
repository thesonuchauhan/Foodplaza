package com.foodPlaza.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodPlaza.Dao.CustomerDaoImpl;
import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Food;

public class CustomerTest {
	public static void main(String args[])
	{
		CustomerDaoImpl cdao=new CustomerDaoImpl();
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.add customer Name");
		System.out.println("2.Delete Food");
		System.out.println("3.Update ");
		System.out.println("4.showAll customer");
		System.out.println("5.Search By mail id");
		

		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("enter the customer name ");
				String custName=sc.next();
				System.out.println("enter the customer emailId");
				String emailId=sc.next();
				System.out.println("enter customer password");
				String custPassword=sc.next();
				System.out.println("enter customer address");
				String custAddress=sc.next();
				System.out.println("enter customer contact number");
				String contactNo=sc.next();
				System.out.println("enter custLocation");
				String custLocaton=sc.next();
				
				Customer c1=new Customer(custName, emailId, custPassword, 
						custAddress, contactNo,custLocaton);
							boolean b=cdao.addCustomer(c1);
				if(b)
				{
					System.out.println("customer added succesfully");
				}
				else
				{
					System.out.println("customer not inserted");
				}
				break;
		case 2:
			System.out.println("enter email Id you want to delet");
			 emailId=sc.next();
			boolean b1=cdao.deleteCustomer(emailId);
			if(b1)
			{System.out.println("delete succesfyly");
			}
			else
			{
				System.out.println("not deleted");
			}
			
			
			
			break;
		case 3:
			System.out.println("enter existing email id for update");
			 emailId=sc.next();
				System.out.println("enter customer name");
			   custName=sc.next();
			System.out.println("enter customer password");
			  custPassword=sc.next();
			System.out.println("enter customer address");
			 custAddress=sc.next();
			System.out.println("enter contactNo");
			 contactNo=sc.next();
			System.out.println("enter customer location");
			 custLocaton=sc.next();
			 
			c.setEmailId(emailId);
			c.setCustName(custName);
			c.setCustPassword(custPassword);
			c.setCustAddress(custAddress);
			c.setContactNo(contactNo);
			c.setCustLocaton(custLocaton);
				
			
			b=cdao.updateCustomer(c);
			if(b)
			{
				System.out.println("update");
			}
			else
			{	System.out.println("not update");
			}
				break;
				
				
		case 4:
			
			List<Customer> l=cdao.getAllCustomer();
			if(l!=null) {
			Iterator<Customer> it=l.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			}
			
			
			break;
		case 5:
			
		System.out.println("enter existing email id");
		emailId=sc.next();
		Customer c3=cdao.searchByEmailid(emailId);
		if(c3!=null)
		{
			System.out.println(c3);
		}
		else
		{
			System.out.println("emailid is not availble");
		}
			
				
				default: System.out.println("invalid input");
}
	}
}
