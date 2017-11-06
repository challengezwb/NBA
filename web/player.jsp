<%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/20/17
  Time: 2:53 AM
  To change this template use File | Settings | File Templates.
--%>
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
    String[] player = (String[])session.getAttribute("playData");
    String name = player[0];
    String birth = player[1];
    String college = player[2];
    String country = player[3];
    String height = player[4];
    String weight = player[5];
    String position = player[6];
%>
<table>
    <tr>
        <th>Player Name</th>
        <th>Birthday</th>
        <th>College</th>
        <th>Country</th>
        <th>Height</th>
        <th>Weight</th>
        <th>Position</th>
    </tr>
    <tr>
        <td><%= name%></td>
        <td><%= birth%></td>
        <td><%= college%></td>
        <td><%= country%></td>
        <td><%= height%></td>
        <td><%= weight%></td>
        <td><%= position%></td>
    </tr>
</table>

</body>
</html>


