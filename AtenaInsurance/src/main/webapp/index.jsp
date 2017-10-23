<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC submit form AJAX JQuery</title>
<script src="http:////code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	
	$(document).ready(function() {

		$('#submitForm').submit(function(e) {
			var frm = $('#submitForm');
			e.preventDefault();

		    var data = {}
		    var Form = this;

		    //Gather Data also remove undefined keys(buttons)
		    $.each(this, function(i, v){
		            var input = $(v);
		        data[input.attr("name")] = input.val();
		        delete data["undefined"];
		    });
        $.ajax({
            contentType : 'application/json; charset=utf-8',
            type: frm.attr('method'),
            url: frm.attr('action'),
            dataType : 'json',
            data : JSON.stringify(data),
            success : function(callback){
            	alert("Response: FirstName: "+callback.firstName+"  LastName: "+callback.lastName+"  Email: "+callback.email+"  Phone: "+callback.phone);
            },
            error : function(){
                $(this).html("Error!");
            }
        });
		});
	});
</script>
</head>
<body>
<form:form commandName="customer" action="submitForm.web" method="post" id="submitForm">     

	    <fieldset style="width: 300px;">
	        <legend>Member details</legend>
	        <ol>
	            <li>
	                <p><label for=name>FirstName</label>
	                <form:input path="firstName"  type="text" placeholder="First name" /></p>
	            </li>
	             <li>
	                <p><label for=name>LastName</label>
	                <form:input path="lastName"  type="text" placeholder="Last name" /></p>
	            </li>
	             
	            <li>
	                <p><label for=email>Email</label>
	                <form:input path="email" type="text" required="true" /></p>
	            </li>
	            <li>
	                <p><label for=phone>Phone</label>
	                <form:input path="phone" type="text" required="true" /></p>
	            </li>
	            
	         </ol>
	    </fieldset>

		<fieldset style="width: 300px;">
			<input id="submitId" type="submit" value="Submit Form">
		</fieldset>
	</form:form> 		
        
</body>
</html>