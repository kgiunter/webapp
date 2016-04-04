<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>


<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


    <title>Add New Train</title>
</head>
<body>
<form action="TrainServlet.do" method="POST">
    <p style="text-align: center">
        <strong style="color: blue; font-size: 2em">Train add</strong>
    <fieldset>
        <div>
            <label for="idAdd">Train ID</label> <input type="text"
                                                    name="idAdd" value="<c:out value="${train.idAdd}" />"
                                                    placeholder="Train ID" />
        </div>
        <div>
            <label for="trainNumber">Train Number</label> <input type="text"
                                                                 name="trainNumber" value="<c:out value="${train.trainNumber}" />"
                                                                 placeholder="Train Number" />
        </div>
        <div>
            <label for="placesCount">Places count</label> <input type="text"
                                                                 name="placesCount" value="<c:out value="${train.placesCount}" />"
                                                                 placeholder="Places count" />
        </div>
        <div>
            <label for="arrivalStation">Arrival Station</label> <input type="text" name="arrivalStation"
                                                                       value="<c:out value="${train.arrivalStation}" />" placeholder="Arrival Station" />

            <input type="submit" value="Submit" />
        </div>
    </fieldset>
</form>
</body>
</html>

