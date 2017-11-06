<%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/20/17
  Time: 2:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<%
    String[] player = (String[]) session.getAttribute("teamData");
    String name = player[0];
    String city = player[1];
    String found = player[2];
    String arena = player[3];
    String coach = player[4];
%>
<table>
    <tr>
        <th>Team NickName</th>
        <th>City</th>
        <th>Found date</th>
        <th>Arena</th>
        <th>Headcoach</th>
    </tr>
    <tr>
        <td><%= name%></td>
        <td><%= city%></td>
        <td><%= found%></td>
        <td><%= arena%></td>
        <td><%= coach%></td>
    </tr>
</table>

</body>
</html>