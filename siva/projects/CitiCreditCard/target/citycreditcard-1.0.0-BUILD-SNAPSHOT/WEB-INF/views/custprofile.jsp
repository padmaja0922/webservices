<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body bgcolor="#47d1d1">
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2></h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>${message}</h3>
                </td>
            </tr>
            <tr>
                <td>Name on card:</td>
                <td>${profile.nameOnCard}</td>
            </tr>
            <tr>
                <td>Card Number:</td>
                <td>${profile.creditCardNumber}</td>
            </tr>
            <tr>
                <td>Card Status:</td>
                <td>${profile.cardStatus}</td>
            </tr>
            <tr>
                <td> Card Limit:</td>
                <td>${profile.cardLimit}</td>
            </tr>
 
        </table>
    </div>
</body>
</html>