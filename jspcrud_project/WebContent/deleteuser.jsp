<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.cyr.dao.UserDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete User</title>
</head>
<body>
	<jsp:useBean id="u" class="com.cyr.model.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />
	<%
		UserDao.delete(u);
		response.sendRedirect("viewusers.jsp");
	%>
</body>
</html>