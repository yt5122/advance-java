<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddServlet">
			N1 : <input type="number" name="n1"><br> 
			N2 : <input	type="number" name="n2"><br> 
			
			Addition <input type="radio" name="operation" value="+"><br>
			Subtraction  <input type="radio" name="operation" value="-"><br>
			Multiplication <input type="radio" name="operation" value="*"><br>
			Division  <input type="radio" name="operation" value="/"><br>
			
			
			
			
			<input type="submit" value="Addition"/>
</body>
</html>