<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Profile Page</title>
</head>

<body>
	<div class="container">
		<div class="card text-center">
	  		<div class="card-body">
	    		<h1><c:out value="${ person.firstName } ${ person.lastName }"/></h1>
	    		<h3>License number:  <c:out value="${ person.license.number }"/></h3>
				<h3>State:   <c:out value="${ person.license.state }" /></h3>
				<h3>Expiration Date:   <fmt:formatDate value="${ person.license.expirationDate }" pattern="yyyy-MM-dd" /></h3>
	    	</div>
		</div>
	</div>
</body>
</html>