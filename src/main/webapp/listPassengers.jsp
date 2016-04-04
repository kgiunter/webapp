<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show All Passengers</title>
</head>
<body>
<table>
    <thead>
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Passengers</strong>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Birthday</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${passengers}" var="passenger">
        <tr>
            <td><c:out value="${passenger.firstName}" /> </td>
            <td><c:out value="${passenger.lastName}" /></td>
            <td><c:out value="${passenger.birthday}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<br>
<a href="admin.jsp">Return to admin page</a>
</body>
</html>