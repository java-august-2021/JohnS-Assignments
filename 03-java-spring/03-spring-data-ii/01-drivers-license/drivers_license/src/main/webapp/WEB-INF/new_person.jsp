<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
		
			<h2>New Person</h2>
			<form:form action="/persons/new" method="post" modelAttribute="person">
			
			<form:label path="firstName">First Name</form:label>
        	<form:errors path="firstName"/>
        	<form:input path="firstName"/>
        	
			<form:label path="lastName">Last Name</form:label>
        	<form:errors path="lastName"/>
        	<form:input path="lastName"/>

        	<input type="submit" value="Submit"/>
			</form:form> 
		
		</div>
	</div>
</body>
</html>