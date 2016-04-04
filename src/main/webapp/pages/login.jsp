<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">


    <title>Login page</title>


    <style>
        <%@include file='/pages/css/bootstrap.css' %>

        <%@include file='/pages/css/jumbotron-narrow.css' %>

        .error {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
            color: #a94442;
            background-color: #f2dede;
            border-color: #ebccd1;
        }

        .msg {
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
            color: #31708f;
            background-color: #d9edf7;
            border-color: #bce8f1;
        }

    </style>


</head>

<body onload='document.loginForm.username.focus();'>

<div class="container" style="width: 300px;">

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>



        <form name='loginForm'
              action="<c:url value='/j_spring_security_check' />" method='POST'>
        <h2 class="form-signin-heading">Please sign in</h2>

            <span class="glyphicons glyphicons-user"><input type="text" class="form-control" name="username" placeholder="Login" required autofocus ></span>

        <input type="password" class="form-control" name="password" placeholder="Password" required >
        <button class="btn btn-lg btn-primary btn-block" type="submit">Enter</button>

            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
    </form>
</div>

</body>
</html>