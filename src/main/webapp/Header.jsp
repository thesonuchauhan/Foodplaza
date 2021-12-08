<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% String custEmailId=(String)session.getAttribute("user");
String adminEmailId=(String)session.getAttribute("admin"); %>
<div id="templatemo_container">
	<div id="templatemo_header">
    	<div id="site_title"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_menu">
        <ul>
        <% if(custEmailId==null && adminEmailId==null){%>
        	<li class="current"><a href="index.jsp"><b>Home</b></a></li>
            <li><a href="food"><b>FoodList</b></a></li>
            <li><a href="AddCustomer.jsp"><b>Customer Registration</b></a></li>
            <li><a href="Login.jsp"><b>Login</b></a></li>
            <li><a href="Contact.jsp"><b>Contact Us</b></a></li>
        	
    <% } %>  
    
    <% if(custEmailId!=null && adminEmailId==null){%>
        	
            <li><a href="food"><b>FoodList</b></a></li>
            <li><a href="cart"><b>Cart List</b></a></li>
            <li><a href="ChangePassword.jsp"><b>Edit profile</b></a></li>
            <li><a href="Feedback.jsp"><b>AddFeedback</b></a></li>
            <li><a href="login"><b>Logout</b></a></li>
            <%} %>
            
       <%if(adminEmailId!=null && custEmailId==null){ %>
            <li><a href="AddFood.jsp"><b>Add Food</b></a></li>
            <li><a href="food"><b>FoodList</b></a></li>
            <li><a href="Customer"><b>Customer List</b></a></li>
            <li><a href="feedback"><b>FeedBackList</b></a></li>
            <li><a href="login"><b>Logout</b></a></li>
            <%} %>
        </ul>
    </div> <!-- end of menu -->
</body>
</html>