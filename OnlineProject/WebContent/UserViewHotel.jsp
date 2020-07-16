<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Flight Page</title>
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
<script>   
    $(function() {
         $( "#calendar" ).datepicker({minDate:"0"});  
         $( "#calendar1" ).datepicker({minDate:"0"}); 
         $( "#checkin" ).datepicker({minDate:"0"});  
         $( "#checkout" ).datepicker({minDate:"0"});  
    }); 
</script>
<body>

<!-- Navbar -->
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
<br>
	<!--==============================header=================================-->
	
				<!-- ***************body content************* -->
				<center><h1>Boook Your Hotel Here......</h1>
				<table border="3px">
					<br><br>
					<tr>
						<th><font color='red'><h3>Hotel Name&nbsp;&nbsp;</h3></font>
						</th>
						<th><font color='red'><h3>Address&nbsp;</h3></font></th>
						<th><font color='red'><h3>City&nbsp;&nbsp;</h3></font></th>
						<th><font color='red'><h3>Contact No.&nbsp;&nbsp;</h3></font></th>
						<th><font color='red'><h3>Rate</h3>(per night)&nbsp;&nbsp;</font></th>
						<th><font color='red'><h3>Booking&nbsp;&nbsp;</h3></font></th>
					</tr>

					<c:forEach items="${hotelList}" var="list">
						<tr>
							<td><h4>${list.hotelName}</h4></td>
							<td><h4>${list.address}</h4></td>
							<td><h4>${list.hotelCity}</h4></td>
							<td><h4>${list.contactNumber}</h4></td>
							<td><h4>${list.fare}</h4></td>
							<td><h4><a href="Booking.html"><input type="submit" value="Book Now"></a></h4></td>
						</tr>
					</c:forEach>
				</table>
				</center>
				<br><br>
	<!--==============================footer=================================-->
	<footer>

<table style="width:100%">
<tr><td><h3>Help</h3></b></td>
<td><h3>Popular</h3></td>
<td><h3>NBCI</h3></td></tr>
<tr><td>FAQ</td>
<td>Email</td>
<td>Phone</td></tr>
<tr><td>Trivago</td>
<td>Yatra</td>
<td>MakeMyTrip</td>
</tr>
<tr><td>Trainning</td>
<td>Tutorial</td>
<td>Bugs</td></tr>

</tr>
</table>
</footer>
