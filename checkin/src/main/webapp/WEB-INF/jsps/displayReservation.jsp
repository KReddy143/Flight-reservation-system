<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Reservation Details</h2>
	Passenger Name: ${reservation.getPassenger().firstName}<br/>
	Passenger Email: ${reservation.getPassenger().email}<br/>
	Passenger Phone: ${reservation.getPassenger().phone}<br/>
	
	Operating Airline: ${reservation.getFlight().operatingAirlines}<br/>
	Flight Number: ${reservation.getFlight().flightNumber}<br/>
	DepartureCity: ${reservation.getFlight().departureCity}<br/>
	ArrivalCity: ${reservation.getFlight().arrivalCity}<br/>
	dateOfDeparture: ${reservation.getFlight().dateOfDeparture}<br/>
	
	<h2>Update no of Bags & Status</h2>
	<form action="proceedToCheckIn" method="post">
	<pre>
		Reservation id<input type="text" name="id" value="${reservation.id}"/>
		Number of Bags<input type="text" name="numberOfBags"/>
		<input type="submit" value="confirm"/>
	</pre>
	</form>

</body>
</html>