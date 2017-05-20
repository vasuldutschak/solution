<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
        <th>movie id</th>
        <th>title</th>
        <th>director</th>
        <th>operation</th>
    </tr>
    <c:forEach items="${movies}" var="movie">
        <tr>
            <td><c:out value="${movie.id}"></c:out></td>
            <td><c:out value="${movie.title}"></c:out></td>
            <td><c:out value="${movie.director}"></c:out></td>
            <td>
                <form action="<c:out value="/task0movies/${movie.id}/delete"/>" method="post">
                    <button type="submit">remove</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<form:form action="/task0movies" method="post" commandName="movie" cssClass="form-inline">

    <label for="title">Title</label>
    <form:input path="title" id="title" class="form-control"/>


    <label for="director">Director</label>
    <form:input class="form-control" path="director" id="director"/>

    <button type="submit">Save</button>
</form:form>



</body>

</html>
