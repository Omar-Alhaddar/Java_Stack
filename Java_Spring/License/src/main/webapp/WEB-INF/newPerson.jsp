<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>New Person</title>
</head>

<body>
	<div class="container">
		<div class="row p-4 justify-content-center">
			<div class="col-sm-6">
				<h1 class="text-center">New Person</h1>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-4 p-2">
				<form:form action="/persons/new" method="post" modelAttribute="person">
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="firstName">First Name</form:label>
							<p class="text-danger"><form:errors path="firstName"/></p>
						</div>
						<div class="col-6">
							<form:input path="firstName"/>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="lastName">Last Name</form:label>
							<p class="text-danger"><form:errors path="lastName"/></p>
						</div>
						<div class="col-6">  
							<form:input path="lastName"/>
						</div>
					</div>
					<div class="row justify-content-end">
						<div class="col-2-offset-5 p-4">
							<input type="submit" value="Create" class="btn btn-success"/>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
