<%--
    Document   : main
    Created on : Feb 24, 2012, 12:55:30 AM
    Author     : steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>After Login</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Name ${sessionScope.user.name}</h1>
        <h1>Age ${sessionScope.user.age}</h1>
    </body>
</html>
