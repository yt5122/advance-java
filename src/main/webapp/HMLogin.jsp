<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="HMLoginServlet">
	
		Email = <input type = "text" name = "Email"/><br>
		Password = <input type = "password" = name = "Password"/><br>
		<input type = "submit" name = "Login"/>	
	
	
	</form>
<br>
${msg}
</body>
</html>