<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Feedback</title>
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/all.css">
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<style>
.button{
	color:red;
	height:50px;
	width:100px;
}
.input{
	padding-right:150px;
	height:20px;
	
}
.textbox{
	padding-right:50px;
	width: 250px;
	height: 50px;
}
ul {
	display: inline;
	margin: 0;
	padding: 0;
}

ul li {
	display: inline-block;
}

ul li:hover {
	background: #555;
}

ul li:hover ul {
	display: block;
}

ul li ul {
	position: absolute;
	width: 100px;
	display: block;
}

ul li ul li {
	background: #555;
	display: block;
}

ul li ul li a {
	display: block !important;
}

ul li ul li:hover {
	background: #959595;
}
</style>

</head>
<body class="page1" id="top">
	<!--==============================header=================================-->
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
  </div>

		<!-- Navbar on small screens -->
		<div id="navDemo"
			class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
			<a href="template.html"
				class="w3-bar-item w3-button w3-padding-large">Bus</a> <a
				href="flight.html" class="w3-bar-item w3-button w3-padding-large">Flight</a>
			<a href="Train.html" class="w3-bar-item w3-button w3-padding-large">Train</a>
			<a href="Hotel.html" class="w3-bar-item w3-button w3-padding-large">Hotel</a>
		</div>
	</div>

	<!-- Header -->
	<header class="w3-container w3-red w3-center" style="padding:10px 10px">
<br><br>
<%  session=request.getSession(false);%>
	<% if(session!=null && (session.getAttribute("user")!=null))
	{%>
	<h2 style="font-size: 2vw;">Hello,<%= session.getAttribute( "user" ) %>
	<% }else{
		%>
		 Welcome<% }%>
		</h2>
<div style="color:black;padding:1px; ">
  <h2 style="font-size:7vw;">Osho Travels</h2>
<br><br>
</div>

</header>

	<div class="extra_wrapper">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<center>
			<h2>We Love to Hear from you!</h2>

			<h3>Please Provide Your Valuable Feedback</h3>
		<form action="UserFeedbackController" method="get">
		<br> <br><pre>
		<h5>Name:        <input type="text" class="input" name="name">
		<h5>Username:    <input type="text" class="input" name="username">
		<h5>Email:       <input type="text" class="input" name="email">
		<h5>Suggestions: <input type="text" class="textbox" name="suggestion">
					 
		<input type="submit" class="button" name="addFeedback" value="Submit">
					 </pre>
	</form>
</center>
	</div>


	<!--==============================footer=================================-->
	<footer>
		<div class="container_12">
			<div class="grid_12">
				<div class="socials">
					<a href="#" class="fa fa-facebook"></a> <a href="#"
						class="fa fa-twitter"></a> <a href="#" class="fa fa-google-plus"></a>
				</div>
				<div class="copy">
					Online Travel Portal (c) 2017 | pandatravels.com | <a href="#">Privacy
						Policy | </a><a href="adminlogin.jsp">Admin</a>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>



