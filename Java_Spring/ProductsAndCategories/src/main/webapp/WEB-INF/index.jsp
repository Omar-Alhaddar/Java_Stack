<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>frog 69</title>
</head>
<body>

<h1>New Product</h1>

	<form:form action="/createP" method="POST" modelAttribute="products">
	
		<div>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</div>
		<div>
			<form:label path="description">description</form:label>
			<form:errors path="description" />
			<form:input path="description" />
		</div>
		<div>
			<form:label path="price">price</form:label>
			<form:errors path="price" />
			<form:input path="price" />
		</div>
		<button type="submit">Create</button>
</form:form>
</body>
</html>