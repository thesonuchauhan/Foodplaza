<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<center>
<form action="feedback" method="post">
<table>
<caption>Add Feedback</caption>
<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>
<td>Email Id</td>
<td><input type="text" name="email"></td>
</tr>
<td>Review</td>
<td><input type="text" name="review"></td>
</tr>

</table>
<input type="submit" name="addfeedback" value="FeedBack">

</form>
</center>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>