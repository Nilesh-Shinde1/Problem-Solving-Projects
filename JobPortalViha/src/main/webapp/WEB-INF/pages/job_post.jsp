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


<title>Job Post</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
	
<div class="container">
		<p class="card">Registration</p>
		<form:form class="card" modelAttribute="job" method="post">
			<table>
				<tr>
					<td>Id</td>
					<td><form:input class="form-control" path="id" disabled="true"/></td>
				</tr>
				<tr>
					<td>Title</td>
					<td><form:input class="form-control" path="title"/></td>
				</tr>
				<tr>
					<td>Profile Type</td>
					<td><form:input class="form-control" path="profileType"/></td>
				</tr>
				<tr>
					<td>Location</td>
					<td>
						<form:select class="form-control" path="jobLocation">
							<form:options items="${jobLocation}"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>Monthly Salary</td>
					<td><form:input class="form-control" path="monthlySalary"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="btn btn-success form-control" value="Post"/></td>
				</tr>
			</table>
		</form:form>
		<input value="Back" type="button" onclick="history.go(-1);" class="btn btn-danger  form-control"/>
	
			<c:if test="${not empty title}">
				<span class="alert alert-success form-control">Job '${title}' is Posted.</span>
			</c:if>
	</div>
	

</body>
</html>