<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${category.name}</h1>


	<form:form action="/category/addProduct" method="POST"
		modelAttribute="relation">
		<form:input type="hidden" path="category" value="${category.id}" />

		<div>
			<form:select path="product">
				<c:forEach items="${products}" var="p">
					<form:option value="${ p.id }">${ p.name }</form:option>

				</c:forEach>
			</form:select>
		</div>
		<button>add!</button>
	</form:form>



	<h1>Products</h1>
	<c:forEach items="${category.products}" var="p">
		<ul>

			<li>${ p.name }</li>
		</ul>
	</c:forEach>

	


</body>
</html>