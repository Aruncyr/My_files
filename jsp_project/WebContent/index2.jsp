<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- this is an example for forward action tag without parameter. -->
	<%-- <h2>this is index page</h2>

	<jsp:forward page="printdate.jsp" /> --%>

	<!--these lines are for forward action tag with parameters.  -->
	<%-- <h2>this is index page</h2>

	<jsp:forward page="printdate.jsp">
		<jsp:param name="name" value="javatpoint.com" />
	</jsp:forward> --%>

	<!-- these lines are for include action example without parameters. -->
	<!-- for with paramteres we add parameter.  -->
	 <h2>this is index page</h2>

	<jsp:include page="printdate.jsp" />

	<h2>end section of index page</h2>
	
</body>
</html>