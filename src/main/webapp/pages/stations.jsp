<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stations</title>

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
                    <a class="navbar-brand">Stations</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="<c:url value="/station/list.html" />">Stations <span class="sr-only">(current)</span></a></li>
                        <li><a href="<c:url value="/trains" />">Trains</a></li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/station/search.html">
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
                 <th>Station id</th>
                 <th>Station name</th>
                 <th>Active</th>
                 <th>Schedule</th>
             </tr>
       </thead>

    <tbody>
        <c:forEach items="${stations}" var="station">
            <c:if test="${station.status eq 1}">
                <tr class="success">
                    <td><c:out value="${station.id}" /></td>
                    <td><c:out value="${station.nameStation}" /></td>
                    <td><c:out value="${station.status}" /></td>
                    <td><a href="${pageContext.request.contextPath}/schedule/${station.id}.html" > Schedule </a></td>
                </tr>
            </c:if>

            <c:if test="${station.status eq 0}">
                <tr class="danger">
                    <td><c:out value="${station.id}" /></td>
                    <td><c:out value="${station.nameStation}" /></td>
                    <td><c:out value="${station.status}" /></td>
                    <td><a href="${pageContext.request.contextPath}/schedule/${station.id}.html" > Schedule </a></td>
                </tr>

            </c:if>

        </c:forEach>
    </tbody>
   </table>

        <p><a class="btn btn-lg btn-success" href="${pageContext.request.contextPath}/station/create.html" role="button">Add station</a></p>



    </div>
</div>

</body>
</html>
