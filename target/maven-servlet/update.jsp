<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/9 0009
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false"%>
<html>
<head>
    <title>更新用户页面</title>
</head>
<body>
    <div>
        <form action="/update" method="post">
            <input type="hidden" name="uid" value="${user.uid}"><br>
            <input type="text" name="username" value="${user.uname}"><br>
            <input type="text" name="password" value="${user.upass}"><br>
            <input type="text" name="gender" value="${user.gender}"><br>
            <input type="text" name="email" value="${user.email}"><br>
            <input type="submit" value="更新用户">
        </form>
    </div>
</body>
</html>
