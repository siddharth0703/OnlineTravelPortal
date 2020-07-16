<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
<link rel="stylesheet" type=text/css href="support/css/owl.carousel.css">
<link rel="stylesheet" type=text/css href="support/css/style3.css">
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
<body>
	<!--==============================header=================================-->
	<header>
	<div class="container_14">
		<div class="grid_18">
			<div class="menu_block">
				<nav class="horizontal-nav full-width horizontalNav-notprocessed">
				<ul class="sf-menu">
					<li><a href="index.jsp">About</a></li>
					<li class="current"><a href="search.jsp">Flights/Hotel Search</a></li>
					<li><a href="#">Transport Book</a>
						<ul>
							<li><a href="bikelook.jsp">Rent a Bike</a></li>
						</ul></li>
				
					<li><a href="LogoutServ">Logout</a></li>
					<li><a href="feedbackform.html">Feedback</a></li>
					<li><a href="contactus.jsp">Contact Us</a></li>

				</ul>
				</nav>
				<div class="clear"></div>
			</div>
		</div>
	</header>
	<!-- ***************body content************* -->
	<center>
		<table>

			<tr>
				<th><h3>Flight Name</h3></th>
				<th><h3>Flight Number</h3></th>
				<th><h3>Origin</h3></th>
				<th><h3>Destination</h3></th>
				<th><h3>Departure Time</h3></th>
				<th><h3>Runs On</h3></th>
				<th><h3>Fare</h3></th>
			</tr>

			<c:forEach items="${list}" var="item">
				<tr>
					<td><h4>${item.flightName}</h4></td>
					<td><h4>${item.flightid}</h4></td>
					<td><h4>${item.origin}</h4></td>
					<td><h4>${item.destination}</h4></td>
					<td><h4>${item.departureTime}</h4></td>
					<td><h4>${item.status}</h4></td>
					<td><h4>${item.fare}</h4></td>
				</tr>
			</c:forEach>

		</table>
	</center>
	<!--==============================footer=================================-->
	<footer>
	<div class="container_12">
		<div class="grid_12">
			<div class="socials">
				<a href="#" class="fa fa-facebook"></a> <a href="#"
					class="fa fa-twitter"></a> <a href="#" class="fa fa-google-plus"></a>
			</div>
			<div class="copy">
				Online Travel Portal (c) 2017 | gyendatravels.com | <a href="#">Privacy
					Policy | </a><a href="adminlogin.jsp">Admin</a>
			</div>
		</div>
	</div>
	</footer>
</body>
</html>