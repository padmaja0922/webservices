<%@ page contentType = "text/html; charset = UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>


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

/*
    Multicoloured Hover Variations
*/
 
 #social-fb:hover {
     color: #3B5998;
 }
 #social-tw:hover {
     color: #4099FF;
 }
 #social-gp:hover {
     color: #d34836;
 }
 #social-em:hover {
     color: #f39c12;
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
	<br><br>
	
	
<form action="submit" method="POST">
	
  <div class="container">
 
  <div class="panel-group" id="accordion">
      <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Name</a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse in">
        <div class="panel-body">
        <div class="form-inline">
        
        <span class="form-group">
     
      <input type="input" class="form-control" name="firstName" placeholder="firstName" required>
    </span>
    
     <span class="form-group">
     
      <input type="input" class="form-control" name="lastName" placeholder="lastName" required>
    </span>
   
   
        </div>
      </div>
      </div>
    </div>    
    
    
  <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse5">Date-of-Birth</a>
        </h4>
      </div>
      <div id="collapse5" class="panel-collapse collapse">
        <div class="panel-body">
        
        <div class="form-group">
     
      <input type="input" class="form-control" name="dob" placeholder="Date-of-Birth " required>
    </div>
        
        </div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse6">SSN</a>
        </h4>
      </div>
      <div id="collapse6" class="panel-collapse collapse">
        <div class="panel-body">
        
        
        <div class="form-group">
     
      <input type="password" class="form-control" name="ssn" placeholder="SSN " required>
    </div>
        
        
        </div>
      </div>
    </div>
 
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Telephone </a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body">
        
         <div class="form-group">
     
      <input type="telephone" class="form-control" name="phone" placeholder="Primary Number" required>
    </div>        
        
        </div>
      </div>
    </div>
    
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Email</a>
        </h4>
      </div>
      <div id="collapse4" class="panel-collapse collapse">
        <div class="panel-body">
        
        
        <div class="form-group">
     
      <input type="email" class="form-control" name="email" placeholder="Email " required>
    </div>
        
        </div>
      </div>
    </div>
    
    
     <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse7">Employment Details</a>
        </h4>
      </div>
      <div id="collapse7" class="panel-collapse collapse">
        <div class="panel-body">
        <div class="form-inline">
        
        <span class="form-group">
     
      <input type="input" class="form-control" name="empDetails.annualIncome" placeholder="Annual Income" required>
    </span>
     <span class="form-group">
     
      <input type="input" class="form-control" name="empDetails.CompanyName" placeholder="Company Name" >
    </span>
     
        </div>
      </div>
      </div>
      
    </div>
    </div>
 
   
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Home Address</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
        <div class="panel-body">
        <div class="form-inline">
        
        <span class="form-group">
     
      <input type="input" class="form-control" name="addr.addressLine1" placeholder="addressLine1" required>
    </span>
     <span class="form-group">
     
      <input type="input" class="form-control" name="addr.addressLine2" placeholder="addressLine2" required>
    </span>
     <span class="form-group">
     
      <input type="input" class="form-control" name="addr.city" placeholder="City" required>
    </span>
    <span class="form-group">
     
      <input type="input" class="form-control" name="addr.state" placeholder="State" required>
    </span>
    <span class="form-group">
     
      <input type="input" class="form-control" name="addr.zip" placeholder="Zip" required>
    </span>
    
        </div>
      </div>
      </div>
    </div>
    
  <br>
  <br>

   <div class="container">   
   <input type="submit" class="btn btn-primary btn-block" value="Submit"> 
   </div>

    </div>
     </div>
</form>


<br>
<br>
<footer  style=" background-color:#d3d3d3">
  

        <div class="text-center center-block">
        <p align="center"> Copyright <i class="fa fa-copyright"> </i> All right reserved.&nbsp;&nbsp;&nbsp;&nbsp; </p>            
                <a href="https://www.facebook.com"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://plus.google.com/"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
	            <a href="mailto:bootsnipp@gmail.com"><i id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
</div>
 

    </footer>


</body>
</html>
    