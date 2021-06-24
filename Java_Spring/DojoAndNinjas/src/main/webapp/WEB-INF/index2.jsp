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

<h1>New Ninja</h1>

	<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
		<div>
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="p">
					<form:option value="${ p.id }">${ p.name }</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="firstName">firstName</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</div>
		<div>
			<form:label path="lastName">lastName</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</div>
		<div>
			<form:label path="age">age</form:label>
			<form:errors path="age" />
			<form:input path="age" />
		</div>
		<button type="submit">Add Ninja</button>
</form:form>
</body>
</html>