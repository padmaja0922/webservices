<%@ page contentType = "text/html; charset = UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
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
</style>


<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-md-offset-1">
				<div class="account-box">
					<form class="form-signin" action="signIn" , method = "POST">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Email"
								required autofocus />
						</div>
						<div class="form-group">
							<input type="password" class="form-control"
								placeholder="Password" required />
						</div>

						<button class="btn btn-lg btn-block purple-bg" type="submit">
							Sign in</button>
					</form>
					<a class="forgotLnk" href="#"> Forgot password? </a>
					<div class="or-box">
						<span class="or">OR</span>
						<div class="row">
							<div class="col-md-12 row-block">
								<a href="activate"
									class="btn btn-facebook btn-block">Activate Card</a>
							</div>

						</div>
					</div>
					<div class="or-box row-block">
						<div class="row">
							<div class="col-md-12 row-block">
								<a href="registration" class="btn btn-primary btn-block">Apply
									Now</a>
							</div>
						</div>
					</div>
				</div>
			</div>


			<div class="col-md-8">


				<div id="myCarousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>

					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="https://www.suntrust.com/static/images/personal-banking/card-art/credit-cards/cash-rewards-classic-rays-651x412.png" alt="Chania">
						</div>

						<div class="item">
							<img src="https://www.afcu.org/sites/www.afcu.org/files/images/Business%20Credit%20Card.png" alt="Chania">
						</div>

						<div class="item">
							<img src="https://www.suntrust.com/Static/Images/small-business-banking/card-art/rewards-for-business-mastercard-652x411.png" alt="Flower">
						</div>

					</div>

					<!-- Left and right controls -->
					
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
				</div>
			</div>
		</div>



<br><br>

<footer style=" background-color:#d3d3d3 ">
  <div class="container-fluid" >

        <div class="text-center center-block">
        <p align="center"> Copyright <i class="fa fa-copyright"> </i> All right reserved.&nbsp;&nbsp;&nbsp;&nbsp; </p>
            <br />
                <a href="https://www.facebook.com"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://google.com"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
	            <a href="mailto:bootsnipp@gmail.com"><i id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
</div>
   
</div>
    </footer>








</body>
</html>
