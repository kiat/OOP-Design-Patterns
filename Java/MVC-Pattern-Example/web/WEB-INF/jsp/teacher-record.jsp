<%@ page import="edu.bu.met.cs665.webexample.models.Teacher" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: fanonxrogers
  Date: 3/5/20
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Teacher record</title>
</head>
<body>
<%
    // requesting the data to diplay from the front end
    ArrayList<Teacher> teachers = (ArrayList<Teacher>) request.getAttribute("teachers");
%>

<h1>Teacher Info Record</h1>
<div>ID: <%= teachers.get(0).getId()%></div>
<div>First Name: <%= teachers.get(0).getFirstName()%></div>
<div>Last Name: <%= teachers.get(0).getLastName()%></div>
<div>Course: <%= teachers.get(0).getCourse()%></div>
<br>

<div>ID: <%= teachers.get(1).getId()%></div>
<div>First Name: <%= teachers.get(1).getFirstName()%></div>
<div>Last Name: <%= teachers.get(1).getLastName()%></div>
<div>Course: <%= teachers.get(1).getCourse()%></div>
<br>

<div>ID: <%= teachers.get(2).getId()%></div>
<div>First Name: <%= teachers.get(2).getFirstName()%></div>
<div>Last Name: <%= teachers.get(2).getLastName()%></div>
<div>Course: <%= teachers.get(2).getCourse()%></div>
<br>

</body>
</html>
