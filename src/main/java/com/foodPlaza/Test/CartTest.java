package com.foodPlaza.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.foodPlaza.Dao.CartDaoImpl;
import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Pojo.Cart;
import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Food;

public class CartTest {
public static void main(String args[])

{int choice;
	do {
	CartDaoImpl crdao=new CartDaoImpl();
	Cart c=new Cart();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice");
	System.out.println("1.add CartName");
	System.out.println("2.Delete Cart");
	
	System.out.println("3.showAll Cart");
	System.out.println("4.clear cart");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		 System.out.println("enter food Id");
			int foodId=sc.nextInt();
			System.out.println("enter the food price");
			Double foodPrice=sc.nextDouble();
			System.out.println("enter food Quantity");
			int foodQuanty=sc.nextInt();
			System.out.println("enter emailId");
			String emailId=sc.next();
			System.out.println("enter food name");
			String foodName=sc.next();
			System.out.println("enter totalPrice");
			Double totalPrice=sc.nextDouble();
			
			Cart c1=new Cart( foodId,  foodPrice, foodQuanty,  emailId,foodName,totalPrice);
						boolean b=crdao.addToCart(c1);
			if(b)
			{
				System.out.println("food added succesfully");
			}
			else
			{
				System.out.println("food not insert");
			}
			break;
			
	case 2:
		System.out.println("enter cart id for deletion");
		
		int cartId=sc.nextInt();
		boolean b1=crdao.deletCart(cartId);
		if(b1)
		{System.out.println("delete succesfyly");
		}
		else
		{
			System.out.println("not deleted");
			
		}
		break;
		
	case 3:
		System.out.println("enter emailId to show cart");
		emailId=sc.next();
		List<Cart> l=crdao.showCart(emailId);
		if(l!=null) {
		Iterator<Cart> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
		
		
		break;
	case 4:
		System.out.println("enter emailid to clear cart");
		emailId=sc.next();
		boolean b5=crdao.clearCart(emailId);
		if(b5)
		{
			System.out.println("clear succesfully");
		}
		else
		{
			System.out.println("unsucfull");
		}
		break;
		default : System.out.println("invalid output");
	}	}
	while(choice!=0)	 ;
		
}
	}

