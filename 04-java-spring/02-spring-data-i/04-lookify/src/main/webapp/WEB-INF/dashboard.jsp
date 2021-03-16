<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>All Songs</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<a href="/songs/add">Add New</a>
			<a href="/songs/topTen">Top Ten</a>
			<form action="/songs/search" class="float-right">
				<input type="text" name="artist"/>
				<button class="btn btn-primary">Search Artists</button>
			</form>
			<table class="table">
	  			<thead>
	    			<tr>
	      				<th scope="col">Title</th>
	      				<th scope="col">Rating</th>
	      				<th scope="col">Action</th>
	    			</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${allLookify}" var="song">
		    		<tr>
		      			<td><a href="songs/${song.id}"><c:out value="${ song.title }"></c:out></a></td>
		      			<td><c:out value="${ song.rating }"></c:out></td>
		      			<td>
							<a href="/songs/delete/${song.id}">delete</a> | <a href="/songs/edit/${song.id}">edit</a>
		      			</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div> 
	</body>
</html>