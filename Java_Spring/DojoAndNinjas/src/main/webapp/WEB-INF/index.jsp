<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
				
						
							<form:label path="name"> Name</form:label>
							<p class="text-danger"><form:errors path="name"/></p>
							<form:input path="name"/>
					
					
					
							<input type="submit" value="Create" class="btn btn-success"/>
						
				</form:form>
</body>
</html>