<%--
  Created by IntelliJ IDEA.
  User: maiza
  Date: 18/05/2019
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Goals Report</title>
    <table>
        <tr>
            <th>Minutes</th><th>Exercise Minutes</th><th>Activity</th>
        </tr>
        <c:forEach items="${goalReports}" var="goalReport">
            <tr>
                <td>${goalReport.goalMinutes}</td><td>${goalReport.exerciseMinutes}</td><td>${goalReport.exerciseActivity}</td>
            </tr>

        </c:forEach>

    </table>
</head>
<body>

</body>
</html>
