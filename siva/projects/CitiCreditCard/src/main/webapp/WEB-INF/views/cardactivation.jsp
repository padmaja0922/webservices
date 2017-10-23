<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#47d1d1">

<div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2></h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                   <%--  <h3>${message}</h3> --%>
                   <h1><u>Enter Your Card Number To Activate Card</u></h1>
                </td>
            </tr>
        </table>
   
<form action="activatecard" method = "POST">
  <h4 style="color:red;font-size:150%"><strong>Card Number:
  <input type="text" name="creditCardNumber" value=""></h4>
 
 <button class="btn btn-lg btn-success btn-block btn-signin" type="submit">Enter</button>
</form> </div> 
</body>
</html>