<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List</title>
</head>
<body>
<h1>Product Management System</h1>
<br>
<h2>We have following Products for Sell</h2>
	<table border="1">
	<tr>
		<th align="left">product_id</th>
		<th align="left">product_name</th>
		<th align="left">product_price</th>
		<th align="left">product_qty</th>
	</tr>
	<c:forEach var="prod"  items="${myproductlist}">
		<tr>
			<td> ${prod.product_id}</td>
			<td> ${prod.product_name}</td>
			<td> ${prod.product_price}</td>
			<td> ${prod.product_qty}</td>
			<td><a href="update.do?id=${prod.product_id}">Edit</a>
			<td><a href="delete.do?id=${prod.product_id}">Delete</a>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="Home.jsp">Go Home</a>
</body>
</html>



