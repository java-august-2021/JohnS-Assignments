<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
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
		<div class="row">
		
			<h2>New License</h2>
			<form:form action="/license/new" method="post" modelAttribute="license">
			
			<form:label path="person">Person</form:label>
			<form:errors path="person"/>
			<form:select path="person">
				<c:forEach items="${persons}" var="person">
					<%-- <c:if test="${empty person.license}"> --%>
						<option value="${person.id}">${person.firstName} ${person.lastName}</option>
					<%-- </c:if> --%>
				</c:forEach>
			</form:select>
						
			<form:label path="state">State</form:label>
        	<form:errors path="state"/>
        	<form:input path="state"/>
        	
			<form:label path="expiration_date">Expiration Date</form:label>
        	<form:errors path="expiration_date"/>
        	<form:input type="date" path="expiration_date"/>

        	<input type="submit" value="Submit"/>
			</form:form> 
		
		</div>
	</div>
</body>
</html>