<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta charset="utf-8">

<title>Bikes</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/all.css">
<link rel="stylesheet" type=text/css href="css/Hexa.css">
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<style>
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
	width: 200px;
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
	background: #666;
}
</style>

<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/2-col-portfolio.css" rel="stylesheet">

</head>
<body class="page1" id="top">
	<!--==============================header=================================-->
	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-black w3-bar w3-left-align w3-large">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black"
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
		<a href="template.html" class="w3-bar-item w3-button w3-padding-large">Bus</a>
		<a href="flight.html" class="w3-bar-item w3-button w3-padding-large">Flight</a>
		<a href="Train.html" class="w3-bar-item w3-button w3-padding-large">Train</a>
		<a href="Hotel.html" class="w3-bar-item w3-button w3-padding-large">Hotel</a>
	</div>
	</div>

	<!-- Header -->
	<header class="w3-container w3-red w3-center" style="padding:10px 10px">
	<br>
	<br>
<%  session=request.getSession(false);%>
	<% if(session!=null && (session.getAttribute("user")!=null))
	{%>
		Hello, <%= session.getAttribute( "user" ) %>
		<% }else{
		%>
		 Welcome<% }%>
	<div style="color: black; padding: 1px;">
		<h2 style="font-size: 5vw;">Osho Travels</h2>
	</div>
	</header>
	<br>
	<div class="container">

		<pre>
  <h3 class="my-4">
    Four Wheels move the body,Two Wheels move the soul.
	Book Your's Now
</h3>
</pre>

		<div class="row">
			<div class="col-lg-6 portfolio-item">
				<div class="card h-100">
					<a href="Booking.html"><img class="card-img-top"
						src="images/sc1.png"></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Scooters</a>
						</h4>
						<p class="card-text">Fare Starts from Rs. 500/day*</p>
						<p>
							<a href="Booking.html"> Book Now</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-lg-6 portfolio-item">
				<div class="card h-100">
					<a href="Booking.html"><img class="card-img-top"
						src="images/sc2.jpg" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Sports Bikes</a>
						</h4>
						<p class="card-text">Fare Starts from Rs.500/day*</p>
						<p>
							<a href="Booking.html"> Book Now</a>
						</p>
					</div>
				</div>
			</div>




		</div>
</body>
</html>