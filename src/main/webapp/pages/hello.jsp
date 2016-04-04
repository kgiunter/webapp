<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <style>
        <%@include file='/pages/css/bootstrap.css' %>
        <%@include file='/pages/css/jumbotron-narrow.css' %>
    </style>
    <title>Railway</title>
</head>


<body>
<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">
        <h1>Railway</h1>
        <p class="lead">
            Welcome to Railway web application!
        </p>

        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="/login" />" role="button">Enter</a></p>
        </sec:authorize>

        <sec:authorize access="hasRole('ROLE_USER')">
            <p><a class="btn btn-lg btn-danger" href="<c:url value="/logout"/>" role="button">Exit</a></p>

            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <p class="lead">
                    User : ${pageContext.request.userPrincipal.name}
                </p>
            </c:if>

            <div class="btn-group">
                <p><a class="btn btn-lg btn-primary btn-block" href="<c:url value="/pages/trip.jsp"/>" role="button">select a trip</a></p>
                <p><a class="btn btn-lg btn-primary btn-block" href="<c:url value="/stationsU/list"/>" role="button">schedules</a></p>
            </div>
        </sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">
    <p><a class="btn btn-lg btn-default" href="<c:url value="/admin"/>" role="button">go to admin page</a></p>
</sec:authorize>


    </div>

    <div class="footer">
        <p style="text-align: center">
            Katia Giunter 2016 Java School </p>
    </div>

</div>


</body>
</html>
