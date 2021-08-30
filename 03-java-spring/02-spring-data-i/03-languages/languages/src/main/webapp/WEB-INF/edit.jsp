<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit <c:out value="${lang.name}"/></title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<h1>Edit Language</h1>
			<form:form action="/languages/${lang.id}" method="post" modelAttribute="language">
			<input type="hidden" name="_method" value="put">
			
			<form:label path="name">Name</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>
        	
			<form:label path="creator">Creator</form:label>
        	<form:errors path="creator"/>
        	<form:input path="creator"/>
        	
			<form:label path="version">Version</form:label>
        	<form:errors path="version"/>
        	<form:input path="version"/>
        	
        	<input type="submit" value="Submit"/>
			</form:form> 
	
</body>
</html>