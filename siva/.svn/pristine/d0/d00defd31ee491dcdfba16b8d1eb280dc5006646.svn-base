<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>CereditCard Application</title>

</head>
<body>
</head>
<body
	background="https://cdn.kastatic.org/images/homepage/background-learner.jpg" style='background-size:cover;'>
	<div class="container-fluid" style='background-color: #000080;'>
		<div class="row"></div>
	</div>

	<div class="container-fluid" style='background-color: #000080;'>
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-9">
				<h2 style="color: white">CitiBank CreditCard Application</h2>
			</div>
			<div class="col-sm-2">
				<form class="navbar-form" role="search">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
				</form>
			</div>
		</div>
	</div>





	<div class="container-fluid" style="background-color: #99c2ff;">
		<div class="row">
			<div class="btn-group btn-group-justified">
				<a href="#" class="btn btn-primary">Credit cards</a> <a href="#"
					class="btn btn-primary">Re-Apply</a> <a href="#"
					class="btn btn-primary">Investing</a> <a href="#"
					class="btn btn-primary">Bussiness</a> <a href="#"
					class="btn btn-primary">Rewards & Offers</a> <a href="#"
					class="btn btn-primary">Services </a> <a href="#"
					class="btn btn-primary">Contact Us</a>
			</div>
		</div>
	</div>


	<form action="saveCustomer" method="post">
		<%-- <form:form name="submitForm" method="POST"> --%>

		<div class="container">

			<div class="panel-group" id="accordion">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse1">Name</a>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">
							<div class="form-inline">

								<span class="form-group"> <input type="input"
									class="form-control" name="fName" placeholder="firstName">
								</span>&nbsp;<br> <span class="form-group"> <input
									type="input" class="form-control" name="lName"
									placeholder="lastName">
								</span>
							</div>
						</div>
					</div>
				</div>













				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse2">Home Address</a>
						</h4>
					</div>
					<div id="collapse2" class="panel-collapse collapse">
						<div class="panel-body">
							<div class="form-inline">

								<span class="form-group"> <input type="input"
									class="form-control" name="address.addressLine1"
									placeholder="addressLine1" required>
								</span>&nbsp;<br> <span class="form-group"> <input
									type="input" class="form-control" name="address.addressLine2"
									placeholder="addressLine2" required>
								</span>&nbsp;<br> <span class="form-group"> <input
									type="input" class="form-control" name="address.city"
									placeholder="City" required>
								</span>&nbsp;<br> <span class="form-group"> <input
									type="input" class="form-control" name="address.state"
									placeholder="State" required>
								</span>&nbsp;<br> <span class="form-group"> <input
									type="input" class="form-control" name="address.zip" placeholder="Zip"
									required>
								</span>&nbsp;<br>


							</div>
						</div>
					</div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse3">Contact Number </a>
						</h4>
					</div>
					<div id="collapse3" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-group">

								<input type="input" class="form-control"
									name="telephoneNumber" placeholder="Primary Number" required>
							</div>



						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse4">Email</a>
						</h4>
					</div>
					<div id="collapse4" class="panel-collapse collapse">
						<div class="panel-body">


							<div class="form-group">

								<input type="input" class="form-control" name="email"
									placeholder="Email " required>
							</div>

						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse5">Date-of-Birth</a>
						</h4>
					</div>
					<div id="collapse5" class="panel-collapse collapse">
						<div class="panel-body">

							<div class="form-group">

								<input type="input" class="form-control" name="dateOfBirth"
									placeholder="Date-of-Birth " required>
							</div>

						</div>
					</div>
				</div>


				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse6">SSN</a>
						</h4>
					</div>
					<div id="collapse6" class="panel-collapse collapse">
						<div class="panel-body">


							<div class="form-group">

								<input type="input" class="form-control" name="ssn"
									placeholder="SSN " required>
							</div>


						</div>
					</div>
				</div>



				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse7">Income</a>
						</h4>
					</div>
					<div id="collapse7" class="panel-collapse collapse">
						<div class="panel-body">
							<div class="form-inline">

								<span class="form-group"> <input type="input"
									class="form-control" name="financialinfo.annualIncome"
									placeholder="Annual Income" required> <br> 
									<input type="input" class="form-control" name="financialinfo.houseMortage"
									placeholder="House Mortage" required>
								</span>




							</div>
						</div>
					</div>

				</div>

				<br>

				<div class="container">
					<input type="submit" class="btn btn-primary btn-block"
						value="Submit">
				</div>
			</div>

		</div>
	</form>

	<br>
	<br>


</body>
</html>