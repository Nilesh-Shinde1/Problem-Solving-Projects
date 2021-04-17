<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title></title>
</head>
<body>
	<div class="container">
		<div class="dropdown d-inline-block">
			<button class="btn btn-primary dropdown-toggle" type="button"
				data-toggle="dropdown">
				Registration
			</button>
			<ul class="dropdown-menu">
				<li><a href="applicant/email">Applicant Registration</a></li>
				<li><a href="recruiter/register">Recruiter Registration</a></li>
			</ul>
		</div>
		<div class="dropdown d-inline-block">
			<button class="btn btn-success dropdown-toggle" type="button"
				data-toggle="dropdown">
				Login
			</button>
			<ul class="dropdown-menu">
				<li><a href="applicant/login">Applicant Login</a></li>
				<li><a href="recruiter/login">Recruiter Login</a></li>
			</ul>
		</div>
	</div>
</body>
</html>