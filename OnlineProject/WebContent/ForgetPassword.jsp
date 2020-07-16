<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
</head>
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
<script>
	function confirmPass() {
		var pass = document.forms["myForm"]["password1"].value;
		var confPass = document.forms["myForm"]["password2"].value;
		if (pass != confPass) {
			alert("Password Not Match");
			return false
		}
	}
	function validateEmail() {
    	var email=document.forms["myForm"]["email"].value;
    	if((email.indexOf("@hcl.com", email.length - "@hcl.com".length) == -1)&&(email.indexOf("@gmail.com", email.length - "@gmail.com".length) == -1)&&(email.indexOf("@yahoo.com", email.length - "@yahoo.com".length) == -1)&&(email.indexOf("@hotmail.com", email.length - "@hotmail.com".length) == -1)&&(email.indexOf("@outlook.com", email.length - "@outlook.com".length) == -1)&&(email.indexOf("@rediff.com", email.length - "@rediff.com".length) == -1)){
	    alert("Not a Valid Email.");
    	return false;
    	    }
    	}
</script>
<!-- Navbar -->
<div class="w3-top">
	<div class="w3-bar w3-black w3-bar w3-left-align w3-large">
		<a
			class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-black"
			href="javascript:void(0);" onclick="myFunction()"
			title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
			href="#"
			class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Home</a>
		<a href="template.html"
			class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Bus</a>
		<a href="flight.html"
			class="w3-bar-item w3-button w3-padding-large w3-white">Flight</a> <a
			href="Train.html"
			class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Train</a>
		<a href="Hotel.html"
			class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Hotel</a>
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

<body>


<nav class="navbar navbar-inverse" style="position:relative; top:40px; height:75px; background-color:#99FF99;">
  <div class="container-fluid">
    <ul class="nav navbar-nav navbar-left" style="position:relative; top:12px;">
       

<div class="container-fluid blok1">
  
</div>
<div class="container" style="position:relative;top:70px;">
  <h2 style="color:navy">Forgot Login Password? </h2>
  <form   name="form" action="ForgetPasswordController"  value="Log In" method="POST" />
    <div class="form-group">
      <label for="email id">Email id:</label>
      <input type="email" class="form-control" id="email_id"  placeholder="Email Id" name="email_id">
    </div>
   <br><br>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

<nav class="navbar navbar-inverse" style="position:relative;top:125px;height:20px;width:100%">
  <div class="container-fluid">
    <ul class="nav navbar-nav navbar-left">
        <li style="color:white;position:relative;top:12px;left:550px">@buzzR</li>
    </ul>


</body>
</html>
