<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Visit count</title>
</head>
<body>
	<p>You have visited <a href="/">LocalHost</a> <c:out value="${visits}"/> times.</p>
	<a href="/">Test another visit?</a>
	<br>
	<a href="/plustwo">Add two visits</a>
	<br>
	<a href="/reset">Reset Counter</a>
</body>
</html>