<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Schedules</title>

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
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand">Schedules</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="<c:url value="/schedule/" />">Schedules <span class="sr-only">(current)</span></a></li>
                        <li><a href="<c:url value="/stationsU/list.html" />">Stations</a></li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/schedule/search.html">
                        <div class="form-group">
                            <input type="text" name="search" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a>Help</a></li>
                        <li><a href="<c:url value="/stationsU/list.html" />">Home</a></li>
                        <li><a> Welcome : ${pageContext.request.userPrincipal.name}</a></li>
                        <li> <a href="<c:url value="/logout" />" > Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <table class="table table-striped table-hover ">
            <thead>
            <tr>
                <th>Name Station</th>
                <th>Arrival Station</th>
                <th>Number Train</th>
                <th>Name Train</th>
                <th>Departure Date</th>
                <th>Arrival Date</th>

            </tr>
            </thead>

            <tbody>
            <c:forEach items="${schedules}" var="schedule">

                <tr class="success">
                    <td><c:out value="${schedule[0]}" /></td>
                    <td><c:out value="${schedule[1]}" /></td>
                    <td><c:out value="${schedule[2]}" /></td>
                    <td><c:out value="${schedule[3]}" /></td>
                    <td><c:out value="${schedule[4]}" /></td>
                    <td><c:out value="${schedule[5]}" /></td>

                </tr>



            </c:forEach>
            </tbody>
        </table>

    </div>
</div>

</body>
</html>
