<%@page import="com.foodPlaza.Dao.FoodDaoImpl" %>
<%@page import="com.foodPlaza.Pojo.Food" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation(){
	foodid=document.getElementById("foodid").value
	if(foodid==""){
		document.getElementById("foodi").innerHTML="Enter the food Id"
		return false
	}
	foodname=document.getElementById("foodname").value
	if(foodname==""){
		document.getElementById("foodn").innerHTML="Enter the food name"
		return false
	}
	foodtype=document.getElementById("foodtype").value
	if(foodtype==""){
		document.getElementById("foodt").innerHTML="Enter the food type"
		return false
	}
	foodcategory=document.getElementById("foodcategory").value
	if(foodcategory==""){
		document.getElementById("foodc").innerHTML="Enter the food category"
		return false
	}
	fooddescription=document.getElementById("fooddescription").value
	if(fooddescription==""){
		document.getElementById("fooddesc").innerHTML="Enter the food description"
		return false
	}
	foodimage=document.getElementById("foodimage").value
	if(foodimage==""){
		document.getElementById("foodimg").innerHTML="Enter the food image"
		return false
	}
	foodprice=document.getElementById("foodprice").value
	if(foodprice==""){
		document.getElementById("foodp").innerHTML="Enter the food price"
		return false
	}
	return true;
}
</script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<%int foodid=Integer.parseInt(request.getParameter("FoodId"));
  FoodDaoImpl fdi=new FoodDaoImpl();
  Food food=fdi.searchFood(foodid);
%>

<center>
<form action="food" onsubmit="return validation()" method="post">
<table align="center">
<caption>
<h1>UpdateFood</h1>
</caption>
<tr>
<td>Food Id:</td>
<td><input type="text" placeholder="Enter Food Id" name="fid" id="foodid" value="<%=food.getFoodId() %>"></td>
<td><span id="foodi" style="color:red"></span></td>
</tr>
<tr>
<td>Food Name:</td>
<td><input type="text" placeholder="Enter Food Name" name="fname" id="foodname" value="<%=food.getFoodName() %>"></td>
<td><span id="foodn" style="color:red"></span></td>
</tr>
<tr>
<td>Food Type:</td>
<td><input type="text" placeholder="Enter Food Type" name="ftype" id="foodtype" value="<%=food.getFoodType() %>"></td>
<td><span id="foodt" style="color:red"></span></td>
</tr>
<tr>
<td>Food Category:</td>
<td><input type="text" placeholder="Enter Food category" name="fcategory" id="foodcategory" value="<%=food.getFoodCatagory() %>"></td>
<td><span id="foodc" style="color:red"></span></td>
</tr>
<tr>
<td>Food Description:</td>
<td><input type="text"placeholder="Enter Food Description" name="fdesc" id="fooddescription" value="<%=food.getFoodDesc() %>"></td>
<td><span id="fooddesc" style="color:red"></span></td>
</tr>
<tr>
<td>Food Image:</td>
<td><input type="text" placeholder="Enter Food image" name="fimage" id="foodimage" value="<%=food.getImage() %>"></td>
<td><span id="foodimg" style="color:red"></span></td>
</tr>
<tr>
<td>Food Price:</td>
<td><input type="text" placeholder="Enter Food price" name="fprice" id="foodprice" value="<%=food.getFoodPrice() %>"></td>
<td><span id="foodp" style="color:red"></span></td>
</tr>
</table>
<input type="submit" name="updatefood" value="Submit">
</form>
</center>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>