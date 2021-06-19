<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gold</title>

<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<p>Your Gold: <c:out value="${gold}"/> </p>
      <div class="all">
        <div class="farm">
          <h3>Farm</h3>
          <p>(earns 10-20 golds)</p>
          <form method="post" action="/process_money">
            <input type="hidden" name="which_form" value="farm" />
            <button type="submit">Find Gold!</button>
          </form>
        </div>
        <div class="cave">
          <h3>Cave</h3>
          <p>(earns 5-10 golds)</p>
          <form method="post" action="/process_money">
            <input type="hidden" name="which_form" value="cave" />
            <button type="submit">Find Gold!</button>
          </form>
        </div>
        <div class="house">
          <h3>House</h3>
          <p>(earns 2-5 golds)</p>
          <form method="post" action="/process_money">
            <input type="hidden" name="which_form" value="house" />
            <button type="submit">Find Gold!</button>
          </form>
        </div>
        <div class="casino">
          <h3>Casino</h3>
          <p>(earns/takes 0-50 golds)</p>
          <form method="post" action="/process_money">
            <input type="hidden" name="which_form" value="casino" />
            <button type="submit">Find Gold!</button>
          </form>
        </div>
      </div>
      
       <p>Activites:</p>
      <div class="activity">
    					
<c:forEach items="${sessionScope.activities}" var="gl">
	

     
     <c:choose>
    <c:when test="${ gl.charAt(0) eq 'O'.charAt(0) }">
        <p style="color:red"> <c:out value="${gl }"> </c:out> </p>
       
    </c:when>    
    <c:otherwise>
         <p style="color:green"> <c:out value="${gl }"> </c:out> </p>
       
    </c:otherwise>
</c:choose>

</c:forEach>


      </div>
      
      
 
 
</body>
</html>