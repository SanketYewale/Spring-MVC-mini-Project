<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Entry</title>
</head>
<body>
<h1>Add New Product</h1>
<form:form method="post" modelAttribute="myproduct">
Product Id:<br>
<form:input path="product_id"/> <br><br>
Product Name:<br>
<form:input path="product_name"/> <br><br>
Product Price:<br><br>
<form:input path="product_price"/><br><br>
Product Quantity:<br><br>
<form:input path="product_qty"/><br><br>
<input type=submit value="Add Product"/>
</form:form>	
</body>
</html>







