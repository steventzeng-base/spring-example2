<%--
    Document   : Person
    Created on : Feb 23, 2012, 6:31:40 PM
    Author     : steven
--%>

<%@tag description="Show Person" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="person" type="tw.base.mvc.entity.Person" required="true"%>

<%-- any content can be specified here e.g.: --%>
<table>
    <tr>
        <th>ID</th>
        <td>${person.id}</td>
    </tr>
    <tr>
        <th>姓名</th><td>${person.name}</td>
    </tr>
    <tr>
        <th>年齡</th><td>${person.age}${person.age ge 18?'成年':'未成年'}</td>
    </tr>
</table>