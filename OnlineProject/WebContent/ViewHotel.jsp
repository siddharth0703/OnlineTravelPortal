<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Result</title>
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/all.css">
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
				<!-- ***************body content************* -->
				<center>
				<table border="1">
					<br><br><br><br><br><br>
					<tr>
						<th><font color='red'><h3>Hotel Name&nbsp;&nbsp;</h3></font>
						</th>
						<th><font color='red'><h3>Address&nbsp;</h3></font></th>
						<th><font color='red'><h3>City&nbsp;&nbsp;</h3></font></th>
						<th><font color='red'><h3>Contact No.&nbsp;&nbsp;</h3></font></th>
						<th><font color='red'><h3>Rate</h3>(per night)&nbsp;&nbsp;</font></th>
						
					</tr>

					<c:forEach items="${hotelList}" var="list">
						<tr>
							<td><h4>${list.hotelName}</h4></td>
							<td><h4>${list.address}</h4></td>
							<td><h4>${list.hotelCity}</h4></td>
							<td><h4>${list.contactNumber}</h4></td>
							<td><h4>${list.fare}</h4></td>
							<td><h4><a href="Book.jsp"><input type="submit" value="Book Now"></a></h4></td>
						</tr>
					</c:forEach>
				</table>
				</center>
				</div>
			<!--==============================footer=================================-->
	
</body>
</html>
