package com.foodPlaza.Dao;


import java.util.List;

import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Order;
import com.foodPlaza.Utility.DButility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
public class OrderDaoImp implements OrderDao{

	@Override
	public Order placeOrder(String emailId) {
		
		Order order=null;
		
		String date=new Date().toString();
		double subt=0 ;
		try
		{
			Connection con=DButility.getconnect();
			String subtotal="select sum(totalPrice) as subtotal from cart where email=?";
			PreparedStatement ps=con.prepareStatement(subtotal);
			ps.setString(1, emailId);
			ResultSet  rs=ps.executeQuery();
			if(rs.next())
			{
				subt=rs.getDouble("subtotal");
			}
			if(subt>0)
			{
				String ins="insert into orders (orderDate,totalBill,email)values(?,?,?)";
				PreparedStatement ps1=con.prepareStatement(ins);
				ps1.setString(1,date);
				ps1.setDouble(2,subt);
				ps1.setString(3,emailId);
				
				int i=ps1.executeUpdate();
				if(i>0)
				{
					String sql_2="select * from orders where email=? and date=?";
					PreparedStatement ps2=con.prepareStatement(sql_2);
					ps2.setString(1, emailId);
					ps2.setString(2, date);
					ResultSet rs1=ps2.executeQuery();
					if(rs1.next()) {
						order=new Order();
						order.setOrderId(rs1.getInt(1));
						order.setOrderDate(rs.getString(2));
						order.setTotalBill(rs1.getDouble(3));
						order.setEmailId(rs.getString(4));
					}
				}
				
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			

		
		
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public Order showOrder(String emailId)
	{
		Order o=null;
		try {
			String sql="select * from orders where email=?";
			Connection con=DButility.getconnect();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, emailId);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			o=new Order();
			o.setOrderId(rs.getInt(1));
				o.setOrderDate(rs.getString(2));
				
				o.setEmailId(rs.getString(4));
				o.setTotalBill(rs.getDouble(3));
				
			
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub
		return o;
	}

	@Override
	public List<Order> showAllOrder() {
		List<Order> l=new ArrayList<>();
		try {
			String sql="select * from orders";
			Connection con=DButility.getconnect();
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Order o=new Order();
				o.setOrderId(rs.getInt(1));
				o.setOrderDate(rs.getString(2));
				
				o.setEmailId(rs.getString(4));
				o.setTotalBill(rs.getDouble(3));
				l.add(o);
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
	public boolean deleteByOrderId(int orderId) {
		
		try {
			String sql="delete from orders where orderId=?";
			Connection con=DButility.getconnect();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, orderId);
			
			int result=ps.executeUpdate(); 
			
			if(result>0) {
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

	
	

}
