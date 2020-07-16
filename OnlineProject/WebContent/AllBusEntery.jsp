<%@page import="com.hcl.DAO.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.hcl.DAO.BusDAO"%>
<%@ page import="com.hcl.aojo.BusAjo"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="adminsupport/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="adminsupport/css/simple-sidebar.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Details</title>
</head>
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

<body>
	<link href="css/bootstrap.css" rel="stylesheet" />
	<link href="css/bootstrap-theme.css" rel="stylesheet" />
	<script src="js/bootstrap.min.js"></script>

	<%
		BusDAO bs= new BusDAO();
	List<BusAjo> list=bs.getAllBuses();
	%>
	<i><hr>
		<br> <%
 	{for(BusAjo b:list)
 	System.out.println(b);}
 %></i>
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
						<a href="Busadd.jsp">Add Bus</a> <a href="AllBusEntery.jsp">View
							Bus</a>
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



		<table style="width: 100%" border="1">
			<tr>
				<th>Bus Id</th>
				<th>Bus Name</th>
				<th>Bus Depart</th>
				<th>ArrCity</th>
				<th>B_Seat</th>
				<th>B_Details</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<%
				for(int i=0;i<list.size();i++){
			%>
			<tr>
				<td><%=list.get(i).getId()%></td>
				<td><%=list.get(i).getbName()%></td>
				<td><%=list.get(i).getArrCity()%></td>
				<td><%=list.get(i).getDeptCity()%></td>
				<td><%=list.get(i).getSeats()%></td>
				<td><%=list.get(i).getbDetails()%></td>
				<td><a href="UpdateBus.jsp?id=<%=list.get(i).getId()%>">Update</a>
				</td>
				<td><a href="DeleteBus?id=<%=list.get(i).getId()%>">Delete</a></td>
				<%
					}
				%>
			</tr>
		</table>
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <a href="#menu-toggle" class="btn btn-secondary"
			id="menu-toggle">Toggle Menu</a>

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