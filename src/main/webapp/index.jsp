<!--
<html>
<head>
    <title>Login Page</title>
</head>
<div id="loginBox">
<h2>Hello, please log in:</h2>
<br><br>
<form action="LoginServlet" method="POST">
    <p><strong>Please Enter Your User Name: </strong>
        <input type="text" name="username" size="25">
    <p><p><strong>Please Enter Your Password: </strong>
    <input type="password" size="15" name="password">
    <p><p>
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
</div>
</html>
-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>
    Welcome to "Train application".<br/>
    <i>${message}</i><br/>
    <a href="${pageContext.request.contextPath}/train/create.html">Create a new train</a><br/>
    <a href="${pageContext.request.contextPath}/train/list.html">View all trains</a><br/>

    <a href="adminPage.jsp">admin</a>
</p>
</body>
</html>