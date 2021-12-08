package com.foodPlaza.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodPlaza.Dao.LoginDaoImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	LoginDaoImpl ldi=new LoginDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		session.invalidate();
		resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String loginaction=req.getParameter("loginaction");
		String type=req.getParameter("type");
		String emailId=req.getParameter("username");
		String pass=req.getParameter("password");
		
		String newPass=req.getParameter("newpassword");
		
		if(loginaction!=null && loginaction.equals("login")) {
			if(type.equals("user")) {
				boolean b=ldi.userLogin(emailId, pass);
				if(b) {
					session.setAttribute("user", emailId);
					resp.sendRedirect("index.jsp");
				}
				else {
					resp.sendRedirect("Fail.jsp");
				}
			}
				if(type.equals("admin")) {
					boolean b=ldi.adminLogin(emailId, pass);
					if(b) {
						session.setAttribute("admin", emailId);
						resp.sendRedirect("index.jsp");
					}
					else {
						resp.sendRedirect("Fail.jsp");
					}
				}
				
		}
		String changepass=req.getParameter("changepass");
		if(changepass!=null && changepass.equals("Submit")) {
			if(type.equals("user")) {
				boolean b=ldi.userChangePassword(emailId, newPass);
				
				if(b) {
					resp.sendRedirect("Success.jsp");
				}
				else {
					resp.sendRedirect("Fail.jsp");
				}
			
			}
				if(type.equals("admin")) {
					boolean b=ldi.adminChangePassword(emailId, newPass);
					
					if(b) {
						resp.sendRedirect("Success.jsp");
					}
					else {
						resp.sendRedirect("Fail.jsp");
					}
				
				}
				}
				
		}
		
	
	}

