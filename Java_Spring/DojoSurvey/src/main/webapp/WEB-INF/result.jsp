<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Submitted Info</h1>
<p>Name: <c:out value="${name}"/></p>
<p>Dojo Location: <c:out value="${location}"/></p>
<p>Favorite Language: <c:out value="${language}"/></p>
<p>Comment: <c:out value="${comment}"/></p>
<form action='/'>
<p><input type="submit" value="Go Back"></p>
</form>
</body>
</html>