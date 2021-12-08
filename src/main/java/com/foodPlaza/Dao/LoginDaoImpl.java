package com.foodPlaza.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Utility.DButility;

public class LoginDaoImpl implements LoginDao{
	

	@Override
	public boolean userLogin(String emailId, String CPassword) {

				try {
					Connection con=DButility.getconnect();
					String sql="select *from customer where emailId=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,emailId);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
							String pass=rs.getString("custPassword");//pass willl have the customertable passsword
					
					if(pass.equals(CPassword))
					{
						return true;
					
					}
					else 
					{
						return false;
					}
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
	public boolean userChangePassword(String custName, String newPassword) {
		
		try {
			Connection con=DButility.getconnect();
			String sql="update customer set custPassword=? where emailId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2,custName);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
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
	public boolean adminLogin(String adminName, String adminPassword) {
		try {
			Connection con=DButility.getconnect();
			String sql="select *from adminlogin where adminemailId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,adminName);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				String pass=rs.getString("adminpassword");
				if(pass.equals(adminPassword));
				return true;
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
	public boolean adminChangePassword(String adminUserName, String adminNewPassword) {
		String sql;
		try {
			sql="update adminlogin set adminpassword=? where adminemailId=?";
			Connection con=DButility.getconnect();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,adminNewPassword);
			ps.setString(2, adminUserName);
			int i=ps.executeUpdate();
			if(i>0)
			{
				return true;
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
