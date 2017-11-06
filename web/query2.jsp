<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/19/17
  Time: 4:57 PM
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
<div align="center" style="line-height :50px">
    <table>
    <%
        List<String[]> list = (List<String[]>) session.getAttribute("resultData2");
        String[] first = list.get(0);
        String[] second = list.get(1);
        String[] third = list.get(2);
        String firstC = first[0];
        String firstP = first[1];
        String secondC = second[0];
        String secondP = second[1];
        String thirdC = third[0];
        String thirdP = third[1];
    %>
    <tr>
        <th>Rank</th>
        <th>College Name</th>
        <th>Fantasy Point</th>
    </tr>
    <tr>
        <td>No.1</td>
        <td><%= firstC %></td>
        <td><%= firstP %></td>
    </tr>
    <tr>
        <td>No.2</td>
        <td><%= secondC %></td>
        <td><%= secondP %></td>
    </tr>
    <tr>
        <td>No.3</td>
        <td><%= thirdC %></td>
        <td><%= thirdP %></td>
    </tr>
    </table>
</div>
</body>
</html>


