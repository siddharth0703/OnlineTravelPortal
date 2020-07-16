<%@page import="java.util.concurrent.ThreadLocalRandom"%>
<%@page import="com.hcl.aojo.LoginAojo"%>
<%@page import="com.hcl.flights.FlightDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.aojo.FlightAjo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/flightticket.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>Insert title here</title>
</head>
<body>
<%List<FlightDetails> l1=(List<FlightDetails>)getServletContext().getAttribute("flightList1"); %>
<%LoginAojo lj= (LoginAojo)getServletContext().getAttribute("books") ;%>
<%String date=(String) getServletContext().getAttribute("date") ; %>
<%int randomNum = ThreadLocalRandom.current().nextInt(1, 60 + 1); %>
		
<div class="box">
  <ul class="left">
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
  </ul>
  
  <ul class="right">
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
  </ul>
  <div class="ticket">
    <span class="airline"></span>
    <span class="airline airlineslip"><%=l1.get(0).getFlightName() %></span>
    <span class="boarding">Boarding pass</span>
    <div class="content">
      <span class="jfk"><%=l1.get(0).getOrigin().substring(0,3).toUpperCase()%></span>
      <span class="plane"><?xml version="1.0" ?><svg clip-rule="evenodd" fill-rule="evenodd" height="60" width="60" image-rendering="optimizeQuality" shape-rendering="geometricPrecision" text-rendering="geometricPrecision" viewBox="0 0 500 500" xmlns="http://www.w3.org/2000/svg"><g stroke="#222"><line fill="none" stroke-linecap="round" stroke-width="30" x1="300" x2="55" y1="390" y2="390"/><path d="M98 325c-9 10 10 16 25 6l311-156c24-17 35-25 42-50 2-15-46-11-78-7-15 1-34 10-42 16l-56 35 1-1-169-31c-14-3-24-5-37-1-10 5-18 10-27 18l122 72c4 3 5 7 1 9l-44 27-75-15c-10-2-18-4-28 0-8 4-14 9-20 15l74 63z" fill="#222" stroke-linejoin="round" stroke-width="10"/></g></svg></span>
      <span class="sfo"><%=l1.get(0).getDestination().substring(0,3).toUpperCase()%></span>
      
      <span class="jfk jfkslip"><%=l1.get(0).getOrigin().substring(0,3).toUpperCase()%></span>
      <span class="plane planeslip"><?xml version="1.0" ?><svg clip-rule="evenodd" fill-rule="evenodd" height="50" width="50" image-rendering="optimizeQuality" shape-rendering="geometricPrecision" text-rendering="geometricPrecision" viewBox="0 0 500 500" xmlns="http://www.w3.org/2000/svg"><g stroke="#222"><line fill="none" stroke-linecap="round" stroke-width="30" x1="300" x2="55" y1="390" y2="390"/><path d="M98 325c-9 10 10 16 25 6l311-156c24-17 35-25 42-50 2-15-46-11-78-7-15 1-34 10-42 16l-56 35 1-1-169-31c-14-3-24-5-37-1-10 5-18 10-27 18l122 72c4 3 5 7 1 9l-44 27-75-15c-10-2-18-4-28 0-8 4-14 9-20 15l74 63z" fill="#222" stroke-linejoin="round" stroke-width="10"/></g></svg></span>
      <span class="sfo sfoslip"><%=l1.get(0).getDestination().substring(0,3).toUpperCase()%></span>
      <div class="sub-content">
        <span class="watermark"><%=l1.get(0).getFlightName() %></span>
        <span class="name">PASSENGER NAME<br><span></span><%=lj.getUserName() %></span>
        <span class="flight">FLIGHT N&deg;<br><span><%=l1.get(0).getFlightid() %></span></span>
        <span class="gate">GATE<br><span>11B</span></span>
        <span class="seat">SEAT<br><span><%=randomNum %>A</span></span>
        <span class="boardingtime">BOARDING TIME<br><span><%=l1.get(0).getDepartureTime() %> ON <%=date %></span></span>
            
         <span class="flight flightslip">FLIGHT N&deg;<br><span><%=l1.get(0).getFlightid() %></span></span>
          <span class="seat seatslip">SEAT<br><span><%=randomNum %>A</span></span>
         <span class="name nameslip">PASSENGER NAME<br><span><%=lj.getUserName() %></span></span>
      </div>
    </div>
    <div class="barcode"></div>
    <div class="barcode slip"></div>
  </div>
</div>


</body>
</html>