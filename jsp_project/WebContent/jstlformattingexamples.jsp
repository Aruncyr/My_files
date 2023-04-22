<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>9 Formatting tags examples.</title>
</head>
<body>

	 <h3>The fmt:parseNumber tag example is:</h3>
	<c:set var="Amount" value="786.970" />
	<fmt:parseNumber var="j" type="number" value="${Amount}" />
	<p><i>Amount is:</i>
	<c:out value="${j}" />
	</p>
	 <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p> 
    
     
</body>
</html>