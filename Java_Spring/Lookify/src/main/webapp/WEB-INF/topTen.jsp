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
			<div class="col-sm-6">
				<h3>Top Ten Songs:</h3>
			</div>
			<div class="col-sm-4">
				<h3><a href="/dashboard">Dashboard</a></h3>
			</div>
		</div>
		<div class="row p-4">
			<div class="col-sm-4">
				<table class="table table-bordered">
					<tbody>
						<c:forEach items="${songs}" var="song">
							<tr>
								<td class="border-0"><c:out value="${ song.rating }" /> - 
									<a href="/songs/${ song.id }"><c:out value="${ song.title }" /></a> - 
									<c:out value="${ song.artist }" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>