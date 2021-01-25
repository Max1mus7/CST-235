<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Form</title>
</head>
<body>
<p>
	<form method="post" action="TestResponse.jsp">
	<label for="firstname">First Name: </label>
	<input type="text" id="firstname" name="firstname"/>
	<p></p>
	<label for="lastname">Last Name: </label>
	<input type="text" id="lastname" name="lastname"/>
	
	<p><input type="submit" name="submitted" value="Submit Query"></p>
	</form>
</body>
</html>