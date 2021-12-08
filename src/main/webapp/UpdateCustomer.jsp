<%@page import="com.foodPlaza.Dao.CustomerDaoImpl" %>
<%@page import="com.foodPlaza.Pojo.Customer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation(){
	
	
	customername=document.getElementById("custname").value
	if(customername==""){
		document.getElementById("custnameerror").innerHTML="Enter the Customer Name"
		return false
	}
	
	emailid=document.getElementById("emailid").value
	if(emailid==""){
		document.getElementById("emailiderror").innerHTML="Enter the Email Id"
		return false
	}
	
	password=document.getElementById("password").value
	if(password==""){
		document.getElementById("passerror").innerHTML="Enter the Password"
		return false
	}
	
	address=document.getElementById("address").value
	if(address==""){
		document.getElementById("addresserror").innerHTML="Enter the Address"
		return false
	}
	
	contactno=document.getElementById("contactno").value
	if(contactno==""){
		document.getElementById("contacterror").innerHTML="Enter the Contact No"
		return false
	}
	
	location=document.getElementById("location").value
	if(location==""){
		document.getElementById("locationerror").innerHTML="Enter the location"
		return false
	}
	
	
	return true;
}
</script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<% String email=request.getParameter("CustEmailId");
  CustomerDaoImpl cid=new CustomerDaoImpl();
  Customer cust=cid.searchByEmailid(email);
%>
<center>
<form action="Customer" onsubmit="return validation()"  method="post">
<table align="center">
<caption><h2>Update Customer</h2></caption>

<tr>
  <td>Customer Name:</td>
  <td><input type="text" id="custname" placeholder="Enter Customer Name" name="Custname" value="<%=cust.getCustName() %>"></td>
  <td><span id="custnameerror" style="color: red;"></span></td>
</tr>

<tr>
  <td>Email Id:</td>
  <td><input type="text" id="emailid" placeholder="Enter Email" name="Custemail"  value="<%=cust.getEmailId() %>"></td>
  <td><span id="emailiderror" style="color: red;"></span></td>
</tr>

<tr>
  <td>Password:</td>
  <td><input type="text" id="password" placeholder="Enter Password" name="Custpassword"  value="<%=cust.getCustPassword() %>"></td>
  <td><span id="passerror" style="color: red;"></span></td>
</tr>
<tr>
  <td>Address:</td>
  <td><input type="text" id="address" placeholder="Enter Address" name="Custaddress"  value="<%=cust.getCustAddress() %>"></td>
  <td><span id="addresserror" style="color: red;"></span></td>
</tr>

<tr>
  <td>Contact No:</td>
  <td><input type="text" id="contactno" placeholder="Enter Contact Number" name="Custcontactno"  value="<%=cust.getContactNo() %>"></td>
  <td><span id="contacterror" style="color: red;"></span></td>
</tr>


<tr>
  <td>location:</td>
  <td><input type="text" id="location" placeholder="Enter location" name="Custlocation" value=<%=cust.getCustLocaton() %>></td>
  <td><span id="locationerror" style="color: red;"></span></td>
</tr>
</table>
<input type="submit" name="updateCustomer" value="Submit">

</form>
</center>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>