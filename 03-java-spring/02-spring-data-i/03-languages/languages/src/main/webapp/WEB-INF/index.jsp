<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
        			<c:forEach items="${languages}" var="language">
        			<tr>
            			<td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
            			<td><c:out value="${langauge.creator}"/></td>
            			<td><c:out value="${language.version}"/></td>
            			<td><a href="/languages/${language.id}/edit">Edit</a> |
            			 
            			<form action="/languages/${language.id}" method="post">
    					<input type="hidden" name="_method" value="delete">
    					<input type="submit" value="Delete">
    					</form>
    					</td>			
        			</tr>
        			</c:forEach>
    			</tbody>
			</table>			
		</div>
		<div class="row">
			<h2>New Language</h2>
			<form:form action="/languages" method="post" modelAttribute="language">
			
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
		</div>
	</div>
</body>
</html>