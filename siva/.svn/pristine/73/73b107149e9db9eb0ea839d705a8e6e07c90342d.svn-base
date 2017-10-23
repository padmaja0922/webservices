<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>registration</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link href="<c:url value="/resources/registration.css" />" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body background= "https://www.firstbankal.com/uploads/userfiles/files/images/Header%20Images/munford-header-BG.jpg"  
style="
    margin-left: 50px;
">
<div>

<h1><u>Register Your Card Here</u></h1>

</div>

 <h3>${regstatus}</h3>
<div class="registration" >


   <form:form action="register" method="POST" modelAttribute="Customer">
        CardNumber:<br>
        <input type="text" name="CardNumber" >
        <br><br> UserID:
        <br>
         
        <input type="text" name="UserID">
        <br><br> Password:
        <br>
        <input type="password" name="Password">
        <br><br> Confirm Password:<br>
        <input type="password" name="Confirm Password"><br><br>
          <input type = "submit"  value="Enter" >
     </form:form>

</div>
</body>

</html>
