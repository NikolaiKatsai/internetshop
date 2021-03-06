<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="user" scope="request" type="katsai.nikolai.internetshop.models.User"/>
<%--
  Created by IntelliJ IDEA.
  User: Nik
  Date: 25.09.2019
  Time: 1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User info</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Id</th>
        <th>Login</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Bucket id</th>
        <th>Orders</th>
    </tr>
    <tr>
        <td><c:out value="${user.userId}"/></td>
        <td><c:out value="${user.login}"/></td>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.surname}"/></td>
        <td><a href="getUserBucket"><c:out value="${user.bucket.bucketId}"/></a></td>
        <td><a href="getUserOrders">orders</a></td>
    </tr>
</table>
</body>
</html>
