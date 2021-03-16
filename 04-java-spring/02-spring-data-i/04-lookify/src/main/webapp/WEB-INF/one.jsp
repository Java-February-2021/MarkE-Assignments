<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${lookify.title}</title>
</head>
<body>
	<a href="/dashboard">dashboard</a>
	<p>Title: <c:out value="${lookify.title}"/></p>
	<p>Artist: <c:out value="${lookify.artist}"/></p>
	<p>Rating: <c:out value="${lookify.rating}"/></p>
	<a href="/songs/edit/${lookify.id}">Edit</a>
	<a href="/songs/delete/${lookify.id}">Delete</a>
</body>
</html>