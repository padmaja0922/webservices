<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>

<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}

.social:hover {
	-webkit-transform: scale(1.1);
	-moz-transform: scale(1.1);
	-o-transform: scale(1.1);
}

.social {
	-webkit-transform: scale(0.8);
	/* Browser Variations: */
	-moz-transform: scale(0.8);
	-o-transform: scale(0.8);
	-webkit-transition-duration: 0.5s;
	-moz-transition-duration: 0.5s;
	-o-transition-duration: 0.5s;
}

.account-box {
	border: 2px solid rgba(153, 153, 153, 0.75);
	border-radius: 10px;
	font-size: 13px !important;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	background-color: #ffffff;
	padding: 20px;
}

.forgotLnk {
	margin-top: 10px;
	display: block;
}

.purple-bg {
	background-color: #40bf40;
	color: black;
}

.or-box {
	position: relative;
	border-top: 1px solid #dfdfdf;
	padding-top: 20px;
	margin-top: 20px;
}

.or {
	color: #666666;
	background-color: #ffffff;
	position: absolute;
	text-align: center;
	top: -8px;
	width: 40px;
	left: 90px;
}

.account-box .btn:hover {
	color: #fff;
}

.btn-facebook {
	background-color: #3F639E;
	color: #fff;
	font-weight: bold;
}

.btn-google {
	background-color: #454545;
	color: #fff;
	font-weight: bold;
}

input[type=text], input[type=password] , input[type = input] {
	width: 25%;
	padding: 10px 10px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
	margin-top: 0px;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 10px 10px;
	border: none;
	cursor: pointer;
	width: 20%;
}
</style>


<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ=="
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>

	<div class="container-fluid" style='background-color: #0066ff;'>


		<div class="row">
			<div class="col-sm-8"></div>
			<div class="col-sm-2">
				<form class="navbar-form" role="search">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search"
							name="q">
						<div class="input-group-btn">
							<button class="btn btn-default" type="submit">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</div>
					</div>
				</form>

			</div>
			<div class="col-sm-2"></div>

		</div>
	</div>

	<div class="container-fluid" style='background-color: #0066ff;'>
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<h2 style="color: white">Uni Credit Cards</h2>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<div class="container-fluid" style="background-color: #99c2ff;">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-10">
				<div class="btn-group btn-group-justified"
					style="background-color: #99c2ff;">

					<a href="#" class="btn btn-primary">Banking</a> <a href="#"
						class="btn btn-primary">Credit cards</a> <a href="#"
						class="btn btn-primary">lending </a> <a href="#"
						class="btn btn-primary">Investing</a> <a href="#"
						class="btn btn-primary">Bussiness</a> <a href="#"
						class="btn btn-primary">Rewards & Offers</a> <a href="#"
						class="btn btn-primary">Services </a> <a href="#"
						class="btn btn-primary">Unigold</a>
				</div>

			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>

	<form action="activatecard" method="POST">


		<h2 style="margin-top: 60px; text-align: center;">UniCredit Card
		</h2>
		<hr style="">


		<h3 style="margin-top: 50px; text-align: center;">Activate
			UniCredit Card</h3><br>
		<h4 style="text-align: center; margin-left: 80px;">Please enter
			your 16-digit Card Number , username and password</h4>

		<div style="text-align: center; margin-top: 25px; margin-left: 80px;">
			 <label>Card Number :</label>   <input type="input" name="CardNo" placeholder="Card No " required>
		 <br> <br> <label><b>Username :</b></label> <input type="text"
				placeholder="Enter Username" name="userName" required> <br>
			<br> <label><b>Password :</b></label> <input type="password"
				placeholder="Enter Password" name="password" required> <br>
		

		
		</div>
		

		<div style="text-align: center; margin-top: 25px;">
			<input type="submit" value="Submit">
		</div>

	</form>


	<footer style=" background-color:#d3d3d3; margin-top : 150px; ">
	<div class="container-fluid">

		<div class="text-center center-block">
			<p align="center">
				Copyright <i class="fa fa-copyright"> </i> All right
				reserved.&nbsp;&nbsp;&nbsp;&nbsp;
			</p>
			<br /> <a href="https://www.facebook.com"><i id="social-fb"
				class="fa fa-facebook-square fa-3x social"></i></a> <a
				href="https://twitter.com"><i id="social-tw"
				class="fa fa-twitter-square fa-3x social"></i></a> <a
				href="https://google.com"><i id="social-gp"
				class="fa fa-google-plus-square fa-3x social"></i></a> <a
				href="mailto:bootsnipp@gmail.com"><i id="social-em"
				class="fa fa-envelope-square fa-3x social"></i></a>
		</div>

	</div>
	</footer>


</body>
</html>