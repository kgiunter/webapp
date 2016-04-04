<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show All Stations</title>
</head>
<body>
<table>
    <thead>
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Stations</strong>
    <tr>
        <th>Station ID</th>
        <th>Station Name</th>

        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stations}" var="station">
        <tr>
            <td><c:out value="${station.id}" /></td>
            <td><c:out value="${station.stationName}" /></td>

            <td><a
                    href="StationServlet.do?action=edit&id=<c:out value="${station.id }"/>">Update</a></td>
            <td><a
                    href="StationServlet.do?action=delete&id=<c:out value="${station.id }"/>">Delete</a></td>
            <td><a
                    href="ScheduleServlet.do?action=show&id=<c:out value="${station.id }"/>">Show schedule</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <a href="StationServlet.do?action=insert">Add Station</a>
</p>
<br>
<a href="admin.jsp">Return to admin page</a>
</body>
</html>