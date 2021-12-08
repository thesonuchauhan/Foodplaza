<%@ page language="java" import="com.foodPlaza.Pojo.Food,java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String custEmailId=(String)session.getAttribute("user");
String adminEmailId=(String)session.getAttribute("admin"); %>
<jsp:include page="Header.jsp"></jsp:include>
<% List<Food> foodlist=(List)session.getAttribute("flist");
out.println(foodlist);
%>
<table border="1">
<caption>Food List</caption>
<tr>
<th>FoodId</th>
<th>FoodName</th>
<th>FoodType</th>
<th>FoodCategory</th>
<th>FoodDescription</th>
<th>FoodImage</th>
<th>FoodPrice</th>
<%if(adminEmailId!=null && custEmailId==null){ %>
<th colspan="2">action</th>
<%} %>
<%if(custEmailId!=null && adminEmailId==null){ %>
<th>Action</th>
<%} %>
</tr>

<% Iterator<Food> it=foodlist.iterator();
while(it.hasNext()){
	
	Food food=it.next();


%>
<tr>
<td><%=food.getFoodId() %></td>
<td><%=food.getFoodName() %></td>
<td><%=food.getFoodType() %></td>
<td><%=food.getFoodCatagory() %></td>
<td><%=food.getFoodDesc() %></td>
<td><%=food.getImage() %></td>
<td><%=food.getFoodPrice() %></td>
<%if(adminEmailId!=null && custEmailId==null){ %>
<td><a href="UpdateFood.jsp?FoodId=<%=food.getFoodId() %>">edit</a></td>
<td><a href="food?action=delete&foodid=<%= food.getFoodId() %>">delete</a></td>
<%} %>
<%if(custEmailId!=null && adminEmailId==null){ %>
<td><a href="AddCart.jsp?foodId=<%=food.getFoodId() %>">AddToCart</a></td>
<%} %>
<%} %>
</tr>
</table>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>