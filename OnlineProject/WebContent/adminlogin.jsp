<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
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
		<div class="w3-bar w3-black w3-card w3-left-align w3-large">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black"
				href="javascript:void(0);" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="#"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Home</a>
			<a href="template.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bus</a>
			<a href="flight.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Flight</a>
			<a href="Train.html"
				class="w3-bar-item w3-button w3-padding-large w3-white">Train</a> <a
				href="Hotel.html"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Hotel</a>
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
	<header class="w3-container w3-red w3-center" style="padding:2px 10px">
	<br>
	<br>
	<div style="color: black; padding: 1px;">
		<h2 style="font-size: 5vw;">Osho Travels</h2>
	</div>

	</header>
<body>
	<div class="container">
		<center>
			<h1>Login Form for Admin</h1>
			<form action="AdminServ" method="post">
				<table cellpadding="3pt">
					<tr>
						<td>User Name :</td>
						<td><input type="text" name="userName" size="30" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><input type="password" name="password" size="30" /></td>
					</tr>


				</table>
				<p />
				<input type="submit" value="Submit" />
			</form>
		</center>
	</div>
</body>
</html>