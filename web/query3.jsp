<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/19/17
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
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
            List<String[]> list = (List<String[]>) session.getAttribute("resultData3");
            String[] first = list.get(0);
            String[] second = list.get(1);
            String[] third = list.get(2);
            String firstN = first[0];
            String firstR = first[1];
            String firstB = first[2];
            String firstS = first[3];
            String firstP = first[4];
            String firstT = first[5];
            String secondN = second[0];
            String secondR = second[1];
            String secondB = second[2];
            String secondS = second[3];
            String secondP = second[4];
            String secondT = second[5];
            String thirdN = third[0];
            String thirdR = third[1];
            String thirdB = third[2];
            String thirdS = third[3];
            String thirdP = third[4];
            String thirdT = third[5];
        %>
        <tr>
            <th>Rank</th>
            <th>Player Name</th>
            <th>Win Rate</th>
            <th>Birth Date</th>
            <th>College Name</th>
            <th>Position</th>
            <th>Team Name</th>
        </tr>
        <tr>
            <td>No.1</td>
            <td><%= firstN %></td>
            <td><%= firstR %></td>
            <td><%= firstB %></td>
            <td><%= firstS %></td>
            <td><%= firstP %></td>
            <td><%= firstT %></td>
        </tr>
        <tr>
            <td>No.2</td>
            <td><%= secondN %></td>
            <td><%= secondR %></td>
            <td><%= secondB %></td>
            <td><%= secondS %></td>
            <td><%= secondP %></td>
            <td><%= secondT %></td>
        </tr>
        <tr>
            <td>No.3</td>
            <td><%= thirdN %></td>
            <td><%= thirdR %></td>
            <td><%= thirdB %></td>
            <td><%= thirdS %></td>
            <td><%= thirdP %></td>
            <td><%= thirdT %></td>
        </tr>
    </table>
</div>
</body>
</html>


