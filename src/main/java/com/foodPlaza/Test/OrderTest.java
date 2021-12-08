package com.foodPlaza.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodPlaza.Dao.CustomerDaoImpl;
import com.foodPlaza.Dao.OrderDao;
import com.foodPlaza.Dao.OrderDaoImp;
import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Order;
import com.foodPlaza.Utility.DButility;

public class OrderTest {
public static void main(String args[])
{
	OrderDaoImp odao=new OrderDaoImp();
	Order o=new Order();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice");
	System.out.println("1.Place order");
	System.out.println("2.Show order");
	System.out.println("3.ShowAllOrder ");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: 
			System.out.println("enter emailid");
			String emailId=sc.next();
			Order b=odao.placeOrder( emailId);
			
			
			break;
			
	case 2:
			System.out.println("enter emailId");
			 emailId=sc.next();
			  o=odao.showOrder(emailId);
			System.out.println(o);
			break;
						
	case 3:
		List<Order>l=odao.showAllOrder();
		if(l!=null)
		{
			Iterator<Order>it=l.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
			 break;
			 
			default: System.out.println("invlalid input");
}
}
}













