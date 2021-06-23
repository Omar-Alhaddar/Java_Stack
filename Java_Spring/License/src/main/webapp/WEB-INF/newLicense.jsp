<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>New License</title>
</head>

<body>
	<div class="container">
		<div class="row p-4 justify-content-center">
			<div class="col-sm-6">
				<h1 class="text-center">New License</h1>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-4 p-2">
				<form:form action="/licenses/new" method="post" modelAttribute="license">
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="person">Name</form:label>
						</div>
						<div class="col-6" style="width: 170px;">
							<form:select path="person">
								<c:forEach items="${persons}" var="person">
									<form:option value="${ person.id }">
										<c:out value=" ${ person.firstName }  ${ person.lastName } "/>
									</form:option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="state">State</form:label>
						</div>
						<div class="col-6">  
							<form:input path="state"/>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">
							<form:label path="expirationDate">Expiration Date</form:label>
							<p class="text-danger"><form:errors path="expirationDate"/></p>
						</div>
						<div class="col-6">  
							<form:input type="date" path="expirationDate"/>
							
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