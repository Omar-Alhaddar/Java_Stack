  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${lang.name}"/></h1>
<p>Description: <c:out value="${lang.creator}"/></p>
<p>Language: <c:out value="${lang.currentVersion}"/></p>
<a href="/languages/${lang.id}/edit">Edit</a>
<form:form action="/languages/${lang.id}" method="delete" modelAttribute="lang">
             <input type="hidden" name="_method" value="delete">
            <input type="submit" value="Delete"/>
            </form:form>



</body>
</html>