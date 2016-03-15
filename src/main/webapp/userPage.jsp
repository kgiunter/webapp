
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h6>  </h6>


<form action="TripsServlet" method="get">

    <p style="text-align: left">
        <strong style="color: blue; font-size: 2em">Select trips:</strong>
        <br>
        <br>
    <p style="text-align: left">
        departure station: <input value="departureStation" type="text" name="departureStation">
        arrival station: <input value="arrivalStation" type="text" name="arrivalStation">
        <br>
        <br>
    <p style="text-align: left">

        time from: <input type="time" name="date1">
        by: <input type="time" name="date2">
        <br>
        <br>
    <p style="text-align: left">
        <input type="submit" style="color: black; font-size: 1em" value="Trips" />
</form>



</body>
</html>
