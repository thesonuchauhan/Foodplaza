/*if we will not make this class then every time for connectivity
 
*we have to write that registration and connectiibity line again and again in every class
 
*so we are making a single class which is having a sttatic method
 
*through which we will just write name of method in other classes.and it will called automatically*/
 



package com.foodPlaza.Utility;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class DButility 
{

public static Connection getconnect()
//we make this as a static

//becoz if not then every time we have to make object for calling becoz its static 

//so we need to write method name only 

{
	
Connection con=null;
//we have to write null here then only it will return
	
try
	{
		
Class.forName("com.mysql.jdbc.Driver");

con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplaza","root","root");
	
	
}
catch(ClassNotFoundException e)
	
{
		
e.printStackTrace();
		
	
}
	
catch(SQLException a)
	
{
		
a.printStackTrace();
	
}
	
return con;
	
		
	

}


/*public static void main(String args[])

{
System.nanoTime();
Connection con = DButility.getconnect();
//our method is returnin 
connection so we write like that Connection con
	
if(con!=null)
	
{
		
System.out.println("sucess");
	
}
	
else
	
{
		
System.out.println("fail");
	
}

}*/

//once u make main then run if it is success then remove main 

//
//we did just to know weather conneciotn is estblished or not

}
