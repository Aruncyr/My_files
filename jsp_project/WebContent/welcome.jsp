<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--these lines are for jsp request example.  -->
	<%-- <%
		String name = request.getParameter("uname");
		out.print("welcome " + name);
	%> --%>

	<!--these lines are jsp response example.  -->
	<%-- <%
		response.sendRedirect("http://www.google.com");
	%> --%>

	<!--these lines are for jsp config example.  -->
	<%-- <%
		out.print("Welcome " + request.getParameter("uname"));

		String driver = config.getInitParameter("dName");
		out.print(" driver name is= " + driver);
	%>  --%>

	<!--these lines for session example.  -->

	<%-- <%
		String name = request.getParameter("uname");
		out.print("Welcome " + name);

		session.setAttribute("user", name);
	%>

	<br><a href="second.jsp">second jsp page</a> --%>

	<!--these lines are for pagecontext example.  -->

	<%
		String name = request.getParameter("uname");
		out.print("Welcome " + name);

		pageContext.setAttribute("user", name, pageContext.SESSION_SCOPE);
	%>
	<a href="second.jsp">second jsp page</a>
</body>
</html>