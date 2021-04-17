<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


<title>Registration Signup</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	

<div class="container">
		<p class="card">Registration</p>
		<form:form class="card" modelAttribute="recruiter" method="post">
			<table>
				<tr>
					<td>Id</td>
					<td><form:input class="form-control" path="id" disabled="true"/></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input class="form-control" path="firstName"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input class="form-control" path="lastName"/></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input class="form-control" path="emailId"/></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><form:input class="form-control" path="phoneNumber"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input class="form-control" path="password"/></td>
				</tr>
				<tr>
					<td>Profile Type</td>
					<td><form:input class="form-control" path="profileType"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="btn btn-success form-control" value="Add/Update"/></td>
				</tr>
			</table>
		</form:form>
		<input value="Back" type="button" onclick="history.go(-1);" class="btn btn-danger  form-control"/>
	
			<c:if test="${not empty name}">
				<span class="alert alert-success form-control">Book '${name}' is added/updated.</span>
			</c:if>
	</div>
	

</body>
</html>