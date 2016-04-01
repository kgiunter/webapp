<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">

    <title>Welcome</title>

    <!-- Bootstrap core CSS -->

    <style>
        <%@include file='/pages/css/bootstrap.css' %>

        <%@include file='/pages/css/jumbotron-narrow.css' %>

    </style>


    <link href="<c:url value="/pages/css/bootstrap.css" />" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/pages/css/jumbotron-narrow.css" />" rel="stylesheet">


</head>


<body>

<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">
        <h1>Railway</h1>
        <p class="lead">
            Добро пожаловать в Railway web application!
        </p>
        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="/pages/login.jsp" />" role="button">Войти</a></p>

        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Ваш логин: <sec:authentication property="principal.username" /></p>
            <p><a class="btn btn-lg btn-danger" href="<c:url value="/logout.jsp" />" role="button">Выйти</a></p>

        </sec:authorize>
    </div>


    <div class="footer">

        <p>© Katia Giunter</p>
    </div>

</div>
</body>
</html>