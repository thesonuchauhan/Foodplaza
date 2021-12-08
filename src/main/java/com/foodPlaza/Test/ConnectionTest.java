package com.foodPlaza.Test;


import java.sql.Connection;

import com.foodPlaza.Utility.DButility;



public class ConnectionTest {
	public static void main(String[] args) {
		Connection con=DButility.getconnect();
		if(con!=null) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
