package com.foodPlaza.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodPlaza.Dao.FoodDaoImpl;
import com.foodPlaza.Pojo.Food;

@WebServlet("/food")
public class FoodServlet extends HttpServlet{
	
	FoodDaoImpl fdi=new FoodDaoImpl();
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession();
	PrintWriter out=resp.getWriter();
	
	String action=req.getParameter("action");
	if(action!=null && action.equals("delete")) {
		int id=Integer.parseInt(req.getParameter("foodid"));
		boolean b=fdi.deleteFood(id);
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else
		{
			resp.sendRedirect("Fail.jsp");
		}
	}
	else {
			List<Food> foodList=fdi.getAllFood();
	  //System.out.println(foodList);
	  if(foodList!=null && !(foodList.isEmpty())) {
		 session.setAttribute("flist", foodList);
		 resp.sendRedirect("FoodList.jsp");
	  }
	}
}
  
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String addfood=req.getParameter("addfood");
		String updatefood=req.getParameter("updatefood");
		
		if(addfood!=null && addfood.equals("Save")) {
		String fname=req.getParameter("fname");
		String ftype=req.getParameter("ftype");
		String fcategory=req.getParameter("fcategory");
		String fdesc=req.getParameter("fdesc");
	    String fimage=req.getParameter("fimage");
	    double fprice=Double.parseDouble(req.getParameter("fprice"));

	    
		Food food=new Food(fname,ftype,fcategory,fdesc,fprice,fimage);
		boolean b=fdi.addFood(food);
		
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("Fail.jsp");
		}
		}
		
		if(updatefood!=null && updatefood.equals("Submit")) {
			int fid=Integer.parseInt(req.getParameter("fid"));
			String fname=req.getParameter("fname");
			String ftype=req.getParameter("ftype");
			String fcategory=req.getParameter("fcategory");
			String fdesc=req.getParameter("fdesc");
		    String fimage=req.getParameter("fimage");
		    double fprice=Double.parseDouble(req.getParameter("fprice"));
			
			
			Food f1=new Food(fname,ftype,fcategory,fdesc,fprice,fimage);
			f1.setFoodId(fid);
			boolean b=fdi.updateFood(f1);
			
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("Fail.jsp");
			}
		
		
		
		
		}
	}
  }
