<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>New Category</title>
</head>
<body>
	<div class="container">
		<a href="/product/new">Add Product</a>
		<div class="row">
		
			<h2>New Category</h2>
			<form:form action="/category/new" method="post" modelAttribute="category">

			<form:label path="name">Category</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>

        	<input type="submit" value="Submit"/>
			</form:form> 
		
		</div>
	
		<div class="row">
			<h1 class="mt-5">All Categories</h1>
			<table class="table">
  		<thead>
    		<tr>
      			<th scope="col">Category Name</th>
      			<th scope="col">No. Of Products</th>
       		</tr>
  		</thead>
		<tbody>
			<c:forEach items="${categories}" var="category">
				<tr>
					<td><a href="/category/${category.id}">${category.name}</a></td>
					<td>${fn:length(category.products)}</td>
				</tr>
			</c:forEach>
  		</tbody>
	</table>
		
		</div>
	
	</div>
</body>
</html>