<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<title>${artist}</title>
</head>
<body>
	<div class="container">
		<nav>
			<h3>Searched for: ${ artist }</h3>
			<form action="/songs/search">
				<input type="text" name="artist"/>
				<button class="btn btn-primary">Search Artists</button>
			</form>
			<a href="/dashboard">Dashboard</a>
		</nav>
		<table class="table">
			<thead>
				<tr>
					<th>Title</th>
					<th>Artist</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ lookify }" var="song">
				<tr>
					<td><a href="/songs/${ song.id }">${ song.title }</a></td>
					<td>${ song.artist }</td>
					<td>${ song.rating }</td>
					<td><a class="btn btn-danger" href="/songs/delete/${ song.id }">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>