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

<script src="https://smtpjs.com/v3/smtp.js"></script>

<title>Registration</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<p class="card">Registration</p>
		<form:form class="card" modelAttribute="applicant" method="post">
		<form:errors></form:errors>
			<table>
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input class="form-control" path="id" disabled="true" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input path="emailId" class="form-control" disabled="true" value="${emailId}" id="emailId"/></td>
					<%-- <button onclick="validate(${otp})">Send Mail</button></td> --%>
				</tr>
				<!-- <tr>
					<td id="otpTitle"></td>
					<td><input class="form-control"  type="hidden" id="otpCheck" onblur="enteredOtp()"></td>
				</tr> -->
				<tr>
					<td>First Name</td>
					<td><form:input class="form-control" path="firstName" /></td>
						<td><form:errors class="form-control" path="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input class="form-control" path="lastName" /></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><form:input class="form-control" path="phoneNumber" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input class="form-control" path="password" /></td>
				</tr>
				<tr>
					<td>Profile Type</td>
					<td><form:input class="form-control" path="profileType" /></td>
				</tr>
				<tr>
					<td>Experience(Years)</td>
					<td><form:input class="form-control" path="yearsOfExperience" /></td>
				</tr>
				<tr>
					<td>Pay Per Shift</td>
					<td><form:input class="form-control" path="payPerShift" /></td>
				</tr>
				<tr>
					<td>location</td>
					<td><form:select class="form-control" path="location">
							<form:options items="${jobLocation}" />
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						<%-- onclick="return sendEmail(${otp})" --%>
						class="btn btn-success form-control" value="Register" /></td>
				</tr>
			</table>
		</form:form>
		<input value="Back" type="button" onclick="history.go(-1);"
			class="btn btn-danger  form-control" />

		<c:if test="${not empty name}">
			<span class="alert alert-success form-control">Book '${name}'
				is added/updated.</span>
		</c:if>
	</div>


	<script type="text/javascript">
		
		function validate(otp){
			var emailId = document.getElementById("emailId").value;
			var otpValidate = document.getElementById("otpCheck");
			var otpTitle = document.getElementById("otpTitle");
			//alert("email is null : "+emailId != null);
			
			if(emailId.length == 0 || emailId == null){
				otpTitle.innerHTML = "";
				otpValidate.type="hidden";
			}
			else{
				otpTitle.innerHTML = "Validate OTP";
				otpValidate.type="show";
				//otpValidate.value="";
			}
			sendEmail(otp);
		}
		
		function sendEmail(otp) {
			//let enteredOTP;
			var emailId = document.getElementById("emailId");
			var otpValidate = document.getElementById("otpCheck");
			var otpTitle = document.getElementById("otpTitle");
		      Email.send({
		        Host: "smtp.gmail.com",
		        Username: "Nilesh Shinde",
		        Password: "<your_password>",
		        To: emailId.value,
		        From: "<your_email>",
		        Subject: "Validate using OTP",
		        Body: "Your OTP is ===== "+otp,
		      })
		        .then(function () {
		          alert("mail sent successfully")
		        	//enteredOTP = prompt('Enter OTP');
		            /* alert("send otp"+ otp);
		            alert("entered otp:"+ enteredOTP); */
		        	 //if(otp == enteredOTP)
		        	//alert("otp"+otp);
		        	//alert("entered otp"+otpValidate.value);
		            
		        	if(otp == otpValidate.value){
		        		alert("OTP Valid");
						//return true;
		        	}
					else {
						//alert("otp invalid");
						otpTitle.value = "OTP is wrong."
			        	emailId.focus();
						//return false;
					}})
	    }
		
		function enteredOtp(){
			var emailId = document.getElementById("emailId").value;
			var otpValidate = document.getElementById("otpCheck").value;
			var otpTitle = document.getElementById("otpTitle").value;
		    
			if(emailId == otpValidate)
				otpTitle = "OTP Validated";
			else{
				otpTitle = "OTP is wrong";
			}
		}
		
	</script>
	
</body>
</html>