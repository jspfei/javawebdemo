<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/4/24
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p ><a href="login.html">登录</a></p>
<p ><a href="date.html">日期</a></p>
<p ><a href="dom.html">dom实例</a></p>
<jsp:forward page="dom.html">
    <jsp:param name="userid" value="7"></jsp:param>
</jsp:forward>
</body>
</html>
