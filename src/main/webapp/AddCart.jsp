<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.foodPlaza.Dao.FoodDaoImpl" %>
<%@page import="com.foodPlaza.Pojo.Food" %>

    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<% int foodId=Integer.parseInt(request.getParameter("foodId"));
 FoodDaoImpl fdi=new FoodDaoImpl();
 Food food=fdi.searchFood(foodId);
 String custEmailId=(String)session.getAttribute("user");
 
%>
<center>
<form action="cart" method="post">
<table>
<caption>Cart</caption>

<tr>
<td>Food Id</td>
<td><input type="text" id="fid" name="foodid" value="<%=food.getFoodId() %>"></td>
</tr>

<tr>
<td>Food Name</td>
<td><input type="text" id="fname" name="foodname" value="<%=food.getFoodName() %>"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" id="emailid" name="email" value="<%= custEmailId %>"></td>
</tr>

<tr>
<td>Quantity</td>
<td><input type="text" id="fquantity" name="foodquantity"></td>
</tr>

<tr>
<td>Food Price</td>
<td><input type="text" id="fprice" name="foodprice" value="<%=food.getFoodPrice() %>"></td>
</tr>

<tr>
<td>Total Price</td>
<td><input type="text" id="Tprice" name="totalprice"></td>
</tr>

</table>
<input type="submit" name="addcart" value="Save">
</form>
</center>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>