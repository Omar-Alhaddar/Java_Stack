<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>

<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Lookify</title>
</head>

<body>
	<div class="container">
		<div class="row p-4">
			<div class="col-sm-6">
				<h3 class="text-center"><a href="/songs/new">Add New</a> | <a href="/search/topTen">Top Songs</a></h3>
			</div>
			<div class="col-sm-4">
				<form action="/search" method="POST">
					<input type="search" name="artist" /> <input type="submit" value="Search Artists" />
				</form>
			</div>
		</div>
		
		<div class="row">
			 <table class="table table-bordered table-striped">
				<thead class="thead-dark">
					<tr>
						<th scope="col"><h5>Name</h5></th>
						<th scope="col"><h5>Rating</h5></th>
						<th scope="col"><h5>Actions</h5></th>
					</tr>					        		
				</thead>
				<c:forEach items="${ songs }" var="song">								    
					<tr>
						<td><h6><a href="/songs/${ song.id }"><c:out value="${ song.title }"/></a></h6></td>
						<td><h6><c:out value="${ song.rating }"/></h6></td>
						<td><h6><a href="/delete/${ song.id }">Delete</a></h6></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		
	</div>
</body>
</html>