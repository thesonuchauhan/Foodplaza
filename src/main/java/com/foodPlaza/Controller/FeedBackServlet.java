package com.foodPlaza.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Feedback;

@WebServlet("/feedback")
public class FeedBackServlet extends HttpServlet {
	FoodDaoImpl fdi=new FoodDaoImpl();
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   PrintWriter out=resp.getWriter();
	   List<Feedback> fbList=fdi.getAllFeedback();
	   out.println(fbList);
	   
}
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String custname=req.getParameter("name");
		String emailid=req.getParameter("email");
		String review=req.getParameter("review");
		
		/*out.println(custname);
		out.println(emailid);
		out.println(review);
		*/
		
		Feedback fb=new Feedback(custname,emailid,review);
		boolean b=fdi.addFeedback(fb);
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("Fail.jsp");
		}
	}
}
