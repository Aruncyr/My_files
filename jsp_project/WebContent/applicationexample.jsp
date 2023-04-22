<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--these lines are for jsp application implicit objects(we just replace config in string driver with application to get context for creating object for whole project.  -->
	 <%
		out.print("Welcome " + request.getParameter("uname"));

		String driver = application.getInitParameter("dName");
		out.print(" driver name is = " + driver);
	%> 
</body>
</html>