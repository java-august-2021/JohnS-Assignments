<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/index.css" />
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<div class="container px-4">
	<div class="row justify-content-center mt-5">
		<div class="col-6 align-self-center border border-secondary">
			<h3>Submitted Info</h3>
			<p>Name: <c:out value="${name}"/></p>
			<p>Dojo Location: <c:out value="${location}"/></p>
			<p>Favorite Language: <c:out value="${language}"/></p>
			<p>Comment: <c:out value="${comment}"/></p>

		</div>
		</div>
	</div>
</body>
</html>