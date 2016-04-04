<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin</title>
    <style>
        <%@include file='/pages/css/bootstrap.css' %>
        <%@include file='/pages/css/jumbotron-narrow.css' %>
    </style>

</head>


<body>

<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">


        <c:if test="${pageContext.request.userPrincipal.name != null}">
        <p style="text-align: right">
            <h4>Welcome : ${pageContext.request.userPrincipal.name}
                | <a href="<c:url value="/logout" />" > Logout</a></h4>
        </c:if>

        <ul class="nav nav-pills">
            <li><a href="<c:url value="/stations" />">Stations</a></li>
            <li><a href="<c:url value="/trains" />">Trains</a></li>
            <li><a href="<c:url value="/" />">Main page</a></li>
        </ul>

        <form>

        </form>


</div>
    </div>

</body>
</html>
