<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


<title>Applicant Dashboard</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<h1 class="card">${applicant.firstName}'s Dashboard</h1>
		
		<span class="card">
		<form:form action="login" modelAttribute="applicant">
			<form:select class="form-control" path="location">
				<form:options items="${jobLocation}"/>
				<input type="submit" value="Search" class="btn btn-success form-control"/>
			</form:select>
		</form:form>
			
		</span>
		
	
		<c:if test="${not empty jobList}">
				<table class="table table-hover">
			<thead>
				<tr class="table-success">
					<th>Id</th>
					<th>Title</th>
					<th>Profile</th>
					<th>Location</th>
					<th>Salary</th>
					<th>Operations</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${jobList}" var="job">
					<tr>
						<td>${job.id}</td>
						<td>${job.title}</td>
						<td>${job.profileType}</td>
						<td>${job.jobLocation}</td>
						<td>${job.monthlySalary}</td>
						<td><a href="apply?id=${job.id}" class="btn btn-success">Apply</a></td>
					</tr>
				</c:forEach>
				<tr><td colspan="6"><input value="Back" type="button" onclick="history.go(-1);" class="btn btn-danger  form-control"/></tr>
			</tbody>
		</table>
		
			</c:if>
	
	
	</div>

</body>
</html>