<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--this is an extension file for index2 set & get property example.  -->
	<jsp:useBean id="u" class="com.test.jsp.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />

	Record:
	<br>
	<jsp:getProperty property="name" name="u" /><br>
	<jsp:getProperty property="password" name="u" /><br>
	<jsp:getProperty property="email" name="u" /><br>
</body>
</html>