<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BusPage</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/all.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
	$( function() {
		$( "#datepicker" ).datepicker();
		$( "#datepicker1" ).datepicker();
	} );
	</script>
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
<body>
	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-black w3-bar w3-left-align w3-large">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black"
				href="javascript:void(0);" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="index.jsp" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
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
	<h2 style="font-size: 2vw;">Hello,<%= session.getAttribute( "user" ) %>
	<% }else{
		%>
		 Welcome<% }%>
		</h2>
	<div style="color: black; padding: 1px;">
		<h2 style="font-size: 5vw;">Osho Travels</h2>
		<br>
	</div>

	</header>

	<!-- First Grid -->
	<link rel="stylesheet" href="all.css">
	<h2>
		<center>Search Bus...</center>
		<br>
	</h2>


	<div class="container">
		<form action="BusSearch" method="post">
			<div class="row">
				<div class="col-25">
					<label for="source">Select Source</label>
				</div>
				<div class="col-25">
					<select id="source" name="source">
						<option value="Delhi">New Delhi</option>
						<option value="Jaipur">Jaipur</option>
						<option value="Varansi">Varansi</option>
						<option value="Agra">Agra</option>
						<option value="Bombay">Bombay</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="desttination">Select Destination</label>
				</div>
				<div class="col-25">
					<select id="arrival" name="arrival">
						<option value="Delhi">New Delhi</option>
						<option value="Madurai">Madurai</option>
						<option value="Varansi">Varansi</option>
						<option value="Agra">Agra</option>
						<option value="Bombay">Bombay</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="subject">Departure Date</label>
				</div>
				<div class="col-25">
					<input type="Date" id="datepicker1" placeholder="Select your Departure date" required> 
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="seat">Seat</label>
				</div>
				<div class="col-25">
					<select id="seats" name="seats">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
					</select>
				</div>
			</div>
<br>
			<div class="row">
				
				<input type="submit" value="Search Buses">
			</div>
		</form>
	</div>


	<!-- Footer -->

	<footer>

	<table style="width: 100%">
		<tr>
			<td><h3>Help</h3>
				</b></td>
			<td><h3>Popular</h3></td>
			<td><h3>NBCI</h3></td>
		</tr>
		<tr>
			<td>FAQ</td>
			<td>Email</td>
			<td>Phone</td>
		</tr>
		<tr>
			<td>Trivago</td>
			<td>Yatra</td>
			<td>MakeMyTrip</td>
		</tr>
		<tr>
			<td>Trainning</td>
			<td>Tutorial</td>
			<td>Bugs</td>
		</tr>

		</tr>
	</table>
	</footer>



	<script>
		// Used to toggle the menu on small screens when clicking on the menu button
		function myFunction() {
			var x = document.getElementById("navDemo");
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>

</body>
</html>