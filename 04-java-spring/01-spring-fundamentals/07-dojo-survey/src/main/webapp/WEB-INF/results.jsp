<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h2>Submitted Info</h2>
	<ul>
		<c:set var="results" value="${ results }" />
		<li><c:out value="${ results.getName() }" /></li>
		<li><c:out value="${ results.getLocation() }" /></li>
		<li><c:out value="${ results.getLanguage() }" /></li>
		<li><c:out value="${ results.getComment() }" /></li>
	</ul>
</body>
</html>