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

import com.foodPlaza.Dao.CartDaoImpl;
import com.foodPlaza.Pojo.Cart;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	CartDaoImpl cdi=new CartDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		String action=req.getParameter("action");
		if(action!=null && action.equals("delete")) {
			int id=Integer.parseInt(req.getParameter("cartId"));
			boolean b=cdi.deletCart(id);
			if(b) {
				resp.sendRedirect("Success.jsp");
			}
			else
			{
				resp.sendRedirect("Fail.jsp");
			}
		}
		else {
		String emailid=(String) session.getAttribute("user");
		List<Cart> cartList=cdi.showCart(emailid);
		//out.println(cartList);
		if(cartList!=null && !(cartList.isEmpty())) {
			session.setAttribute("clist", cartList);
			resp.sendRedirect("cartList.jsp");
		}
		else {
			resp.sendRedirect("Fail.jsp");
		}
		
		
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String addcart=req.getParameter("addcart");
		
		if(addcart!=null && addcart.equals("Save")) {
		int foodid=Integer.parseInt(req.getParameter("foodid"));
		String foodname=req.getParameter("foodname");
		String email=req.getParameter("email");
		int foodquantity=Integer.parseInt(req.getParameter("foodquantity"));
		double foodprice=Double.parseDouble(req.getParameter("foodprice"));
		double totalprice=Double.parseDouble(req.getParameter("totalprice"));
		
		/*out.println(foodid);
		out.println(foodname);
		out.println(email);
		out.println(foodquantity);
		out.println(foodprice);
		out.println(totalprice);
		*/
		
		Cart cart=new Cart(foodid,foodprice,foodquantity,email,foodname,totalprice);
		boolean b=cdi.addToCart(cart);
		
		if(b) {
			resp.sendRedirect("Success.jsp");
		}
		else {
			resp.sendRedirect("Fail.jsp");
		}
		}
		
	}

}
