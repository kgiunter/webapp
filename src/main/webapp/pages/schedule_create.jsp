<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>New schedule</title>
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


<body>

<div class="container" style="width: 300px;">

    <form:form method="post" commandName="schedule" action="${pageContext.request.contextPath}/schedule/create.html" name="scheduleCreate">


        <h3>New schedule:</h3>

        <!-- fields -->

        <c:if test="${not empty message}">
            <div class="error">${message}</div>
        </c:if>

        <div class="control-group">
            <div class="controls">
                <form:errors path="nameDepartureStation" cssClass="label label-important" />
                <div>
                    <form:input path="nameDepartureStation" type="text" class="form-control" name="nameDepartureStation" placeholder="departure station's name"/>
                </div>
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <form:errors path="nameArrivalStation" cssClass="label label-important" />
                <div>
                    <form:input path="nameArrivalStation" type="text" class="form-control" name="nameArrivalStation" placeholder="arrival station's name"/>
                </div>
            </div>
        </div>


        <div class="control-group">
            <div class="controls">
                <form:errors path="numberTrain" cssClass="label label-important" />
                <div>
                    <form:input path="numberTrain" type="text" class="form-control" name="numberTrain" placeholder="train's number"/>
                </div>
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <form:errors path="departureDate" cssClass="label label-important" />
                <div>
                    <form:input path="departureDate" type="date" class="form-control" name="departureDate" placeholder="departure date"/>
                </div>
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <form:errors path="departureTime" cssClass="label label-important" />
                <div>
                    <form:input path="departureTime" type="time" class="form-control" name="departureTime" placeholder="departure time"/>
                </div>
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <form:errors path="arrivalDate" cssClass="label label-important" />
                <div>
                    <form:input path="arrivalDate" type="date" class="form-control" name="arrivalDate" placeholder="arrival date"/>
                </div>
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <form:errors path="arrivalTime" cssClass="label label-important" />
                <div>
                    <form:input path="arrivalTime" type="time" class="form-control" name="arrivalTime" placeholder="arrival time"/>
                </div>
            </div>
        </div>



        <!-- end -->


        <button class="btn btn-lg btn-primary btn-block" type="submit">Create schedule</button>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    </form:form>
    <a href="${pageContext.request.contextPath}/station/list.html">Home page</a>

</div>

</body>
</html>
