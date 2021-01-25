<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Response</title>
</head>
<body>
<!-- Check for null entries: -->
	<%
	if(request.getParameter("firstname") == null || request.getParameter("firstname").equals(""))
	{
	request.setAttribute("message", "No first name entered.");
	request.setAttribute("path", "TestForm.jsp");
	request.getRequestDispatcher("TestError.jsp").forward(request, response);
	}
	%>
	<%
if(request.getParameter("lastname") == null || request.getParameter("lastname").equals(""))
	{
	request.setAttribute("message", "No last name entered.");
	request.setAttribute("path", "TestForm.jsp");
	request.getRequestDispatcher("TestError.jsp").forward(request, response);
	}
	%>
<p>First name: <%=request.getParameter("firstname") %></p>
<p>Last name: <%=request.getParameter("lastname") %></p>

</body>
</html>