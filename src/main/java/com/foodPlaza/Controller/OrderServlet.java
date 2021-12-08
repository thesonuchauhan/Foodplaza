package com.foodPlaza.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodPlaza.Dao.CartDaoImpl;
import com.foodPlaza.Dao.OrderDaoImp;
import com.foodPlaza.Pojo.Order;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	OrderDaoImp odi=new OrderDaoImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 HttpSession session=req.getSession();
	 CartDaoImpl cdi=new CartDaoImpl();
	 String custEmailId=(String) session.getAttribute("user");
	 
	 Order order=odi.placeOrder(custEmailId);
	 System.out.println(order);
	}

}
