<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: challengezwb
  Date: 4/19/17
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>


<body>

<nav class="nav-extended">
    <div class="nav-wrapper">
        <a href="#" class="brand-logo">NBA</a>
        <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">

        </ul>
        <ul class="side-nav" id="mobile-demo">
            <li><a href="sass.html">Sass</a></li>
            <li><a href="badges.html">Components</a></li>
        </ul>
    </div>
    <div class="nav-content">
        <ul class="tabs tabs-transparent">
            <li class="tab"><a class="active" href="#test1">PLAYERS</a></li>
            <li class="tab"><a class="active" href="#test2">TEAMS</a></li>
            <li class="tab"><a href="#test3">MATCHES</a></li>
            <li class="tab"><a href="#test4">SEARCH</a></li>
        </ul>
    </div>
</nav>
<%
List<List<String[]>> todayData = (List<List<String[]>>) session.getAttribute("Date");
List<String[]> playerList = todayData.get(0);
List<String[]> teamList = todayData.get(1);
List<String[]> matchList = todayData.get(2);

String[] string0 = playerList.get(0);
    String name0 = string0[0];
    String team0 = string0[1];
    String point0 = string0[2];
String[] string1 = playerList.get(1);
    String name1 = string1[0];
    String team1 = string1[1];
    String point1 = string1[2];
String[] string2 = playerList.get(2);
    String name2 = string2[0];
    String team2 = string2[1];
    String point2 = string2[2];
String[] string3 = playerList.get(3);
    String name3 = string3[0];
    String team3 = string3[1];
    String point3 = string3[2];
String[] string4 = playerList.get(4);
    String name4 = string4[0];
    String team4 = string4[1];
    String point4 = string4[2];
String[] string5 = playerList.get(5);
    String name5 = string5[0];
    String team5 = string5[1];
    String point5 = string5[2];
String[] string6 = playerList.get(6);
    String name6 = string6[0];
    String team6 = string6[1];
    String point6 = string6[2];
String[] string7 = playerList.get(7);
    String name7 = string7[0];
    String team7 = string7[1];
    String point7 = string7[2];
String[] string8 = playerList.get(8);
    String name8 = string8[0];
    String team8 = string8[1];
    String point8 = string8[2];
String[] string9 = playerList.get(9);
    String name9 = string9[0];
    String team9 = string9[1];
    String point9 = string9[2];
String[] string10 = playerList.get(10);
    String name10 = string10[0];
    String team10 = string10[1];
    String point10 = string10[2];
String[] string11 = playerList.get(11);
    String name11 = string11[0];
    String team11 = string11[1];
    String point11 = string11[2];
String[] string12 = playerList.get(12);
    String name12 = string12[0];
    String team12 = string12[1];
    String point12 = string12[2];
String[] string13 = playerList.get(13);
    String name13 = string13[0];
    String team13 = string13[1];
    String point13 = string13[2];
String[] string14 = playerList.get(14);
    String name14 = string14[0];
    String team14 = string14[1];
    String point14 = string14[2];
String[] string15 = playerList.get(15);
    String name15 = string15[0];
    String team15 = string15[1];
    String point15 = string15[2];
String[] string16 = playerList.get(16);
    String name16 = string16[0];
    String team16 = string16[1];
    String point16 = string16[2];
String[] string17 = playerList.get(17);
    String name17 = string17[0];
    String team17 = string17[1];
    String point17 = string17[2];
String[] string18 = playerList.get(18);
    String name18 = string18[0];
    String team18 = string18[1];
    String point18 = string18[2];
String[] string19 = playerList.get(19);
    String name19 = string19[0];
    String team19 = string19[1];
    String point19 = string19[2];
String[] string20 = playerList.get(20);
    String name20 = string20[0];
    String team20 = string20[1];
    String point20 = string20[2];
String[] string21 = playerList.get(21);
    String name21 = string21[0];
    String team21 = string21[1];
    String point21 = string21[2];
String[] string22 = playerList.get(22);
    String name22 = string22[0];
    String team22 = string22[1];
    String point22 = string22[2];
String[] string23 = playerList.get(23);
    String name23 = string23[0];
    String team23 = string23[1];
    String point23 = string23[2];
String[] string24 = playerList.get(24);
    String name24 = string24[0];
    String team24 = string24[1];
    String point24 = string24[2];
String[] string25 = playerList.get(25);
    String name25 = string25[0];
    String team25 = string25[1];
    String point25 = string25[2];
String[] string26 = playerList.get(26);
    String name26 = string26[0];
    String team26 = string26[1];
    String point26 = string26[2];
String[] string27 = playerList.get(27);
    String name27 = string27[0];
    String team27 = string27[1];
    String point27 = string27[2];
String[] string28 = playerList.get(28);
    String name28 = string28[0];
    String team28 = string28[1];
    String point28 = string28[2];
String[] string29 = playerList.get(29);
    String name29 = string29[0];
    String team29 = string29[1];
    String point29 = string29[2];
String[] string30 = playerList.get(30);
    String name30 = string3[0];
    String team30 = string30[1];
    String point30 = string30[2];
String[] string31 = playerList.get(31);
    String name31 = string31[0];
    String team31 = string31[1];
    String point31 = string31[2];
String[] string32 = playerList.get(32);
    String name32 = string32[0];
    String team32 = string32[1];
    String point32 = string32[2];
String[] string33 = playerList.get(33);
    String name33 = string33[0];
    String team33 = string33[1];
    String point33 = string33[2];
String[] string34 = playerList.get(34);
    String name34 = string34[0];
    String team34 = string34[1];
    String point34 = string34[2];
String[] string35 = playerList.get(35);
    String name35 = string35[0];
    String team35 = string35[1];
    String point35 = string35[2];
String[] string36 = playerList.get(36);
    String name36 = string36[0];
    String team36 = string36[1];
    String point36 = string36[2];
String[] string37 = playerList.get(37);
    String name37 = string37[0];
    String team37 = string37[1];
    String point37 = string37[2];
String[] string38 = playerList.get(38);
    String name38 = string38[0];
    String team38 = string38[1];
    String point38 = string38[2];
String[] string39 = playerList.get(39);
    String name39 = string39[0];
    String team39 = string39[1];
    String point39 = string39[2];
String[] string40 = playerList.get(40);
    String name40 = string40[0];
    String team40 = string40[1];
    String point40 = string40[2];
String[] string41 = playerList.get(41);
    String name41 = string41[0];
    String team41 = string41[1];
    String point41 = string41[2];
String[] string42 = playerList.get(42);
    String name42 = string42[0];
    String team42 = string42[1];
    String point42 = string42[2];
String[] string43 = playerList.get(43);
    String name43 = string43[0];
    String team43 = string43[1];
    String point43 = string43[2];
String[] string44 = playerList.get(44);
    String name44 = string44[0];
    String team44 = string44[1];
    String point44 = string44[2];



String[] str0 = teamList.get(0);
    String temp0 = str0[0];
    String city0 = str0[1];
    String reb0 = str0[2];
String[] str1 = teamList.get(1);
    String temp1 = str1[0];
    String city1 = str1[1];
    String reb1 = str1[2];
String[] str2 = teamList.get(2);
    String temp2 = str2[0];
    String city2 = str2[1];
    String reb2 = str2[2];
String[] str3 = teamList.get(3);
    String temp3 = str3[0];
    String city3 = str3[1];
    String reb3 = str3[2];
String[] str4 = teamList.get(4);
    String temp4 = str4[0];
    String city4 = str4[1];
    String reb4 = str4[2];
String[] str5 = teamList.get(5);
    String temp5 = str5[0];
    String city5 = str5[1];
    String reb5 = str5[2];
String[] str6 = teamList.get(6);
    String temp6 = str6[0];
    String city6 = str6[1];
    String reb6 = str6[2];
String[] str7 = teamList.get(7);
    String temp7 = str7[0];
    String city7 = str7[1];
    String reb7 = str7[2];
String[] str8 = teamList.get(8);
    String temp8 = str8[0];
    String city8 = str8[1];
    String reb8 = str8[2];
String[] str9 = teamList.get(9);
    String temp9 = str9[0];
    String city9 = str9[1];
    String reb9 = str9[2];
String[] str10 = teamList.get(10);
    String temp10 = str10[0];
    String city10 = str10[1];
    String reb10 = str10[2];
String[] str11 = teamList.get(11);
    String temp11 = str11[0];
    String city11 = str11[1];
    String reb11 = str11[2];
String[] str12 = teamList.get(12);
    String temp12 = str12[0];
    String city12 = str12[1];
    String reb12 = str12[2];
String[] str13 = teamList.get(13);
    String temp13 = str13[0];
    String city13 = str13[1];
    String reb13 = str13[2];
String[] str14 = teamList.get(14);
    String temp14 = str14[0];
    String city14 = str14[1];
    String reb14 = str14[2];
String[] str15 = teamList.get(15);
    String temp15 = str15[0];
    String city15 = str15[1];
    String reb15 = str15[2];
String[] str16 = teamList.get(16);
    String temp16 = str16[0];
    String city16 = str16[1];
    String reb16 = str16[2];
String[] str17 = teamList.get(17);
    String temp17 = str17[0];
    String city17 = str17[1];
    String reb17 = str17[2];
String[] str18 = teamList.get(18);
    String temp18 = str18[0];
    String city18 = str18[1];
    String reb18 = str18[2];
String[] str19 = teamList.get(19);
    String temp19 = str19[0];
    String city19 = str19[1];
    String reb19 = str19[2];
String[] str20 = teamList.get(20);
    String temp20 = str20[0];
    String city20 = str20[1];
    String reb20 = str20[2];
String[] str21 = teamList.get(21);
    String temp21 = str21[0];
    String city21 = str21[1];
    String reb21 = str21[2];
String[] str22 = teamList.get(22);
    String temp22 = str22[0];
    String city22 = str22[1];
    String reb22 = str22[2];
String[] str23 = teamList.get(23);
    String temp23 = str23[0];
    String city23 = str23[1];
    String reb23 = str23[2];
String[] str24 = teamList.get(24);
    String temp24 = str24[0];
    String city24 = str24[1];
    String reb24 = str24[2];
String[] str25 = teamList.get(25);
    String temp25 = str25[0];
    String city25 = str25[1];
    String reb25 = str25[2];
String[] str26 = teamList.get(26);
    String temp26 = str26[0];
    String city26 = str26[1];
    String reb26 = str26[2];
String[] str27 = teamList.get(27);
    String temp27 = str27[0];
    String city27 = str27[1];
    String reb27 = str27[2];
String[] str28 = teamList.get(28);
    String temp28 = str28[0];
    String city28 = str28[1];
    String reb28 = str28[2];
String[] str29 = teamList.get(29);
    String temp29 = str29[0];
    String city29 = str29[1];
    String reb29 = str29[2];
String[] str30 = teamList.get(30);
    String temp30 = str30[0];
    String city30 = str30[1];
    String reb30 = str30[2];
String[] str31 = teamList.get(31);
    String temp31 = str31[0];
    String city31 = str31[1];
    String reb31 = str31[2];
String[] str32 = teamList.get(32);
    String temp32 = str32[0];
    String city32 = str32[1];
    String reb32 = str32[2];
String[] str33 = teamList.get(33);
    String temp33 = str33[0];
    String city33 = str33[1];
    String reb33 = str33[2];
String[] str34 = teamList.get(34);
    String temp34 = str34[0];
    String city34 = str34[1];
    String reb34 = str34[2];
String[] str35 = teamList.get(35);
    String temp35 = str35[0];
    String city35 = str35[1];
    String reb35 = str35[2];



String[] mat0 = matchList.get(0);
    String mteam0 = mat0[0];
    String firq0 = mat0[1];
    String secq0 = mat0[2];
    String thrq0 = mat0[3];
    String forq0 = mat0[4];
    String finq0 = mat0[5];
String[] mat1 = matchList.get(1);
    String mteam1 = mat1[0];
    String firq1 = mat1[1];
    String secq1 = mat1[2];
    String thrq1 = mat1[3];
    String forq1 = mat1[4];
    String finq1 = mat1[5];
String[] mat2 = matchList.get(2);
    String mteam2 = mat2[0];
    String firq2 = mat2[1];
    String secq2 = mat2[2];
    String thrq2 = mat2[3];
    String forq2 = mat2[4];
    String finq2 = mat2[5];
String[] mat3 = matchList.get(3);
    String mteam3 = mat3[0];
    String firq3 = mat3[1];
    String secq3 = mat3[2];
    String thrq3 = mat3[3];
    String forq3 = mat3[4];
    String finq3 = mat3[5];
String[] mat4 = matchList.get(4);
    String mteam4 = mat4[0];
    String firq4 = mat4[1];
    String secq4 = mat4[2];
    String thrq4 = mat4[3];
    String forq4 = mat4[4];
    String finq4 = mat4[5];
String[] mat5 = matchList.get(5);
    String mteam5 = mat5[0];
    String firq5 = mat5[1];
    String secq5 = mat5[2];
    String thrq5 = mat5[3];
    String forq5 = mat5[4];
    String finq5 = mat5[5];
%>



<div id="test1" class="col s12">
    <div class="row">
        <div class="col s12 offset-s2">
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Points</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name0%></td>
                            <td><%= team0%></td>
                            <td><%= point0%></td>
                        </tr>
                        <tr>
                            <td><%= name1%></td>
                            <td><%= team1%></td>
                            <td><%= point1%></td>
                        </tr>
                        <tr>
                            <td><%= name2%></td>
                            <td><%= team2%></td>
                            <td><%= point2%></td>
                        </tr>
                        <tr>
                            <td><%= name3%></td>
                            <td><%= team3%></td>
                            <td><%= point3%></td>
                        </tr>
                        <tr>
                            <td><%= name4%></td>
                            <td><%= team4%></td>
                            <td><%= point4%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Rebounds</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><%= name5%></td>
                            <td><%= team5%></td>
                            <td><%= point5%></td>
                        </tr>
                        <tr>
                            <td><%= name6%></td>
                            <td><%= team6%></td>
                            <td><%= point6%></td>
                        </tr>
                        <tr>
                            <td><%= name7%></td>
                            <td><%= team7%></td>
                            <td><%= point7%></td>
                        </tr>
                        <tr>
                            <td><%= name8%></td>
                            <td><%= team8%></td>
                            <td><%= point8%></td>
                        </tr>
                        <tr>
                            <td><%= name9%></td>
                            <td><%= team9%></td>
                            <td><%= point9%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Assists</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name10%></td>
                            <td><%= team10%></td>
                            <td><%= point10%></td>
                        </tr>
                        <tr>
                            <td><%= name11%></td>
                            <td><%= team11%></td>
                            <td><%= point11%></td>
                        </tr>
                        <tr>
                            <td><%= name12%></td>
                            <td><%= team12%></td>
                            <td><%= point12%></td>
                        </tr>
                        <tr>
                            <td><%= name13%></td>
                            <td><%= team13%></td>
                            <td><%= point13%></td>
                        </tr>
                        <tr>
                            <td><%= name14%></td>
                            <td><%= team14%></td>
                            <td><%= point14%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Blocks</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name15%></td>
                            <td><%= team15%></td>
                            <td><%= point15%></td>
                        </tr>
                        <tr>
                            <td><%= name16%></td>
                            <td><%= team16%></td>
                            <td><%= point16%></td>
                        </tr>
                        <tr>
                            <td><%= name17%></td>
                            <td><%= team17%></td>
                            <td><%= point17%></td>
                        </tr>
                        <tr>
                            <td><%= name18%></td>
                            <td><%= team18%></td>
                            <td><%= point18%></td>
                        </tr>
                        <tr>
                            <td><%= name19%></td>
                            <td><%= team19%></td>
                            <td><%= point19%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Steals</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name20%></td>
                            <td><%= team20%></td>
                            <td><%= point20%></td>
                        </tr>
                        <tr>
                            <td><%= name21%></td>
                            <td><%= team21%></td>
                            <td><%= point21%></td>
                        </tr>
                        <tr>
                            <td><%= name22%></td>
                            <td><%= team22%></td>
                            <td><%= point22%></td>
                        </tr>
                        <tr>
                            <td><%= name23%></td>
                            <td><%= team23%></td>
                            <td><%= point23%></td>
                        </tr>
                        <tr>
                            <td><%= name24%></td>
                            <td><%= team24%></td>
                            <td><%= point24%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Turnovers</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name25%></td>
                            <td><%= team25%></td>
                            <td><%= point25%></td>
                        </tr>
                        <tr>
                            <td><%= name26%></td>
                            <td><%= team26%></td>
                            <td><%= point26%></td>
                        </tr>
                        <tr>
                            <td><%= name27%></td>
                            <td><%= team27%></td>
                            <td><%= point27%></td>
                        </tr>
                        <tr>
                            <td><%= name28%></td>
                            <td><%= team28%></td>
                            <td><%= point28%></td>
                        </tr>
                        <tr>
                            <td><%= name29%></td>
                            <td><%= team29%></td>
                            <td><%= point29%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Three Pointers Made</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name30%></td>
                            <td><%= team30%></td>
                            <td><%= point30%></td>
                        </tr>
                        <tr>
                            <td><%= name31%></td>
                            <td><%= team31%></td>
                            <td><%= point31%></td>
                        </tr>
                        <tr>
                            <td><%= name32%></td>
                            <td><%= team32%></td>
                            <td><%= point32%></td>
                        </tr>
                        <tr>
                            <td><%= name33%></td>
                            <td><%= team33%></td>
                            <td><%= point33%></td>
                        </tr>
                        <tr>
                            <td><%= name34%></td>
                            <td><%= team34%></td>
                            <td><%= point34%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Free Throws Made</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name35%></td>
                            <td><%= team35%></td>
                            <td><%= point35%></td>
                        </tr>
                        <tr>
                            <td><%= name36%></td>
                            <td><%= team36%></td>
                            <td><%= point36%></td>
                        </tr>
                        <tr>
                            <td><%= name37%></td>
                            <td><%= team37%></td>
                            <td><%= point37%></td>
                        </tr>
                        <tr>
                            <td><%= name38%></td>
                            <td><%= team38%></td>
                            <td><%= point38%></td>
                        </tr>
                        <tr>
                            <td><%= name39%></td>
                            <td><%= team39%></td>
                            <td><%= point39%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Team</th>
                            <th>Fantasy Points</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= name40%></td>
                            <td><%= team40%></td>
                            <td><%= point40%></td>
                        </tr>
                        <tr>
                            <td><%= name41%></td>
                            <td><%= team41%></td>
                            <td><%= point41%></td>
                        </tr>
                        <tr>
                            <td><%= name42%></td>
                            <td><%= team42%></td>
                            <td><%= point42%></td>
                        </tr>
                        <tr>
                            <td><%= name43%></td>
                            <td><%= team43%></td>
                            <td><%= point43%></td>
                        </tr>
                        <tr>
                            <td><%= name44%></td>
                            <td><%= team44%></td>
                            <td><%= point44%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

</div>
<div id="test2" class="col s12">
    <div class="row">
        <div class="col s12 offset-s2">
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Points</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp0%></td>
                            <td><%= city0%></td>
                            <td><%= reb0%></td>
                        </tr>
                        <tr>
                            <td><%= temp1%></td>
                            <td><%= city1%></td>
                            <td><%= reb1%></td>
                        </tr>
                        <tr>
                            <td><%= temp2%></td>
                            <td><%= city2%></td>
                            <td><%= reb2%></td>
                        </tr>
                        <tr>
                            <td><%= temp3%></td>
                            <td><%= city3%></td>
                            <td><%= reb3%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Rebounds</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp4%></td>
                            <td><%= city4%></td>
                            <td><%= reb4%></td>
                        </tr>
                        <tr>
                            <td><%= temp5%></td>
                            <td><%= city5%></td>
                            <td><%= reb5%></td>
                        </tr>
                        <tr>
                            <td><%= temp6%></td>
                            <td><%= city6%></td>
                            <td><%= reb6%></td>
                        </tr>
                        <tr>
                            <td><%= temp7%></td>
                            <td><%= city7%></td>
                            <td><%= reb7%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Assists</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp8%></td>
                            <td><%= city8%></td>
                            <td><%= reb8%></td>
                        </tr>
                        <tr>
                            <td><%= temp9%></td>
                            <td><%= city9%></td>
                            <td><%= reb9%></td>
                        </tr>
                        <tr>
                            <td><%= temp10%></td>
                            <td><%= city10%></td>
                            <td><%= reb10%></td>
                        </tr>
                        <tr>
                            <td><%= temp11%></td>
                            <td><%= city11%></td>
                            <td><%= reb11%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Blocks</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp12%></td>
                            <td><%= city12%></td>
                            <td><%= reb12%></td>
                        </tr>
                        <tr>
                            <td><%= temp13%></td>
                            <td><%= city13%></td>
                            <td><%= reb13%></td>
                        </tr>
                        <tr>
                            <td><%= temp14%></td>
                            <td><%= city14%></td>
                            <td><%= reb14%></td>
                        </tr>
                        <tr>
                            <td><%= temp15%></td>
                            <td><%= city15%></td>
                            <td><%= reb15%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Steals</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp16%></td>
                            <td><%= city16%></td>
                            <td><%= reb16%></td>
                        </tr>
                        <tr>
                            <td><%= temp17%></td>
                            <td><%= city17%></td>
                            <td><%= reb17%></td>
                        </tr>
                        <tr>
                            <td><%= temp18%></td>
                            <td><%= city18%></td>
                            <td><%= reb18%></td>
                        </tr>
                        <tr>
                            <td><%= temp19%></td>
                            <td><%= city19%></td>
                            <td><%= reb19%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Field Goal Percentage</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp20%></td>
                            <td><%= city20%></td>
                            <td><%= reb20%></td>
                        </tr>
                        <tr>
                            <td><%= temp21%></td>
                            <td><%= city21%></td>
                            <td><%= reb21%></td>
                        </tr>
                        <tr>
                            <td><%= temp22%></td>
                            <td><%= city22%></td>
                            <td><%= reb22%></td>
                        </tr>
                        <tr>
                            <td><%= temp23%></td>
                            <td><%= city23%></td>
                            <td><%= reb23%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Three Pointers Made</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp24%></td>
                            <td><%= city24%></td>
                            <td><%= reb24%></td>
                        </tr>
                        <tr>
                            <td><%= temp25%></td>
                            <td><%= city25%></td>
                            <td><%= reb25%></td>
                        </tr>
                        <tr>
                            <td><%= temp26%></td>
                            <td><%= city26%></td>
                            <td><%= reb26%></td>
                        </tr>
                        <tr>
                            <td><%= temp27%></td>
                            <td><%= city27%></td>
                            <td><%= reb27%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Three Point PCT</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp28%></td>
                            <td><%= city28%></td>
                            <td><%= reb28%></td>
                        </tr>
                        <tr>
                            <td><%= temp29%></td>
                            <td><%= city29%></td>
                            <td><%= reb29%></td>
                        </tr>
                        <tr>
                            <td><%= temp30%></td>
                            <td><%= city30%></td>
                            <td><%= reb30%></td>
                        </tr>
                        <tr>
                            <td><%= temp31%></td>
                            <td><%= city31%></td>
                            <td><%= reb31%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col s3">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th>Team</th>
                            <th>City</th>
                            <th>Free Throw Percentage</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td><%= temp32%></td>
                            <td><%= city32%></td>
                            <td><%= reb32%></td>
                        </tr>
                        <tr>
                            <td><%= temp33%></td>
                            <td><%= city33%></td>
                            <td><%= reb33%></td>
                        </tr>
                        <tr>
                            <td><%= temp34%></td>
                            <td><%= city34%></td>
                            <td><%= reb34%></td>
                        </tr>
                        <tr>
                            <td><%= temp35%></td>
                            <td><%= city35%></td>
                            <td><%= reb35%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<div id="test3" class="col s12">
    <div class="row">
        <div class="col s9 offset-s2">
            <div class="row">
                <div class="col s9">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th></th>
                            <th>Quarter1</th>
                            <th>Quarter2</th>
                            <th>Quarter3</th>
                            <th>Quarter4</th>
                            <th>Final Points</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><%= mteam0%>/td>
                            <td><%= firq0%></td>
                            <td><%= secq0%></td>
                            <td><%= thrq0%></td>
                            <td><%= forq0%></td>
                            <td><%= finq0%></td>
                        </tr>
                        <tr>
                            <td><%= mteam1%>/td>
                            <td><%= firq1%></td>
                            <td><%= secq1%></td>
                            <td><%= thrq1%></td>
                            <td><%= forq1%></td>
                            <td><%= finq1%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s9">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th></th>
                            <th>Quarter1</th>
                            <th>Quarter2</th>
                            <th>Quarter3</th>
                            <th>Quarter4</th>
                            <th>Final Points</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><%= mteam2%>/td>
                            <td><%= firq2%></td>
                            <td><%= secq2%></td>
                            <td><%= thrq2%></td>
                            <td><%= forq2%></td>
                            <td><%= finq2%></td>
                        </tr>
                        <tr>
                            <td><%= mteam3%>/td>
                            <td><%= firq3%></td>
                            <td><%= secq3%></td>
                            <td><%= thrq3%></td>
                            <td><%= forq3%></td>
                            <td><%= finq3%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="row">
                <div class="col s9">
                    <table class="striped">
                        <thead>
                        <tr>
                            <th></th>
                            <th>Quarter1</th>
                            <th>Quarter2</th>
                            <th>Quarter3</th>
                            <th>Quarter4</th>
                            <th>Final Points</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td><%= mteam4%>/td>
                            <td><%= firq4%></td>
                            <td><%= secq4%></td>
                            <td><%= thrq4%></td>
                            <td><%= forq4%></td>
                            <td><%= finq4%></td>
                        </tr>
                        <tr>
                            <td><%= mteam5%>/td>
                            <td><%= firq5%></td>
                            <td><%= secq5%></td>
                            <td><%= thrq5%></td>
                            <td><%= forq5%></td>
                            <td><%= finq5%></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>


<div id="test4" class="col s12">



    <div class="row">
        <form class="col s10 offset-s1" method="post"  action="SearchServlet">
            <div class="row">
                <div class="input-field col s2">
                    <input id="teamName1" name="teamName1" type="text" class="validate">
                    <label for="last_name0">team1</label>
                </div>
                <div class="input-field col s2">
                    <input id="teamName2" name="teamName2"type="text" class="validate">
                    <label for="last_name1">team2</label>
                </div>
                <div class="input-field col s2">
                    <input id="dateStart" type="text" name="dateStart" class="validate">
                    <label for="last_name2">begin date</label>
                </div>
                <div class="input-field col s2">
                    <input id="dateEnd" type="text" name="dateEnd"class="validate">
                    <label for="last_name3">end date</label>
                </div>

                <button class="btn waves-effect waves-light col s1"
                        type="submit" name="submit" id="submitbutton1">Submit
                    <i class="material-icons right">send</i>
                </button>

            </div>
        </form>
    </div>

    <div class="row">
        <form class="col s10 offset-s1" method="post"  action="SearchServlet">
            <div class="row">
                <div class="input-field col s8">
                    <input id="last_name0" name="state" type="text" class="validate">
                    <label for="last_name0">Enter a STATE and return top 3 schools with highest player efficiency</label>
                </div>

                <button class="btn waves-effect waves-light col s1"
                        type="submit" name="submit" id="hubsubmitbutton">Submit
                    <i class="material-icons right">send</i>
                </button>
            </div>
        </form>
    </div>

    <div class="row">
        <form class="col s10 offset-s1" method="post"  action="SearchServlet">
            <div class="row">
                <div class="input-field col s4">
                    <input id="startDate" name="startDate" type="text" class="validate">
                    <label for="last_name0">begin date</label>
                </div>
                <div class="input-field col s4">
                    <input id="endDate" name="endDate" type="text" class="validate">
                    <label for="last_name1">end date</label>
                </div>
                <button class="btn waves-effect waves-light col s1"
                        type="submit" name="submit" id="hubsubmitbutton">Submit
                    <i class="material-icons right">send</i>
                </button>
            </div>
        </form>
    </div>

    <div class="row">
        <form class="col s10 offset-s1" method="post"  action="SearchServlet">
            <div class="row">
                <div class="input-field col s2.9">
                    <input id="last_name0" name="abbreviation" type="text" class="validate">
                    <label for="last_name0">team abbreviation</label>
                </div>
                <div class="input-field col s2.9">
                    <input id="last_name1" name="beginDate" type="text" class="validate">
                    <label for="last_name1">begin date</label>
                </div>
                <div class="input-field col s2.9">
                    <input id="last_name2" name="overDate" type="text" class="validate">
                    <label for="last_name2">end date</label>
                </div>
                <button class="btn waves-effect waves-light col s1"
                        type="submit" name="submit" id="hubsubmitbutton">Submit
                    <i class="material-icons right">send</i>
                </button>
            </div>
        </form>
    </div>


    <div class="row">
        <form class="col s10 offset-s1" method="post"  action="SearchServlet">
            <div class="row">
                <div class="input-field col s2.9">
                    <input id="last_name0" name="inputDate" type="text" class="validate">
                    <label for="last_name0">Search for another day</label>
                </div>

                <button class="btn waves-effect waves-light col s1"
                        type="submit" name="submit" id="hubsubmitbutton">Submit
                    <i class="material-icons right">send</i>
                </button>
            </div>
        </form>
    </div>

</div>







<!--Import jQuery before materialize.js-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="js/materialize.js"></script>

</body>
</html>