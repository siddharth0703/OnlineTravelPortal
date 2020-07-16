<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>View Flight</title>

<!-- Bootstrap core CSS -->
<link href="adminsupport/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="adminsupport/css/simple-sidebar.css" rel="stylesheet">
<style>
li a:hover, .dropdown:hover .dropbtn {
	background-color: #555;
	
}

li.dropdown {
	display: inline-block;
	background-color: black;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: grey;
	min-width: 200px;
}

.dropdown-content a {
	color: white;
	
	text-decoration: none;
	display: block;
	text-align: center;
}

.dropdown-content a:hover {
	background-color: white
}

.dropdown:hover .dropdown-content {
	display: inline-block;
}
</style>
</head>

<body>


	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li><a href="AdminMediate.jsp">Home</a></li>
				<li class="dropdown"><a href="#" class="dropbtn">Flights</a>
					<div class="dropdown-content">
						<a href="AddFlight.jsp">Add Flights</a> <a href="ProcessAdmin.jsp">View
							Flights</a>
					</div></li>
				<li><a href="ProcessAdminUser.jsp">User</a></li>

				<li class="dropdown"><a href="#" class="dropbtn">Bus</a>
					<div class="dropdown-content">
						<a href="Busadd.jsp">Add Bus</a> <a
							href="AllBusEntery.jsp">View Bus</a>
					</div></li>
				<br>
				<li class="dropdown"><a href="#" class="dropbtn">Hotels</a>
					<div class="dropdown-content">
						<a href="AddHotel.jsp">Add Hotel</a> <a
							href="ProcessAdminHotel.jsp">View Hotel</a>
					</div></li>
				<li><a href="#">Feedback</a></li>
				<li class="dropdown"><a href="#" class="dropbtn">Transport</a>
					<div class="dropdown-content">
						 <a href="BikeHome.jsp">Bikes</a>
					</div></li>
				<li><a href="LogoutServ">Logout</a></li>
			</ul>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">
			<div class="container-fluid">
				<!-- ***************body content************* -->
				<table border='1' >

					<tr>
						<th><font color='black'><h4>Flight Name&nbsp;&nbsp;</h4></font>
						</th>
						<th><font color='black'><h4>Flight Number&nbsp;</h4></font></th>
						<th><font color='black'><h4>Origin&nbsp;&nbsp;</h4></font></th>
						<th><font color='black'><h4>Destination&nbsp;&nbsp;</h4></font></th>
						<th><font color='black'><h4>Departure
									Time&nbsp;&nbsp;</h4></font></th>
						<th><font color='black'><h4>Runs On&nbsp;&nbsp;</h4></font></th>
						<th><font color='black'><h4>Fare&nbsp;&nbsp;</h4></font></th>
					</tr>

					<c:forEach items="${flightList}" var="list">
						<tr>
							<td><h5>${list.flightName}</h5></td>
							<td><h5>${list.flightid}</h5></td>
							<td><h5>${list.origin}</h5></td>
							<td><h5>${list.destination}</h5></td>
							<td><h5>${list.departureTime}</h5></td>
							<td><h5>${list.status}</h5></td>
							<td><h5>${list.fare}</h5></td>
						</tr>
					</c:forEach>
				</table>
				<form action="FlightController" method="POST">
					<center>
						<select name="flightid">
							<c:forEach items="${flightList}" var="flight">
								<option value="${flight.flightid}">${flight.flightid}</option>
							</c:forEach>
						</select> <br> <br>

						<button type="submit" id="deleteFlight" class="btn btn-secondary"
							name="deleteFlight">Delete</button>
					</center>

				</form>

				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <a href="#menu-toggle" class="btn btn-secondary"
					id="menu-toggle">Toggle Menu</a>
			</div>
		</div>

	</div>


	<!-- Bootstrap core JavaScript -->
	<script src="adminsupport/vendor/jquery/jquery.min.js"></script>
	<script src="adminsupport/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Menu Toggle Script -->
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

</body>

</html>