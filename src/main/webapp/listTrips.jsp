<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show All Trips</title>
</head>
<body>
<table>
    <thead>
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Trips from station A to station B between selected time</strong>
        <tr>
            <th>Station Name</th>
            <th>Departure Date</th>
            <th>Arrival Date</th>
            <th>Arrival Station</th>
            <th>Train Number</th>

        </tr>
    </thead>
    <tbody>
    <c:forEach items="${trips}" var="trip">
        <tr>
            <td><c:out value="${trip.stationName}" /></td>
            <td><c:out value="${trip.departureDate}" /></td>
            <td><c:out value="${trip.arrivalDate}" /></td>
            <td><c:out value="${trip.arrivalStation}" /></td>
            <td><c:out value="${trip.trainNumber}" /></td>

        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<a href="admin.jsp">Return to admin page</a>
</body>
</html>

