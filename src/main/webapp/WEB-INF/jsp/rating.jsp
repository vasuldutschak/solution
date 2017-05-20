<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>

</head>
<body>

<ul>
    <li><a href="<c:out value="/index"/>">Home</a></li>
    <li>
        <a href="#">Task0</span></a>
        <ul>
            <li><a href="<c:out value="/task0users"/>">all users</a></li>
            <li><a href="<c:out value="/task0movies"/>">all movies</a></li>
            <li><a href="<c:out value="/task0ratings"/>">all ratings</a></li>
        </ul>
    </li>
    <li><a href="<c:out value="/task1"/>">Task1</a></li>
    <li><a href="<c:out value="/task0movies"/>">Task2</a></li>
    <li><a href="<c:out value="/task3/between/4/5"/>">Task3</a></li>
    <li><a href="<c:out value="/task4"/>">Task4</a></li>
    <li><a href="<c:out value="/task0movies"/>">Task5</a></li>
    <li><a href="<c:out value="/task0ratings"/>">Task6</a></li>
</ul>
<table>
    <tr>
        <th>movie tirle</th>
        <th>user name</th>
        <th>rating</th>
    </tr>

        <tr>
            <td><c:out value="${rating.movie.title}"></c:out></td>
            <td><c:out value="${rating.user.name}"></c:out></td>
            <td><c:out value="${rating.rating}"></c:out></td>
        </tr>
</table>


</body>

</html>
