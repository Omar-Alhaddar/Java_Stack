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

<h1> <c:out value="${products.name}"></c:out> </h1>

<form:form action="/products/${products.id}" method="POST" modelAttribute="category">
				
				<select path="categories">
				   <c:forEach items="${cat}" var="category">
				       <option value="${category.id}">${category.name}</option>
				   </c:forEach>
				</select>
				

		<button type="submit">Add </button>
</form:form>

<%-- 			<ul>
				<c:forEach items="${stu1}" var="c">
					<li>c.name</li>
				</c:forEach>
			</ul>  --%>
</body>
</html>