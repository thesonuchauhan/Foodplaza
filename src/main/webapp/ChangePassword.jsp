<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation(){
	username=document.getElementById("uname").value
	if(username=="")
    {
		document.getElementById("unameerror").innerHTML="Enter the Username"
		return false
    }
	password=document.getElementById("pass").value
	if(password=="")
    {
		document.getElementById("passerror").innerHTML="Enter the Password"
		return false
    }
    newpassword=document.getElementById("newpass").value
	if(newpassword=="")
    {
		document.getElementById("newpasserror").innerHTML="Enter the New Password"
		return false
    }
    confirmpassword=document.getElementById("confirmpass").value
	if(confirmpassword=="")
    {
		document.getElementById("confirmpasserror").innerHTML="Enter the Confirm Password"
		return false
    }
	return true;
}
</script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<center>
<form action="login" onsubmit="return validation()" align="center" method="post">
<table align="center">
<caption><h2>Login Form</h2></caption>
<td>Select:</td>
<td><select name="type">
<option selected disabled>-----------Select---------</option>
<option value="admin">Admin</option>
<option value="user">User</option>
</select></td>
</tr>
<tr>
  <td>Username:</td>
  <td><input type="text" id="uname" name="username"></td>
  <td><span id="unameerror"style="color: red;"></span></td>
</tr> 

<tr>
  <td>Password:</td>
  <td><input type="text" id="pass" name="password"></td>
  <td><span id="passerror" style="color: red;"></span></td>
</tr> 

<tr>
  <td>New Password:</td>
  <td><input type="text" id="newpass" name="newpassword"></td>
  <td><span id="newpasserror" style="color: red;"></span></td>
</tr>  

<tr>
  <td>Confirm Password:</td>
  <td><input type="text" id="confirmpass" name="confirmpassword"></td>
  <td><span id="confirmpasserror" style="color: red;"></span></td>
</tr> 
</table>
<input type="submit" name="changepass" value="Submit">
</form>
</center>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>