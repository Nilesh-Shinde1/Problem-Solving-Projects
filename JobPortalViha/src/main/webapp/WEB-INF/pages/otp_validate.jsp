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

<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">
	<form:form class="card" modelAttribute="otp" action="otp">
		<tr>
			<td>OTP Validate</td>
			<td><form:input path="otp" class="form-control" id="otp"/></td>
			<%-- <button onclick="validate(${otp})">Send Mail</button></td> --%>
		</tr>
		<tr>
			<td id="otpTitle"></td>
			<!-- <td><input class="form-control"  type="hidden" id="otpCheck"></td> -->
		</tr>
		<tr>
			<td colspan="2"><input type="submit" class="btn btn-success" value="Validate"></td>
		</tr>
	</form:form>
	</div>
	<!-- <script type="text/javascript">
		function validate(otp){
			var enteredOTP = document.getElementById("otp").value;
			var otpTitle = document.getElementById("otpTitle").value;
			if(enteredOTP == otp)
				otpTitle = "Currect OTP";
			else
				otpTitle = "Wrong OTP";
		}
	</script> -->

</body>
</html>