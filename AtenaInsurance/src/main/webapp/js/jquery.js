/**
 * 
 */
$(document).ready(function(){
	
	$('#bttn').click(function(){
		
		var name= $('#name').val();
		var age = $('#age').val();
		var email = $('#email').val();
		
		
        $.ajax({
        	
       
        	type : 'POST',
        	url : 'customer',
        	dataType:'json',
        	
           	data : {name : name, age:age, email:email},
        	success: function(result){
        		$('#result').html(result);
        		
        	}
        	
        })
        
    });
	
	
});