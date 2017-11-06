<%--
&lt;%&ndash;
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/6/17
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
&ndash;%&gt;
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>photo store</title>

    <style>
    form {
      display: inline-block; //Or display: inline;
    }
    </style>
</head>
<body background="IMG_0704.JPG">
<div align="center" >
    <p style="font-size: 50px">NBA</p>
</div>
<div align="center" style="line-height :50px">
    <form name="form1" method="post" action="LoginServlet">
        <table width="615" border="0">
            <tr>
                <td width="123">UserName：</td>
                <td width="483"><label>
                    <input name="EmailAddress" type="text" size="50">
                </label></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input name="PassWord" type="password" size="50"></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td><label>
                    <input type="submit" name="Submit" value="enter">
                </label></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </form>
</div>




<!--Import jQuery before materialize.js-->

</body>
</html>
--%>
<%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/6/17
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>photo store</title>
</head>

<body background="bg2.jpg">
<div align="center" >
    <p style="font-size: 50px">NBA</p>
</div>
<div align="center" style="line-height :50px">
        <table width="615" border="0">
            <%
                String[] data = (String[]) session.getAttribute("resultData1");
                String winrate = data[0];
                String team1 = data[1];
                String city1 = data[2];
                String arean1 = data[3];
                String owner1 = data[4];
                String team2 = data[5];
                String city2 = data[6];
                String arean2 = data[7];
                String owner2 = data[8];


                /*String data = (String)session.getAttribute("resultData1");
                String winrate = data;
                String team1 = "jaja";
                String city1 = "jaja";
                String arean1 = "jaja";
                String owner1 = "jaja";
                String team2 = "jaja";
                String city2 = "jaja";
                String arean2 = "jaja";
                String owner2 = "jaja";*/


            %>
            <tr>

                <th><%= team1 %></th>
                <th> </th>
                <th><%= team2 %></th>
            </tr>
            <tr>
                <th><%= city1 %></th>
                <th><%= winrate %></th>
                <th><%= city2 %></th>
            </tr>
            <tr>
                <th><%= arean1 %></th>
                <th> </th>
                <th><%= arean2 %></th>
            </tr>

            <tr>
                <th><%= owner1 %></th>
                <th> </th>
                <th><%= owner2 %></th>
            </tr>

        </table>

</div>
</body>
</html>

