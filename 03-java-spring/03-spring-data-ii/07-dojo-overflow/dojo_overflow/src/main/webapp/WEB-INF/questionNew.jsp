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

<title>New Question</title>
</head>
<body>
	<div class="container">
		<a href="/questions">Dashboard</a>
		<h1>What is your question?</h1>
		
		<div class="row">
			
			
			<form:form method="POST" action="/questions/new" modelAttribute="question">
			        <div class="mb-3">
			            <form:label class="form-label" path="content">Question:</form:label>
			            <form:errors class="text-danger" path="content"/>
			            <form:textarea class="form-control" path="content"/>
			        </div>
 		        
					<div class="mb-3">
			            <form:label class="form-label" path="addTags">Tags:</form:label>
			            <form:errors class="text-danger" path="addTags"/>
			            <form:input class="form-control" path="addTags"/>
			        </div>
									
			        <button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
			
		</div>
	
	</div>
</body>
</html>