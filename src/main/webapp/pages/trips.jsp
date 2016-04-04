<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Trips</title>

    <style>
        <%@include file='/pages/bootstrap-3.3.5-dist/css/bootstrap.css' %>
        <%@include file='/pages/bootstrap-3.3.5-dist/css/bootstrap-theme.css' %>
    </style>

</head>


<body>

<div class="container">

    <div class="jumbotron">

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand">Trips</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="">Trips <span class="sr-only">(current)</span></a></li>
                        <li><a href="/trip.jsp">Select trip</a></li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a>Help</a></li>
                        <li><a href="<c:url value="/" />">Home</a></li>
                        <li><a> Welcome : ${pageContext.request.userPrincipal.name}</a></li>
                        <li> <a href="<c:url value="/logout" />" > Logout</a></li>

                    </ul>
                </div>
            </div>
        </nav>

        <table class="table table-striped table-hover ">

            <thead>
            <tr>
                <th>№</th>
                <th>Departure station</th>
                <th>Arrival station</th>
                <th>Number train</th>
                <th>Train's name</th>
                <th>Departure date</th>
                <th>Arrival date</th>
                <th>Buy ticket</th>
            </tr>
            </thead>

            <tbody>

            <c:forEach items="${trips}" var="trip">
                <form:form action="/ticket/buy">

                <tr class="info">
                    <th></th>
                    <td><c:out value="${trip[0]}" /></td>
                    <td><c:out value="${trip[1]}" /></td>
                    <td><c:out value="${trip[2]}" /></td>
                    <td><c:out value="${trip[3]}" /></td>
                    <td><c:out value="${trip[4]}" /></td>
                    <td><c:out value="${trip[5]}" /></td>
                   <td><a class="btn btn-lg btn-primary btn-block" type="submit" role="button">buy ticket</a></td>
                </tr>
            </form:form>
            </c:forEach>
            </tbody>

        </table>

    </div>
</div>
</body>
</html>
