<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

	<a href="/dojo/new">Add Dojo</a>
	<a href="/ninja/new">Add Ninja</a>
	
	<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>

	<table class="table">
  		<thead>
    		<tr>
      			<th scope="col">First Name</th>
      			<th scope="col">Last Name</th>
      			<th scope="col">Age</th>
       		</tr>
  		</thead>
		<tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
				</tr>
			</c:forEach>
  		</tbody>
	</table>
</div>
</body>
</html>