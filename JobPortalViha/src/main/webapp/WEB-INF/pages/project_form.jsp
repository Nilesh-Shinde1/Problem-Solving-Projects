<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Project</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<p class="card">Registration</p>
		<form:form class="card" modelAttribute="project" method="post">
			<table>
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input class="form-control" path="id" disabled="true" /></td>
				</tr>
				<tr>
					<td>Project Name</td>
					<td><form:input class="form-control" path="name" /></td>
				</tr>
				<tr>
					<td>Budget</td>
					<td><form:input class="form-control" path="budget" /></td>
				</tr>
				<tr>
					<td>Applicant</td>
					<td>
						<form:select class="form-control" path="applicant">
							<c:forEach items="${applicants}" var="appli">
								<%-- <form:options items="applicant:${applicants}"/> --%>
								<form:option value="${appli}" valueObject="${appli}">${appli}</form:option>
								<%-- <form:option value="" valueObject></form:option> --%>
							</c:forEach>
						</form:select>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						class="btn btn-success form-control" value="Register" /></td>
				</tr>
			</table>
		</form:form>
		<input value="Back" type="button" onclick="history.go(-1);"
			class="btn btn-danger  form-control" />

		<c:if test="${not empty name}">
			<span class="alert alert-success form-control">Project '${name}'
				is added.</span>
		</c:if>
	</div>


</body>
</html>