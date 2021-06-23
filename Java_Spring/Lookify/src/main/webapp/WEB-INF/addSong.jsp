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
			<div class="col-sm-8"></div>
			<div class="col-sm">
				<h3><a href="/dashboard">Dashboard</a></h3>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-4 p-2">
				<form:form action="/songs/new" method="post" modelAttribute="addSong">
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="title">Title</form:label>
							<p class="text-danger"><form:errors path="title"/></p>
						</div>
						<div class="col-6">
							<form:input path="title"/>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="artist">Artist</form:label>
							<p class="text-danger"><form:errors path="artist"/></p>
						</div>
						<div class="col-6">  
							<form:input path="artist"/>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">Rating(1-10)</div>
						<div class="col-6" style="width: 150px;">
							<form:select path="rating">
								<form:option value="1">1 &emsp;  &emsp; &emsp;  &emsp; &emsp;  &emsp; &emsp;</form:option>
								<form:option value="2">2</form:option>
								<form:option value="3">3</form:option>
								<form:option value="4">4</form:option>
								<form:option value="5">5</form:option>
								<form:option value="6">6</form:option>
								<form:option value="7">7</form:option>
								<form:option value="8">8</form:option>
								<form:option value="9">9</form:option>
								<form:option value="10">10</form:option>
							</form:select>
						</div>
					</div>
					<div class="row justify-content-end">
						<div class="col-2-offset-5 p-4">
							<input type="submit" value="Add Song" class="btn btn-success"/>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>