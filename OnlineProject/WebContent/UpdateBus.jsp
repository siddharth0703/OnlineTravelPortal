<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="com.hcl.DAO.BusDAO" %>
    <%@ page import="com.hcl.aojo.BusAjo" %>
    <%@page import="java.util.List"%>
    <%@page import="com.hcl.servlets.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Bus</title>
</head>
<link rel="stylesheet" href="css/1.css">
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/all.css">
<link href="css/bootstrap.css" rel="stylesheet" />
<link href="css/bootstrap-theme.css" rel="stylesheet" />
<script src="js/bootstrap.min.js"></script>
<%
int bid=Integer.parseInt(request.getParameter("id"));
BusDAO bs= new BusDAO();
BusAjo ba=bs.getBusById(bid);


%>
<%-- &name=<%=ba.getbName()%>&dept=<%=ba.getDeptCity()%> --%>
<%-- 	&seat=<%=ba.getSeats()%>&acity=<%=ba.getArrCity()%>&details=<%=ba.getbDetails()%> --%>

<body>
<center><h1>Registration Form</h1>
	<form action="ServletUpdate" method="post">
		<table cellpadding="3pt">
			<tr>
			<td>Bus Id :</td>
				<td><input type="text" name="bId" size="30" value="<%=ba.getId()%>"/></td>
			</tr>
				<td>Bus Name :</td>
				<td><input type="text" name="bName" size="30" value="<%=ba.getbName()%>" /></td>
			</tr>
			

			
			<tr>
				<td>Bus Depart City</td>
				<td><input type="text" name="b_dCity" size="30" value="<%=ba.getDeptCity()%>" /></td>
			</tr>
			<tr>
				<td>Bus Arrival City</td>
				<td><input type="text" name="b_aCity" size="30"  value="<%=ba.getArrCity()%>"/></td>
			</tr>
			<tr>
				<td>Seats</td>
				<td><input type="text" name="b_seats" size="5"  value="<%=ba.getSeats()%>" /></td>
			</tr>
			
			<tr>
				<td>Bus Details:</td>
				<td><input type="text" name="b_details" size="10"  value="<%=ba.getbDetails()%>" placeholder="d-MMM-yyyy,HH:mm:ss aaa"></td> 
				
			</tr>
		</table>
		<p />
		<input type="submit" value="UpdateBus" />
	</form></center>
</body>
</html>