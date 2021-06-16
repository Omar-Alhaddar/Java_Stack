<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
<center>

<h1>you visited <a href="/">http://localhost:8080/</a>   <c:out value="${sessionScope.counter}"/> times</h1>
<h1><a href="/">test another visit?</a></h1>
</center>
</body>
</html>