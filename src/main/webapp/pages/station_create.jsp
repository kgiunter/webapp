<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>New station</title>
    <style>
        <%@include file='/pages/bootstrap-3.3.5-dist/css/bootstrap.css' %>
        <%@include file='/pages/bootstrap-3.3.5-dist/css/bootstrap-theme.css' %>

        .error {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
            color: #a94442;
            background-color: #f2dede;
            border-color: #ebccd1;
        }

    </style>


</head>


<body onload='document.stationCreate.nameStation.focus();'>

<div class="container" style="width: 300px;">

    <form:form method="post" commandName="station" action="${pageContext.request.contextPath}/station/create.html" name="stationCreate">

        <h3>New station:</h3>

        <c:if test="${not empty message}">
            <div class="error">${message}</div>
        </c:if>


        <div class="control-group">
            <div class="controls">
                <form:errors path="nameStation" cssClass="label label-important" />
                <div>
                    <form:input path="nameStation" type="text" class="form-control" name="nameStation" placeholder="station's name"/>
                </div>
            </div>
        </div>


        <button class="btn btn-lg btn-primary btn-block" type="submit">Create station</button>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    </form:form>
    <a href="${pageContext.request.contextPath}/station/list.html">Home page</a>

</div>

</body>
</html>