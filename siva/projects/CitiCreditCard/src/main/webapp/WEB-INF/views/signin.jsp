<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link href="<c:url value="/resources/login.css" />" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Registration</title>
</head>
<body>

<h1 style="margin-left: 100px;">Please Login Here</h1>
    <div class="container">
	
<div class="row">

<div class="col-sm-3 ">
<div class="card card-container "  style = margin-top: 220px;>
          
            <form class="form-signin" action = "signin" method ="POST" >
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" name="UserID" class="form-control" placeholder="UserID" required autofocus>
                <input type="password" name="Password" class="form-control" placeholder="Password" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me"> Rememberme
                    </label>
                </div>
                <button class="btn btn-lg btn-success btn-block btn-signin" type="submit">Login</button>
            </form><!-- /form -->
            <a href="#" class="forgot-password">
                Forgot the password?
            </a><br>
			<a href="index" class="Activate-card">
               Home Page
            </a><br>
			 <a href="registration" class="Register">
                Register Now
            </a>
			
        </div><!-- /card-container -->
    </div><!-- /container -->



	</div>
	
	</body>
	
	

</html>
