<%@ page language="java" import="com.foodPlaza.Pojo.Cart,java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<%
	List<Cart> cartList = (List) session.getAttribute("clist");
	//out.println(cartList);
	%>
	<form action="order" method="post">
		<table border="1">
			<caption>Cart List</caption>
			<tr>
				<th>FoodId</th>
				<th>CartId</th>
				<th>FoodPrice</th>
				<th>FoodQuantity</th>
				<th>Email</th>
				<th>TotalPrice</th>
				<th>FoodName</th>
				<th>action</th>
				</tr>

				<% Iterator<Cart> it=cartList.iterator();
                   while(it.hasNext()){
	
	               Cart cart=it.next();


%>
			
			<tr>
				<td><%=cart.getFoodId()%></td>
				<td><%=cart.getCartId()%></td>
				<td><%=cart.getFoodPrice()%></td>
				<td><%=cart.getFoodQuanty()%></td>
				<td><%=cart.getEmailId()%></td>
				<td><%=cart.getTotalPrice()%></td>
				<td><%=cart.getFoodName()%></td>
				<td><a href="cart?action=delete&cartId=<%=cart.getCartId()%>">delete</a></td>
				<%
				}
				%>
				<jsp:include page="Footer.jsp"></jsp:include>
			</tr>
		</table>
		<input type="submit" value="Place Order">
	</form>
</body>
</html>