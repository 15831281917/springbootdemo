<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>username</td>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>${user.username}</tr>
        <tr>${user.id}</tr>
    </c:forEach>
</table>

</body>
</html>
