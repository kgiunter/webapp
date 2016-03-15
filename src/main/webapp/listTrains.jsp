<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show All Trains</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Train ID</th>
        <th>Train Number</th>
        <th>Places count</th>
        <th>Arrival station</th>

        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${trains}" var="train">
        <tr>
            <td><c:out value="${train.id}" /></td>
            <td><c:out value="${train.trainNumber}" /></td>
            <td><c:out value="${train.placesCount}" /></td>
            <td><c:out value="${train.arrivalStation}" /></td>

            <td><a
                    href="TrainServlet.do?action=edit&id=<c:out value="${train.id }"/>">Update</a></td>
            <td><a
                    href="TrainServlet.do?action=delete&id=<c:out value="${train.id }"/>">Delete</a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <a href="TrainServlet.do?action=insert">Add Train</a>
</p>
<br>
<a href="adminPage.jsp">Return to admin page</a>
</body>
</html>