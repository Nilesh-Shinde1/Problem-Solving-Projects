<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="register" modelAttribute="otp">
		Enter OTP : <form:input path="otp"/>
		<input type="submit" value="Submit"/>
	</form:form>

</body>
</html>