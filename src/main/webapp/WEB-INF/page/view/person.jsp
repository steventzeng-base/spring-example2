<%--
    Document   : person1
    Created on : Feb 23, 2012, 6:45:40 PM
    Author     : steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="p" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach begin="0" end="9">
            <p:Person person="${person}"/>
        </c:forEach>
    </body>
</html>
