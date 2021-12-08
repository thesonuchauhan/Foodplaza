<%@ page language="java" import="com.foodPlaza.Pojo.Customer,java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<% List<Customer> custlist=(List)session.getAttribute("custlist");
out.println(custlist);


%>
<table border="1">
<caption>Customer List</caption>
<tr>
<th>CustomerName</th>
<th>CustomerEmail</th>
<th>CustomerPassword</th>
<th>CustomerAddress</th>
<th>CustomerContactNo</th>
<th>CustomerLocation</th>
<th colspan="2">action</th>
</tr>
<% Iterator<Customer> it=custlist.iterator();
while(it.hasNext()){
	
	Customer cust=it.next();


%>
<tr>
<td><%=cust.getCustName() %></td>
<td><%=cust.getEmailId() %></td>
<td><%=cust.getCustPassword() %></td>
<td><%=cust.getCustAddress() %></td>
<td><%=cust.getContactNo() %></td>
<td><%=cust.getCustLocaton()  %></td>
<td><a href="UpdateCustomer.jsp?CustEmailId=<%=cust.getEmailId() %>">edit</a>
<td><a href="Customer?action=delete&CustEmailId=<%= cust.getEmailId() %>">delete</a>
<%} %>
</tr>

</table>
<jsp:include page="Footer.jsp"></jsp:include> 
</body>
</html>