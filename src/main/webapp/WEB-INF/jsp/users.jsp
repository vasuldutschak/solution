<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <link href="<c:url value="/static/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/static/js/jquery.min.js"/> "></script>
    <script src="<c:url value="/static/js/bootstrap.min.js"/> "></script>
    <%--<script src="<c:url value="/static/js/jquery.validate.min.js"/> "></script>--%>
</head>
<body>


<div class="container">
    <nav class="navbar navbar-default container-fluid">
        <div class="container">
            <ul class="nav navbar-nav">
                <li><a href="<c:out value="/index"/>">Home</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Task0 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="<c:out value="/task0users"/>">all users</a></li>
                        <li><a href="<c:out value="/task0movies"/>">all movies</a></li>
                        <li><a href="<c:out value="/task0ratings"/>">all ratings</a></li>
                    </ul>
                </li>
                <li><a href="<c:out value="/task1"/>">Task1</a></li>
                <li><a href="<c:out value="/task1"/>">Task2</a></li>
                <li><a href="<c:out value="/task3/between/4/5"/>">Task3</a></li>
                <li><a href="<c:out value="/task4"/>">Task4</a></li>
                <li><a href="<c:out value="/task0movies"/>">Task5</a></li>
                <li><a href="<c:out value="/task0ratings"/>">Task6</a></li>
            </ul>
        </div>
    </nav>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>user id</th>
                <th>user name</th>
               <%-- <th>details</th>
                <th>operations</th>--%>
            </tr>
        </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td><c:out value="${user.id}"></c:out></td>
                        <td><c:out value="${user.name}"></c:out></td>
                       <%-- <td><a href="<c:out value="/users/${user.id}"/>">details</a></td>
                        <td>
                            <form action="<c:out value="/users/${user.id}/removing"/>" method="post"> <button type="submit">remove</button></form></td>--%>
                    </tr>
                </c:forEach>
            </tbody>
    </table>
</div>
</body>

</html>
