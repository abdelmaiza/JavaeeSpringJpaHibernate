<%--
  Created by IntelliJ IDEA.
  User: maiza
  Date: 18/05/2019
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Goals report</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th><th>Minutes</th>
        </tr>
        <c:forEach items="${goals}" var="goal">
            <tr>
                <td>${goal.id}</td>
                <td>${goal.minutes}</td>
                <td>
                    <table>
                        <tr>
                            <th>Excerice Id</th><th>Exercice Minutes</th><th>Exercice activity</th>
                        </tr>
                        <c:forEach items="${goal.exercises}" var="exercice">
                            <tr>
                                <td>${exercice.id}</td>
                                <td>${exercice.minutes}</td>
                                <td>${exercice.activity}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
