<%--
    Document   : home
    Created on : Feb 24, 2012, 12:31:37 AM
    Author     : steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ol>
        <c:forEach items="${persons}" var="person">
            <li>id ${person.id}-${person.name}-age ${person.age}</li>
        </c:forEach>
        </ol>
    </body>
</html>
