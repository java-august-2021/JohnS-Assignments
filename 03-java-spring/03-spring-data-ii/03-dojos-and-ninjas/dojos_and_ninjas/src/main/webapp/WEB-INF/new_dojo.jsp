<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<a href="/ninja/new">Add Ninja</a>
		<div class="row">
		
			<h2>New Dojo</h2>
			<form:form action="/dojo/new" method="post" modelAttribute="dojo">

			<form:label path="name">Name</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>

        	<input type="submit" value="Submit"/>
			</form:form> 
		
		</div>
		
		<div class="row">
		
			<table class="table">
  		<thead>
    		<tr>
      			<th scope="col">Dojo Location</th>
      			<th scope="col">Number of Students</th>
      			<th scope="col">Actions</th>
       		</tr>
  		</thead>
		<tbody>
			<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td>${dojo.name}</td>
					<td>${fn:length(dojo.ninjas)}</td>
					<td><a href="/dojo/${dojo.id}"><c:out value="${dojo.name}"/> Roster</a></td>
				</tr>
			</c:forEach>
  		</tbody>
	</table>
		
		</div>
		
	</div>
</body>
</html>