<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${ allDrivers }" var="d">
		<h2>{ d.firstName } ${ d.lastName }</h2>
		<p>License Number: ${ d.license.getNumberAsString() }</p>
		<p>State: ${ d.license.state }</p>
		<p>Expiration Date: ${ d.license.getExpirationDateFormatted() }</p>
	</c:forEach>
</body>
</html>