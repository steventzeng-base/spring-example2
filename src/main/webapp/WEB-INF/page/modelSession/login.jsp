<%--
    Document   : login
    Created on : Feb 24, 2012, 12:48:40 AM
    Author     : steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form commandName="user" method="post">
            Name:<form:input path="name"/>
            Age<form:input path="age"/>
            <input type="submit"/>
        </form:form>
    </body>
</html>
