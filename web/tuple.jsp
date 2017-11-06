<%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/20/17
  Time: 3:23 AM
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
    int tuple = (int)session.getAttribute("tuple");
%>
<table>
    <tr>
        <th>Tuple Number</th>
        <th><%= tuple%></th>
    </tr>
</table>

</body>
</html>


