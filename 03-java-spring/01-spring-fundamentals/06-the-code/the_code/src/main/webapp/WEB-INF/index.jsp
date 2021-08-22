<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/index.css" />
<meta charset="ISO-8859-1">
<title>Secret Code</title>
</head>
<body>
<div class="errors"><c:out value="${errors}"/></div>
<form action="/code" method="post">

<label for="code">What is the code?</label>
<br>
<input type="text" name="code" id="code" />
<br>
<button>Try Code</button>
</form>
	
</body>
</html>