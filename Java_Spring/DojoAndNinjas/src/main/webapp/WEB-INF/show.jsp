<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>  <c:out value = "${dojos.name }"/>  </h1>


<table>
  <tr>
    <th>FirstName</th>
    <th>LastName</th>
    <th>age</th>
  </tr>
  <c:forEach items="${dojos.ninjas}" var="dojo">
    <tr>      
        <td>${dojo.firstName}</td>
        <td>${dojo.lastName}</td>
        <td>${dojo.age}</td>
    </tr>

 </c:forEach> 
</table>

</body>
</html>