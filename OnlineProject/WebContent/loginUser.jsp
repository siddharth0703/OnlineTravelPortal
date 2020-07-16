<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
</head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/all.css">
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Lato", sans-serif
}

.w3-bar, h1, button {
	font-family: "Montserrat", sans-serif
}

.fa-anchor, .fa-coffee {
	font-size: 200px
}
</style>
<script>
	function confirmPass() {
		var pass = document.forms["myForm"]["password1"].value;
		var confPass = document.forms["myForm"]["password2"].value;
		if (pass != confPass) {
			alert("Password Not Match");
			return false
		}
	}
	function validateEmail() {
    	var email=document.forms["myForm"]["email"].value;
    	if((email.indexOf("@hcl.com", email.length - "@hcl.com".length) == -1)&&(email.indexOf("@gmail.com", email.length - "@gmail.com".length) == -1)&&(email.indexOf("@yahoo.com", email.length - "@yahoo.com".length) == -1)&&(email.indexOf("@hotmail.com", email.length - "@hotmail.com".length) == -1)&&(email.indexOf("@outlook.com", email.length - "@outlook.com".length) == -1)&&(email.indexOf("@rediff.com", email.length - "@rediff.com".length) == -1)){
	    alert("Not a Valid Email.");
    	return false;
    	    }
    	}
</script>
<!-- Navbar -->
<div class="w3-top">
	<div class="w3-bar w3-black w3-bar w3-left-align w3-large">
		<a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black"
				href="javascript:void(0);" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="#" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
			<a href="Bus.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bus</a>
			<a href="flight.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Flight</a>
			<a href="Train.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Train</a>
			<a href="Hotel.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Hotel</a>
			<a href="register.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Sign
				Up</a> <a href="loginUser.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Login</a>
				 <a href="BookBikeUserForm.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Book a Bike!</a>
				<a href="feedbackform.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Feedback</a>
	</div>

	<!-- Navbar on small screens -->
	<div id="navDemo"
		class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
		<a href="template.html" class="w3-bar-item w3-button w3-padding-large">Bus</a>
		<a href="flight.html" class="w3-bar-item w3-button w3-padding-large">Flight</a>
		<a href="Train.html" class="w3-bar-item w3-button w3-padding-large">Train</a>
		<a href="Hotel.html" class="w3-bar-item w3-button w3-padding-large">Hotel</a>
	</div>
</div>
<!-- Header -->
<header class="w3-container w3-red w3-center" style="padding:10px 10px">
<br><br>

<div style="color:black;padding:1px; ">
  <h2 style="font-size:7vw;">Osho Travels</h2>
<br><br>
</div>

</header>
<body>
<br>
<div class="login-form">
				<div class="sign-in-htm">
					<center><form name="loginForm" action="loginServ" method="get">
						<div class="group">
							<label for="user" class="label">Username</label> <input id="user"
								type="text" class="input" name="user" required>
						</div>
						<div class="group">

							<label for="pass" class="label">Password</label> <input id="pass"
								type="password" class="input" data-type="password" name="pass"
								required>
						</div>
	
						<div class="group">
							<input type="submit" class="button" value="Sign In">
						</div>
					</form></center>
					<br>
						<center><a href="ForgetPassword.jsp">Forgot Password?</a><br> 
						<a href="index.jsp">Continue as a Guest</a></center>
					</div>

				</div></div>
</body>



</body>

</html>


