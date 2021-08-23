<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="css/index.css" />
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<div class="container px-4">
	<div class="row justify-content-center mt-5">
		<div class="col-6 align-self-center border border-secondary">
		
			<div class="errors"><c:out value="${nameError}"/></div>
		
			<form action="/submit" method="post">
				<label for="name" class="form-label mt-3">Your Name:</label>
				<input type="text" id="name" name="name" class="form-control" />
				
				<label for="location" class="form-label mt-3">Dojo Location:</label>
				<select class="form-select" id="location" name="location">
  					<option value="San Jose">San Jose</option>
  					<option value="Online">Online</option>
  					<option value="Texas">Texas</option>
				</select>
				
				<label for="language" class="form-label mt-3">Favorite Language:</label>
				<select class="form-select" id="language" name="language">
   					<option value="python">Python</option>
  					<option value="javascript">JavaScript</option>
  					<option value="java">Java</option>
				</select>
				
				<label for="comment" class="form-label mt-3">Comment (optional)</label>
				<textarea class="form-control mb-3" id="comment"></textarea>
				<button type="submit" class="btn btn-secondary mb-3">Submit</button>
			</form>
		</div>
		</div>
	</div>
</body>
</html>