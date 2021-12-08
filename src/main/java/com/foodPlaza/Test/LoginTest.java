package com.foodPlaza.Test;

import java.util.Scanner;

import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Dao.LoginDaoImpl;
import com.foodPlaza.Pojo.AdminLogin;
import com.foodPlaza.Pojo.Food;

public class LoginTest {
public static void main(String args[])
{
	LoginDaoImpl ldao=new LoginDaoImpl();
	AdminLogin a=new AdminLogin();
	while(true)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice");
	System.out.println("1.User Login");
	System.out.println("2.User change Password");
	System.out.println("3.Admin Login ");
	System.out.println("4.Admi Change Password");
	
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1: System.out.println("enter emailid of customer ");
			String emailId=sc.next();
			System.out.println("enter Customer password");
			String custPassword=sc.next();
			
			
			AdminLogin a1=new AdminLogin();
						boolean b=ldao.userLogin(emailId,custPassword);
			if(b)
			{
				System.out.println("login  succsfully");
			}
			else
			{
				System.out.println("not changed");
			}
			break;
	case 2:
		System.out.println("enter  existing customer user name");
		String customerName=sc.next();
		System.out.println("enter new password");
		String password=sc.next();
		boolean b1=ldao.userChangePassword(customerName,password);
		if(b1)
		{
			System.out.println("updated succesfuly");
			
		}
		else 
		{System.out.println("not updated");
		}
		break;
		
		
	case  3:System.out.println("enter admin user name");
	 String adminName1=sc.next();
			System.out.println("enter admin password");
			String adminPassword2=sc.next();
			boolean b3=ldao.adminLogin( adminName1, adminPassword2);
			if(b3)
			{
				System.out.println("succesul");
				
			}
			else
			{
				System.out.println("unsucceful");
			}
			break;
			
			
			case 4:
				System.out.println("enter admin user name");
				adminName1=sc.next();
				System.out.println("enter password to change");
				adminPassword2=sc.next();
				boolean b2=ldao.adminChangePassword(adminName1, adminPassword2);
				if(b2)
				{
					System.out.println("password changes succesfully");
				}
				else
				{
					System.out.println("password not chanfge ");
				}
				
				break;
			default : System.out.println("invalid input");				
}
}
}

}