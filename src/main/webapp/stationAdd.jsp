<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Add New Station</title>
</head>
<body>
<form action="StationServlet.do" method="POST">
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Station add</strong>
    <fieldset>
        <div>
            <label for="idAdd">Station ID</label> <input type="text"
                                                      name="idAdd" value="<c:out value="${station.idAdd}" />"
                                                      placeholder="Station ID" />
        </div>
        <div>
            <label for="stationName">Station Name</label> <input type="text"
                                                                 name="stationName" value="<c:out value="${station.stationName}" />"
                                                                 placeholder="Station Name" />
            <input type="submit" value="Submit" />
        </div>
    </fieldset>
</form>
</body>
</html>

