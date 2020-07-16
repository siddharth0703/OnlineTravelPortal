<%@page import="java.util.concurrent.ThreadLocalRandom"%>
<%@page import="com.hcl.flights.FlightDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Bus Search Results Page</title>
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
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
</style>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>

<body>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-black w3-bar w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="index.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Home</a>
    <a href="Bus.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bus</a>
    <a href="flight.html" class="w3-bar-item w3-button w3-padding-large w3-white">Flight</a>
    <a href="Train.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Train</a>
    <a href="Hotel.html" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Hotel</a>
    <a href="register.jsp" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Sign Up</a>
  <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Login</a>
  </div>
  </div>
  
  <!-- Navbar on small screens -->
  <div id="navDemo" class="w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large">
    <a href="template.html" class="w3-bar-item w3-button w3-padding-large">Bus</a>
    <a href="flight.html" class="w3-bar-item w3-button w3-padding-large">Flight</a>
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
	<!-- ***************body content************* -->
	<br>
	<center><h1>Here All your Bus Details........</h1>
	<table border='3px'>
			<br><br>
		<tr>
			<th><font color='red'><h3>Bus-ID&nbsp; &nbsp;</h3></font>
			<th><font color='red'><h3>Bus Name&nbsp; &nbsp;</h3></font>
			<th><font color='red'><h3>Origin&nbsp; &nbsp;</h3></font>
			<th><font color='red'><h3>Destination&nbsp; &nbsp;</h3></font>
			<th><font color='red'><h3>Bus Details&nbsp; &nbsp;</h3></font> 
			<th><font color='red'><h3>Seats&nbsp; &nbsp;</h3></font> 
			<th><font color='red'><h3>Fare&nbsp; &nbsp;</h3></font>
			<th><font color='red'><h3>Booking&nbsp; &nbsp;</h3></font>
		</tr>
		<%int randomNum = ThreadLocalRandom.current().nextInt(100, 1000 + 1); %>
		<c:forEach items="${buslist}" var="l">
			<tr>
				<td><h4>${l.id}</h4></td>
				<td><h4>${l.bName}</h4></td>
				<td><h4>${l.deptCity}</h4></td>
				<td><h4>${l.arrCity}</h4></td>
				<td><h4>${l.bDetails}</h4></td>
				<td><h4>${14}</h4></td>
				<td><h4><%=randomNum %></h4></td>
				<td><h4><a href="Booking.html"><input type="submit" value="Book Now"></a></h4></td>
			</tr>
		</c:forEach>
	</table></center>
<br>
<br>
		
		
</body>
</html>