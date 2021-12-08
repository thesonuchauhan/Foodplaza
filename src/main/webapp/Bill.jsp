<%@ page language="java" import="com.foodPlaza.Pojo.Order" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<% Order order=(Order)request.getAttribute("order"); %>
<h1>
OrdersId:&nbsp<%=order.getOrderId() %><br>
OrdersDate:&nbsp<%=order.getOrderDate() %><br>
EmailId:&nbsp<%=order.getEmailId() %><br>
TotalPrice:&nbsp<%=order.getTotalBill() %><br>
</h1>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>