<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/20/17
  Time: 1:09 AM
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
    List<String[]> list = (List<String[]>) session.getAttribute("resultData4");
    int size = list.size();
    String[] temp = new String[] {" ", " ", " "};
    String[] str0;
    String[] str1;
    String[] str2;
    String[] str3;
    String[] str4;
    String[] str5;
    String[] str6;
    String[] str7;
    String[] str8;
    String[] str9;
    if(1 < size){
        str0 = list.get(0);
    }else{
        str0 = temp;
    }
    if(2 < size){
        str1 = list.get(1);
    }else{
        str1 = temp;
    }
    if(3 < size){
        str2 = list.get(2);
    }else{
        str2 = temp;
    }
    if(4 < size){
        str3 = list.get(3);
    }else{
        str3 = temp;
    }
    if(5 < size){
        str4 = list.get(4);
    }else{
        str4 = temp;
    }
    if(6 < size){
        str5 = list.get(5);
    }else{
        str5 = temp;
    }
    if(7 < size){
        str6 = list.get(6);
    }else{
        str6 = temp;
    }
    if(8 < size){
        str7 = list.get(7);
    }else{
        str7 = temp;
    }
    if(9 < size){
        str8 = list.get(8);
    }else{
        str8 = temp;
    }
    if(10 < size){
        str9 = list.get(9);
    }else{
        str9 = temp;
    }

    String p0 = str0[0];
    String s0 = str0[1];
    String c0 = str0[2];
    String p1 = str1[0];
    String s1 = str1[1];
    String c1 = str1[2];
    String p2 = str2[0];
    String s2 = str2[1];
    String c2 = str2[2];
    String p3 = str3[0];
    String s3 = str3[1];
    String c3 = str3[2];
    String p4 = str4[0];
    String s4 = str4[1];
    String c4 = str4[2];
    String p5 = str5[0];
    String s5 = str5[1];
    String c5 = str5[2];
    String p6 = str6[0];
    String s6 = str6[1];
    String c6 = str6[2];
    String p7 = str7[0];
    String s7 = str7[1];
    String c7 = str7[2];
    String p8 = str8[0];
    String s8 = str8[1];
    String c8 = str9[2];
    String p9 = str9[0];
    String s9 = str9[1];
    String c9 = str8[2];
%>
<table>
    <tr>
        <th>Number</th>
        <th>Player Name</th>
        <th>College</th>
        <th>Counrty</th>
    </tr>
    <tr>
        <td>1</td>
        <td><%= p0%></td>
        <td><%= s0%></td>
        <td><%= c0%></td>
    </tr>
    <tr>
        <td>2</td>
        <td><%= p1%></td>
        <td><%= s1%></td>
        <td><%= c1%></td>
    </tr>
    <tr>
        <td>3</td>
        <td><%= p2%></td>
        <td><%= s2%></td>
        <td><%= c2%></td>
    <tr>
        <td>4</td>
        <td><%= p3%></td>
        <td><%= s3%></td>
        <td><%= c3%></td>
    </tr>
    <tr>
        <td>5</td>
        <td><%= p4%></td>
        <td><%= s4%></td>
        <td><%= c4%></td>
    </tr>
    <tr>
        <td>6</td>
        <td><%= p5%></td>
        <td><%= s5%></td>
        <td><%= c5%></td>
    </tr>
    <tr>
        <td>7</td>
        <td><%= p6%></td>
        <td><%= s6%></td>
        <td><%= c6%></td>
    </tr>
    <tr>
        <td>8</td>
        <td><%= p7%></td>
        <td><%= s7%></td>
        <td><%= c7%></td>
    </tr>
    <tr>
        <td>9</td>
        <td><%= p8%></td>
        <td><%= s8%></td>
        <td><%= c8%></td>
    </tr>
    <tr>
        <td>10</td>
        <td><%= p9%></td>
        <td><%= s9%></td>
        <td><%= c9%></td>
    </tr>
</table>

</body>
</html>

