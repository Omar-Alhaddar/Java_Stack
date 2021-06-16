<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
</head>
<body>
<center>
<h1 style="color:red;"><c:out value="${error}"/></h1>
<p>What is the code ?</p>

<form action="/mm" method= "POST">

  <input type="text" name="code">

  <input type="submit" value="Try Code">
</form> 

</center>
</body>
</html>