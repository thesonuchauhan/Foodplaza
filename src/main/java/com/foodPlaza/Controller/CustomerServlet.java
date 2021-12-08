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

import com.foodPlaza.Dao.CustomerDaoImpl;
import com.foodPlaza.Pojo.Customer;
import com.foodPlaza.Pojo.Food;

@WebServlet("/Customer")
public class CustomerServlet extends HttpServlet {
	CustomerDaoImpl cid=new CustomerDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		String action=req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			String email=req.getParameter("CustEmailId");
			boolean b=cid.deleteCustomer(email);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else
			{
				resp.sendRedirect("Fail.jsp");
			}
		}
		else {
	    List<Customer> custList=cid.getAllCustomer();
	    //out.println(custList);
	    if(custList!=null && !(custList.isEmpty())) {
			 session.setAttribute("custlist", custList);
			 resp.sendRedirect("CustomerList.jsp");
		  }
	}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String addCustomer=req.getParameter("addCustomer");
		String updateCustomer=req.getParameter("updateCustomer");
	
		if(addCustomer!=null && addCustomer.equals("Save")) {
		String Custname=req.getParameter("Custname");
		String Custemail=req.getParameter("Custemail");
		String Custpassword=req.getParameter("Custpassword");
		String Custcontactno=req.getParameter("Custcontactno");
		String Custaddress=req.getParameter("Custaddress");
		String Custlocation=req.getParameter("Custlocation");
		
	/*	out.println(Custname);
		out.println(Custemail);
		out.println(Custpassword);
		out.println(Custcontactno);
		out.println(Custaddress);
		out.println(Custlocation);
		*/
		Customer customer=new Customer(Custname,Custemail,Custpassword,Custcontactno,Custaddress,Custlocation);
		boolean b=cid.addCustomer(customer);
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("fail.jsp");
		}
		}
		
		if(updateCustomer!=null && updateCustomer.equals("Submit")) {
			
			String Custname=req.getParameter("Custname");
			String Custemail=req.getParameter("Custemail");
			String Custpassword=req.getParameter("Custpassword");
			String Custcontactno=req.getParameter("Custcontactno");
			String Custaddress=req.getParameter("Custaddress");
			String Custlocation=req.getParameter("Custlocation");
			
			Customer customer=new Customer(Custname,Custemail,Custpassword,Custcontactno,Custaddress,Custlocation);
			boolean b=cid.updateCustomer(customer);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else {
				resp.sendRedirect("Fail.jsp");
			}
			}
	
	}

	}

