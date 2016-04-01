<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>New station</title>
</head>
<body>
<h1>New Shop page</h1>
<form:form method="post" commandName="station" action="${pageContext.request.contextPath}/station/create.html" >
    <table>
        <tbody>

        <tr>
            <td>Station name:</td>
            <td><form:input path="nameStation" type="text" name="nameStation" /></td>
            <td><form:errors path="nameStation" cssStyle="color: red;"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Create" /></td>
        </tr>

        </tbody>
    </table>

    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>

</form:form>
<a href="${pageContext.request.contextPath}/station">Home page</a>
</body>
</html>