<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Lookify</title>
</head>

<body>
	<div class="container">
		<div class="card text-center">
  			<div class="card-header">
  				<h3><a class="btn btn-lg btn-primary" href="/dashboard">Dashboard</a></h3>
    			<h1>Song Details</h1>
  			</div>
	  		<div class="card-body">
	    		<h4 class="card-title"><c:out value="${ song.title }"/></h4>
	    		<h4>Artist: <c:out value="${ song.artist }"/></h4>
	    		<h4>Rating (1 - 10): <c:out value="${ song.rating }"/></h4>
	    	</div>
	    	<div class="card-footer text-muted">
	    		<a href="/delete/${song.id}" class="btn btn-lg btn-primary">Delete</a>
	  		</div>
		</div>
	</div>
</body>
</html>