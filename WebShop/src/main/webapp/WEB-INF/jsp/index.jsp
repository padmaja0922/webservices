<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>

<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="<c:url value="/resources/StyleSheet.css" />"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http:////code.jquery.com/jquery-1.10.2.js"></script>

</head>

<body>
	<br>

	<div class="container-fluid">

		<div class="col-md-3">
			<div class="card2" style="width: 350px;">
			
			<form:form commandName="msg" action="submitForm" method="post" id="submitForm">     

	    <fieldset style="width: 300px;">
	        <legend>Order Form</legend>
	        <ol>
	            <li>
	                <p><label for=name>Product name</label>
	                <form:input path="productName"  type="text" placeholder="Product name"/></p>
	            </li>	
	            <li>
	                <p><label for=name>Quantity</label>
	                <form:input path="quantity"  type="text" placeholder="Quantity"/></p>
	            </li>            
	         </ol>
	    </fieldset>

		<fieldset style="width: 300px;">
			<input id="submitId" type="submit" value="Submit Form">
		</fieldset>
	</form:form> 

		</div>
	</div>
	</div>





</body>

</html>
