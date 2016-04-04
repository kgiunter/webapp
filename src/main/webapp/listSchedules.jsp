<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show All Schedules</title>
</head>
<body>
<table>
    <thead>
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Schedules</strong>
        <tr>
            <th>Train Number</th>
            <th>Station Name</th>
            <th>Departure Date</th>
            <th>Arrival Date</th>
            <th>Arrival Station</th>


            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${schedules}" var="schedule">
        <tr>
            <td><c:out value="${schedule.trainNumber}" /> </td>
            <td><c:out value="${schedule.stationName}" /></td>
            <td><c:out value="${schedule.departureDate}" /></td>
            <td><c:out value="${schedule.arrivalDate}" /></td>
            <td><c:out value="${schedule.arrivalStation}" /></td>

            <td><a
                    href="PassengerServlet.do?action=show&id=<c:out value="${schedule.id }"/>">Show passengers</a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<a href="admin.jsp">Return to admin page</a>
</body>
</html>
