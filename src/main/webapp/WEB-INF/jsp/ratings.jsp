<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <link href="<c:url value="/static/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/static/js/jquery.min.js"/> "></script>
    <script src="<c:url value="/static/js/bootstrap.min.js"/> "></script>
    <script src="<c:url value="/static/js/jquery.validate.min.js"/> "></script>
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
    <tr>
        <th>rating id</th>
        <th>user name</th>
        <th>movie name</th>
        <th>rating date</th>
        <th>rating</th>
        <th>details</th>
    </tr>
    <c:forEach items="${ratings}" var="rating">
        <tr>
            <td><c:out value="${rating.id}"/></td>
            <td><c:out value="${rating.user.name}"/></td>
            <td><c:out value="${rating.movie.title}"/></td>
            <td><c:out value="${rating.ratingDate}"/></td>
            <td><c:out value="${rating.rating}"/></td>
            <td><a href="<c:out value="/task0ratings/${rating.id}"/>">details</a> </td>
        </tr>
    </c:forEach>
</table>
</div>

<%--<form action="<c:out value="ratings/update/ratingDate" />" method="post"> <button type="submit">find and set current date for ratingDate with valu null </button></form>--%>
</body>

</html>
