<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trains</title>

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
                    <a class="navbar-brand">Trains</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="<c:url value="/station/list.html" />">Stations </a></li>
                        <li class="active"><a href="<c:url value="/train/list.html" />">Trains<span class="sr-only">(current)</span></a></li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/train/search.html">
                        <div class="form-group">
                            <input type="text" name="search" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a>Help</a></li>
                        <li><a href="<c:url value="/admin" />">Home</a></li>
                        <li><a> Welcome : ${pageContext.request.userPrincipal.name}</a></li>
                        <li> <a href="<c:url value="/logout" />" > Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <table class="table table-striped table-hover ">
            <thead>
            <tr>
                <th>Train id</th>
                <th>Train number</th>
                <th>Train name</th>
                <th>Arrival station</th>
                <th>Count of places</th>
                <th>Active</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${trains}" var="train">
                <c:if test="${train.status eq 1}">
                    <tr class="success">
                        <td><c:out value="${train.id}" /></td>
                        <td><c:out value="${train.numberTrain}" /></td>
                        <td><c:out value="${train.nameTrain}" /></td>
                        <td><c:out value="${train.arrivalStation}" /></td>
                        <td><c:out value="${train.countPlaces}" /></td>
                        <td><c:out value="${train.status}" /></td>
                    </tr>
                </c:if>

                <c:if test="${train.status eq 0}">
                    <tr class="danger">
                        <td><c:out value="${train.id}" /></td>
                        <td><c:out value="${train.numberTrain}" /></td>
                        <td><c:out value="${train.nameTrain}" /></td>
                        <td><c:out value="${train.arrivalStation}" /></td>
                        <td><c:out value="${train.countPlaces}" /></td>
                        <td><c:out value="${train.status}" /></td>
                    </tr>

                </c:if>

            </c:forEach>
            </tbody>
        </table>

        <p><a class="btn btn-lg btn-success" href="${pageContext.request.contextPath}/train/create.html" role="button">Add train</a></p>



    </div>
</div>

</body>
</html>
