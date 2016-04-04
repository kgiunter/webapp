
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style>
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



<body onload='document.stationCreate.nameStation.focus();'>

<div class="container" style="width: 300px;">

<form:form method="post" commandName="station" action="${pageContext.request.contextPath}/station/create.html" name="stationCreate">

<h3>Station name:</h3>
                   <form:input path="nameStation" type="text" class="form-control" name="nameStation" placeholder="station name"/>
                   <form:errors path="nameStation" cssStyle="color: red;"/>


                   <button class="btn btn-lg btn-primary btn-block" type="submit">Create station</button>
                                                                                                  <br>

                                                                                                  <input type="hidden"
name="${_csrf.parameterName}"
value="${_csrf.token}"/>

</form:form>
<a href="${pageContext.request.contextPath}/station/list.html">Home page</a>


                                                                          </div>


<!-- new -->
<div class="white-block" style="width: 500px;">
<h3>Station name:</h3>
                   <form:form method="post" commandName="station" action="${pageContext.request.contextPath}/station/create.html" name="stationCreate" cssClass="form-horizontal" cssStyle="margin: 0 auto;">
                   <div class="control-group">
<form:label path="nameStation" cssClass="control-label">
<div class="controls">
<form:errors path="nameStation" cssClass="label label-important" />
<div>
 <form:input path="nameStation" placeholder="station's name" cssClass="reg-input" size="64" />
 </div>
   </div>
     </div>


       <div class="control-group">
<div class="controls">
<button type="submit" class="btn large btn-success">Create station</button>
                                                                    </div>
                                                                      </div>

                                                                        <input type="hidden"
name="${_csrf.parameterName}"
value="${_csrf.token}"/>
</form:form>
<a href="${pageContext.request.contextPath}/station/list.html">Home page</a>
                                                                          </div>







                                                                            </div>
</body>
</html>
