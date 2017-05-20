<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

Simple REST Server exercises<p></p>

Requirements:
<ul>
    <li>1. Java 7(8)</li>
    <li>2. MySql</li>
    <li>3. Hibernate/JPA</li>
    <li>4. Spring framework</li>
</ul>
Please use SQL script from page 2 like a database structure and create REST server
api for next tasks. Use the simplest client UI to show results on web page. Try to do
as much as possible. Remember that almost done task is not done task:
<p></p>
<ul>
    <li>Task 0. (/task0users; /task0movies; /task0ratings)
        Return all users, movies, ratings.
    </li>
    <li>Task 1. (/task1)
        Some date in rating is lost. Find the userId of all users who have ratings with a NULL
        value for the date. Set it to today's date in database.
        Return all ratings.
    </li>
    <li>Task 2. (/task2)
        Insert the following movies into the Movie table:
        movieId title director
        <p>
            9 Deadpool Tim Miller
            10 The 300 spartans Zak Snyder
        </p>
        Return all movies.
    </li>
    <li>Task 3. (/task3)
        Return the movieID, ratingDate of all movies that received a rating of 4 or 5, and sort
        them in increasing order by ratingDate.
    </li>
    <li>Task 4. (/task4)
        Return the titles of all movies that have no ratings.
    </li>
    <li>Task 5. (/task5)
        Delete the movies you added in task 2 (by id 9 and 10).
        Return all movies
    </li>
    <li>Task 6. (/task6)
        Return the title of the movie, user name and rating for every rating.
    </li>
</ul>


</body>

</html>
