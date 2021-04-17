<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>OTP Validate</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
	<form:form class="card" modelAttribute="otp" action="email">
		<tr>
			<td>Email Id</td>
			<td><form:input path="email" class="form-control" id="emailId" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" class="btn btn-success" value="Validate"></td>
		</tr>
	</form:form>
</div>
</body>
</html>