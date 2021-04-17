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

<title>Home</title>
</head>
<body>

	<div class="container">
		<div class="card">
		<jsp:include page="/WEB-INF/pages/header.jsp"></jsp:include>
</div>
		
		<div class="card">
			<h4>Welcome to the Artist Portal</h4>
			<div>
				<c:forEach begin="1" end="20">
				Job Portal is a platform that joins recruiters and the job seekers to complete their goals and requirements. Recruiters look for a right candidate who has the right qualification to handle the responsibilities efficiently. Sending job applications through employment portals is a quicker way to get the right candidate.
				</c:forEach>
			</div>
		</div>
	</div>


</body>
</html>