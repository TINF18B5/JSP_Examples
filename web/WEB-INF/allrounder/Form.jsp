<%--
  Created by IntelliJ IDEA.
  User: Timo Klenk
  Date: 20/06/2019
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Form</title>
    <meta charset="UTF-8"/>
</head>
<body>
<h1>Überschrift</h1>

<c:out value="${'Hello'}"/>


<form method="post">
    <label for="username">User name: </label><input type="text" id="username" name="user_name"><br/>
    <label for="date">Datum: </label><input type="date" id="date" name="date"><br/>
    <button type="submit">Abschicken</button>
</form>

</body>
</html>
