<%@taglib prefix="sec"
          uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>Error!</title>
    <style>
        <%@include file='/pages/css/bootstrap.css' %>
        <%@include file='/pages/css/jumbotron-narrow.css' %>
    </style>
    <title>Railway</title>
</head>


<body>
<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">

        <h2>HTTP Status 403 - Access is denied</h2>

        <c:choose>
        <c:when test="${empty username}">
        <h3>You do not have permission to access this page!</h3>
        </c:when>
        <c:otherwise>
        <h3>Username : ${username} <br/>
            You do not have permission to access this page!</h3>
        </c:otherwise>
        </c:choose>

        <li> <a href="<c:url value="/" />" > Return</a></li>

    </div>

    <div class="footer">
        <p style="text-align: center">
            Katia Giunter 2016 Java School </p>
    </div>

</div>






</body>
</html>