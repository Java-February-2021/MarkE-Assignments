<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Form</title>
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	<form action="/results" method="POST">
		<table>
			<tr>
				<td><label>Name: </label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Location: </label></td>
				<td><input type="text" name="location"></td>
			</tr>
			<tr>
				<td><label>Language: </label></td>
				<td><input type="text" name="language"></td>
			</tr>
			<tr>
				<td><label>Comment: </label></td>
			</tr>
		</table>
		<textarea class="text" name="comment" rows="6" cols="32"></textarea>
		<button>Submit</button>		
	</form>
</body>
</html>