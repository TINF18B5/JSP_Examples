<%--

  Created by IntelliJ IDEA.
  User: Timo Klenk
  Date: 20/06/2019
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<jsp:useBean id="unsere_bean" class="jsp.examples.allrounder.beans.Bohne" scope="request"/>
<html>
<head>
    <title>Ergebnis</title>
    <meta charset="UTF-8"/>
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script>
        document.addEventListener("DOMContentLoaded", function (ev) {
            let request = new XMLHttpRequest();
            request.open("GET", "./data", true);
            request.onreadystatechange = function () {
                if (request.readyState === request.DONE) {
                    let objektVomServer = JSON.parse(request.responseText);
                    $("#irgendein_text").text(objektVomServer.name);
                }
            };

            request.send();
        });
    </script>
</head>
<body>

<c:out value="${unsere_bean.date}"/>

<div>
    <span id="irgendein_text"></span>
</div>

</body>
</html>
