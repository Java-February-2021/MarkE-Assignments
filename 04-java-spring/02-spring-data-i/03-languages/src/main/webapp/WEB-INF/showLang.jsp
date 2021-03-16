<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${language.name}</title>
</head>
<body>
	<a href="/languages">dashboard</a>
	<h3><c:out value="${language.name}"/></h3>
	<p>Creator: <c:out value="${language.creator}"/></p>
	<p>Version: <c:out value="${language.version}"/></p>
	<a href="/languages/edit/${language.id}">Edit Language</a>
	<a href="/languages/delete/${language.id}">Delete</a>
</body>
</html>