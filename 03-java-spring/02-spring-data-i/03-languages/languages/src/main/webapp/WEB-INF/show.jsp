<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title><c:out value="${lang.name}"/></title>
</head>
<body>
	<div class="container">
	
		<div class="row">
			<a href="/languages">Dashboard</a>
			<ul>
				<li><c:out value="${lang.name}"/></li>
				<li><c:out value="${lang.creator}"/></li>
				<li><c:out value="${lang.version}"/></li>
			</ul>
			<a href="/languages/${lang.id}/edit">Edit</a>
			<a href="#">Delete</a>
		</div>
	
	</div>
</body>
</html>