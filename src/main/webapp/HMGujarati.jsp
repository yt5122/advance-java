<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="HMPlaceorderServlet">
	
		BhindaMasala
		<input type="checkbox" name="choice" value ="BhindaMasala"/> 130
		<br>
		
		Roti
		<input type="checkbox" name="choice" value ="Roti"/> 30
		<br>
		
		Papad
		<input type="checkbox" name="choice" value ="Papad"/> 20
		<br>
	
		SevTomato
		<input type="checkbox" name="choice" value ="SevTomato"/> 160
		<br>
		
		MasalaChaas
		<input type="checkbox" name="choice" value ="MasalaChaas"/> 25
		<br>
		
		MasalaKhichdi
		<input type="checkbox" name="choice" value ="MasalaKhichdi"/> 110
		<br>
		
		<input type="submit" value ="PlaceOrder">
	
	</form>



</body>
</html>