<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Product</title>
</head>
<body>
	<div class="container">
		<div class="row">
		<br><br>
			<h1>${product.name}</h1>
		</div>
		<br><br><br>
		<div class="row">
			<div class="col">
				<h1>Categories</h1>
				<c:forEach items="${product.categories}" var="p">
					<ul>

						<li>${ p.name }</li>
					</ul>
				</c:forEach>

			</div>
			<div class="col">
				<form:form action="/product/addCategory" method="POST"
					modelAttribute="relation">
					<form:input type="hidden" path="product" value="${product.id}" />

					<h3>add category</h3>
					<form:select class="form-select" path="category">
						<c:forEach items="${categories}" var="p">
							<form:option value="${ p.id }">${ p.name }</form:option>

						</c:forEach>
					</form:select>
					<button class="btn btn-primary mb-3">add!</button>
				</form:form>

			</div>
		</div>
	</div>


</body>
</html>