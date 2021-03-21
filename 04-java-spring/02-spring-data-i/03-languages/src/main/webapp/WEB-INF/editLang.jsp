<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit ${language.name}</title>
</head>
<body>
<a href="/languages">dashboard</a>
<a href="/languages/delete/${language.id}">delete</a>
<form:form action="/languages/edit/${id} }" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:input path="version"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>