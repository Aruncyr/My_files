<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>14jstl core tags examples</title>
</head>
<body>
		<%--1st out example <c:out value="${'Welcome to javaTpoint'}" /> --%>
		
	<%-- 2nd import example <c:import var="webdata" url="http://www.google.com" />
	<c:out value="${webdata}" escapeXml="false" /> 
	--%>
	
	<%-- 3rd set example <c:set var="Income" scope="session" value="${4000*3 }"/>
	<c:out value="${Income}"/> --%>

	<%--4th remove example <c:set var="income" scope="session" value="${4000*4}" />
	<p>
		Before Remove Value is:
		<c:out value="${income}" />
	</p>
	<c:remove var="income" />
	<p>
		After Remove Value is:
		<c:out value="${income}" />
	</p> --%>

	<%--5th catch example <c:catch var="catchtheException">
		<%
			int x = 2 / 0;
		%>
	</c:catch>

	<c:if test="${catchtheException != null}">
		<p>
			The type of exception is : ${catchtheException} <br /> There is an
			exception: ${catchtheException.message}
		</p>
	</c:if> --%>

	<%--6th if example <c:set var="income" scope="session" value="${4000*4}" />
	<p>
		Your income is :
		<c:out value="${income}" />
	</p>
	<c:choose>
		<c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>
		<c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>
		<c:otherwise>  
       Income is undetermined...  
    </c:otherwise>
    </c:choose> --%>

		<%--7,8,9 choose,when,otherwise examples <c:set var="income" scope="session" value="${4000*4}" />
	<p>
		Your income is :
		<c:out value="${income}" />
	</p>
	<c:choose>
		<c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>
		<c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>
		<c:otherwise>  
       Income is undetermined...  
    </c:otherwise>
    </c:choose> --%>

	<%-- 10th forEach example <c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}" /><p>
	</c:forEach> --%>

	<%--11th forTokens example <c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">
		<c:out value="${name}" /><p>
	</c:forTokens> --%>

	<%-- 12th param example <c:url value="/index1.jsp" var="completeURL" >
	<c:param name="trackingId" value="786" />
	<c:param name="user" value="Nakul" />
	</c:url>${completeURL}  --%>

	<%--13th redirect example <c:set var="url" value="0" scope="request" />
	<c:if test="${url<1}">
		<c:redirect url="http://cyrtechnologies.com" />
	</c:if>
	<c:if test="${url>1}">
		<c:redirect url="http://facebook.com" />
	</c:if> --%>
	
	<c:url value="/process.jsp"/>  
</body>
</html>