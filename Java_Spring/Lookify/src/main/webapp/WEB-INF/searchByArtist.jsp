<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Search</title>
</head>

<body>
	<div class="container">
		<div class="row p-4">
			<div class="col-sm-4">
				<h4>Songs by artist: <c:out value="${artist}"/></h4>
			</div>
			<div class="col-sm-4">
				<form action="/search" method="POST">
					<input type="search" name="artist" placeholder="${artist}"/> 
					<input type="submit"  value="New Search" />
				</form>
			</div>
			<div class="col-sm-4">
				<h3><a href="/dashboard">Dashboard</a></h3>
			</div>
		</div>

		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Rating</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><h6><a href="/songs/${ song.id }"><c:out value="${ song.title }" /></a></h6></td>
						<td><h6><c:out value="${ song.rating }" /></h6></td>
						<td><h6><a href="/delete/${ song.id }">Delete</a></h6></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>