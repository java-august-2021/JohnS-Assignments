<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
	
<title>Questions</title>
</head>
<body>
	<div class="container">
	
		<h1>Questions Dashboard</h1>
	
		<div class="row">
		
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Question</th>
			      <th scope="col">Tags</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach items="${questions}" var="question">
				    <tr>
				      <td><a href="/questions/${question.id}">${question.content}</a></td>
				      <td>
				      <c:forEach items="${question.tags}" var="tag">
				      	${tag.name},
				      </c:forEach>
				      </td>
				    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<a href="/questions/new">New Question</a>
		</div>
	
	</div>
</body>
</html>