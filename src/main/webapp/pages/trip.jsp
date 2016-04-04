<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Trip</title>
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


        body { background: url("https://img1.goodfon.ru/wallpaper/big/a/17/vokzal-rzhd-poezd.jpg"); }

    </style>


</head>


<body>

<div class="container" style="width: 450px;">
    <div class="jumbotron" style="margin-top: 20px;">

    <form:form method="post" commandName="trip" action="${pageContext.request.contextPath}/trip/search.html" name="tripCreate">

        <h3>Please select a trip:</h3>

        <c:if test="${not empty message}">
            <div class="error">${message}</div>
        </c:if>


        <div class="form-group">
            <label class="control-label"></label>
            <div class="input-group">
                <span class="input-group-addon" >Departure station</span>
                <input type="text" class="form-control" name="departureStation" placeholder="Departure station">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon">Arrival station</span>
                <input type="text" class="form-control" name="arrivalStation">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon">Departure date</span>
                <input type="date" class="form-control" name="departureDate">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon">Departure time</span>
                <input type="time" class="form-control" name="departureTime">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon">Arrival date</span>
                <input type="date" class="form-control" name="arrivalDate">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon">Arrival time</span>
                <input type="time" class="form-control" name="arrivalTime">
            </div>

        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Search a trip</button>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    </form:form>

    <a href="${pageContext.request.contextPath}/">Home page</a>
</div>

</div>
    </body>
    </html>




