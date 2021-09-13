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
<title>New Product</title>
</head>
<body>

	<div class="container">
		<a href="/category/new">Add Category</a>
		<div class="row">
		
			<h2>New Product</h2>
			<form:form action="/product/new" method="post" modelAttribute="product">

			<form:label class="form-label" path="name">Name</form:label>
        	<form:errors class="form-errors" path="name"/>
        	<form:input class="form-control" path="name"/>
        	
			<form:label class="form-label" path="description">Description</form:label>
        	<form:errors path="description"/>
        	<form:textarea class="form-control" path="description"/>
        	
			<form:label class="form-label" path="price">Price</form:label>
        	<form:errors path="price"/>
        	<form:input class="form-control" path="price"/>

        	<input type="submit" class="mt-3" value="Submit"/>
			</form:form> 
		
		</div>
		
		<div class="row">
			<h1 class="mt-5">All Products</h1>
			<table class="table">
  		<thead>
    		<tr>
      			<th scope="col">Product Name</th>
      			<th scope="col">Description</th>
      			<th scope="col">Price</th>
       		</tr>
  		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td><a href="/product/${product.id}">${product.name}</a></td>
					<td>${product.description}</td>
					<td>${product.price}</td>
				</tr>
			</c:forEach>
  		</tbody>
	</table>
		
		</div>
	
	</div>

</body>
</html>