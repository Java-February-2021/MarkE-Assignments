<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>All Languages</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<table class="table">
	  			<thead>
	    			<tr>
	      				<th scope="col">Name</th>
	      				<th scope="col">Creator</th>
	      				<th scope="col">Version</th>
	      				<th scope="col">Action</th>
	    			</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach items="${allLanguages}" var="lang">
		    		<tr>
		      			<td><a href="languages/${lang.id}"><c:out value="${ lang.name }"></c:out></a></td>
		      			<td><c:out value="${ lang.creator }"></c:out></td>
		      			<td><c:out value="${ lang.version }"></c:out></td>
		      			<td>
							<a href="/languages/delete/${lang.id}">delete</a> | <a href="/languages/edit/${lang.id}">edit</a>
		      			</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<hr>
			<h3>New Language</h3>
			<form:form action="/languages/add" method="post" modelAttribute="language">
	   			<p>
	       			<form:label path="name">Name</form:label>
	       			<form:errors path="name"/>
	       			<form:input path="name"/>
				</p>
	   			<p>
	       			<form:label path="creator">Creator</form:label>
	       			<form:errors path="creator"/>
	       			<form:input path="creator"/>
				</p>
				<p>
	       			<form:label path="version">Version</form:label>
	       			<form:errors path="version"/>
	       			<form:input path="version"/>
				</p>   
	   			<input type="submit" value="Submit"/>
			</form:form>
		</div> 
	</body>
</html>