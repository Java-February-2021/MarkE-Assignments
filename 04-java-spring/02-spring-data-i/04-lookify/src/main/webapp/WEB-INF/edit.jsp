<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit ${lookify.title}</title>
</head>
<body>
<a href="/dashboard">dashboard</a>
<a href="/songs/delete/${lookify.id}">delete</a>
<form:form action="/songs/edit/${lookify.id}" method="post" modelAttribute="lookify">
    <p>
        <form:label path="title">Title</form:label>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">Artist</form:label>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:input path="rating"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>