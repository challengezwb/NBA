
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

    <form name="form1" method="post" action="HomeServlet">
        <table width="615" border="0">
            <tr>
                <td width="123">Player Search：</td>
                <td width="483">
                    <label>
                        <input name="playerName" style="font-size: 30px;" type="text">
                    </label>
                </td>
            </tr>

            <tr>
                <td>&nbsp;</td>
                <td style="float:left; display:block;"><label>
                    <input type="submit" name="Submit" style="font-size: 30px;" value="Search">
                </label></td>


                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </form>
    <form name="form1" method="post" action="HomeServlet">
        <table width="615" border="0">
            <tr>
                <td width="123">Team Search：</td>
                <td width="483">
                    <label>
                        <input name="teamName" style="font-size: 30px;" type="text">
                    </label>
                </td>
            </tr>

            <tr>
                <td>&nbsp;</td>
                <td style="float:left; display:block;"><label>
                    <input type="submit" name="Submit" style="font-size: 30px;" value="Search">
                </label></td>
            </tr>

            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </form>

    <form action="TupleServlet">
        <tr>
            <td>&nbsp;</td>
            <td style="float:left;display:block;"><label>
                <input type="submit" name="Submit" style="font-size: 30px;" value="Show tuples">
            </label></td>


        </tr>
    </form>
    <form action="HomeServlet">
        <tr>
            <td>&nbsp;</td>
            <td style="float:left;display:block;"><label>
                <input name="Time" type="text" size="50">
                <input type="submit" name="Submit" style="font-size: 30px;" value="Magic">
            </label></td>


        </tr>
    </form>
</div>
</body>
</html>

