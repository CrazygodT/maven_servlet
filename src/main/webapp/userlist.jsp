<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/9 0009
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--使用el表达式 是否当作字符串来进行处理-->
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>用户页面</title>
</head>
<body>
 <div>
     <table border="1">
         <tr>
             <th>用户名</th>
             <th>密码</th>
             <th>性别</th>
             <th>邮箱</th>
             <th colspan="2">操作</th>
         </tr>
         <c:forEach items="${userList}" var="user">
             <tr>
                 <th>${user.uname}</th>
                 <th>${user.upass}</th>
                 <th>${user.gender}</th>
                 <th>${user.email}</th>
                 <th><a href="/findById?uid=${user.uid}">修改</a></th>
                 <th><a href="/delete?uid=${user.uid}">删除</a></th>
             </tr>
         </c:forEach>
     </table>
 </div>
</body>
</html>
