<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

<title>Question Profile</title>
</head>
<body>
	<div class="container">
		<a href="/questions">Dashboard</a>
		<h1>${thisQuestion.content}</h1>
	<div class="row">
		<h2>Tags:</h2>
	</div>
		<div class="row">
		
			<div class="col">
				<table class="table">
				  <thead>
				    <tr>
				      <th>Answers</th>
				    </tr>
				  </thead>
				  <tbody>
				  	<c:forEach items="${thisQuestion.answers}" var="answer">
					    <tr>
					      <td>${answer.content}</td>
					    </tr>
				    </c:forEach>
				  </tbody>
				</table>
				
			
			</div>
			
			<div class="col">
			
				<h3>Add your answer:</h3>
				
				<form:form method="POST" action="/questions/${thisQuestion.id}/answer" modelAttribute="answer">
			        
			        
			        <div class="mb-3">
			            <form:label class="form-label" path="content">Answer:</form:label>
			            <form:errors class="text-danger" path="content"/>
			            <form:textarea class="form-control" path="content"/>
			        </div>
	
					<form:hidden path="question" value="${thisQuestion.id}"/>
	
			        <button type="submit" class="btn btn-primary">Submit</button>
				</form:form>
			
			</div>
		
		</div>
	</div>
</body>
</html>