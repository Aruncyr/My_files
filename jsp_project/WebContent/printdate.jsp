<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--this is an extension file for forward action tag without paramters. example(index2).  -->
	 <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %> 

	<!--these lines are for forward action tag with parameters.  -->
	<%-- <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>
	<%= request.getParameter("name") %> --%>
</body>
</html>