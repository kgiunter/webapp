<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Train list</title>
</head>
<body>
<h1>Train List page</h1>
<table style="text-align: center;" border="1px" cellpadding="0" cellspacing="0" >
    <thead>
    <tr>
        <th width="25px">id</th><th width="150px">numberTrain</th><th width="25px">nameTrain</th><th width="25px">countPlace</th><th width="50px">actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="train" items="${trainList}">
        <tr>
            <td>${train.id}</td>
            <td>${train.numberTrain}</td>
            <td>${train.nameTrain}</td>
            <td>${train.countPlaces}</td>
            <td>
                <a href="${pageContext.request.contextPath}/train/edit/${train.id}.html">Edit</a><br/>
                <a href="${pageContext.request.contextPath}/train/delete/${train.id}.html">Delete</a><br/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="${pageContext.request.contextPath}/">Home page</a>
</body>
</html>

