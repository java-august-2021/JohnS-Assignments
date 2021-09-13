<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>${category.name}</title>
</head>
<body>
	<div class="container">
	
	<a href="/product/new">Add Product</a>
	<a href="/category/new">Add Category</a>
	
	<h1>${category.name}</h1>
	
	<ul>
		<li>Number of Products ${fn:length(category.products)}</li>
	</ul>
	
	<div class="row">
		<div class="col">
			<h3>Products</h3>
			<ul>
				<c:forEach items="${category.products}" var="product">
					<li>${product.name}</li>
				</c:forEach>
			</ul>
		</div>
		
		<div class="col">
			<form action="/category/${category.id}/update" method="post">
				<label for="product">Add Product:</label>
				<select name="product" id="product">
					<c:forEach items="${notProducts}" var="product">
						<option value="${product.id}">${product.name}</option>
				    </c:forEach>
				</select>
				<div><input type="submit" value="Submit"/></div>
				
			</form>
			
		</div>
	
	</div>

	
	
	</div>
</body>
</html>