<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Admin Home</title>

<!-- Bootstrap core CSS -->
<link href="adminsupport/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="adminsupport/css/simple-sidebar.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 200px;
	height: 1000px;
	background-color: black;
}

li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
	background-color: #555;
	color: white;
}

li.dropdown {
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: grey;
	min-width: 160px;
}

.dropdown-content a {
	color: grey;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #555
}

.dropdown:hover .dropdown-content {
	display: inline-block;
}
</style>
</head>
<body bgcolor="white">
	<ul>
		<li><a class="#" href="AdminMediate.jsp">Home</a></li>
		<li><a href="ProcessAdminUser.jsp">Users</a></li>

		<li class="dropdown"><a href="#" class="dropbtn">Flights</a>
			<div class="dropdown-content">
				<a href="AddFlight.jsp">Add Flights</a>
				 <form action="FlightController" method="post">
				<input type="button" class="btn btn-secondary" name="showFlight"
							value="Show Records">
			</div></li>
		<br>
		<br>
		<li class="dropdown"><a href="#" class="dropbtn">Bus</a>
			<div class="dropdown-content">
				<a href="Busadd.jsp">Add Buses</a> <a href="AllBusEntery.jsp">View
					Buses</a>
			</div></li>
		<br>
		
		<br>
		
		<li class="dropdown"><a href="BikeHome.jsp" class="dropbtn">Bikes</a>
			<div class="dropdown-content">
				<a href="AddBike.jsp">Add Bikes</a> 
				<form action="BikeController" method="post">
				<input type="submit" class="btn btn-secondary" name="showBike"
							value="Show Records">
			</div></li>
		<br>
		<br>
		<li><a href="#">Train</a></li>
		<li><a href="AdminViewFeedback.jsp">Feedback</a></li>
		<a href="LogoutServ">Logout</a>
	</ul>
</body>
</html>