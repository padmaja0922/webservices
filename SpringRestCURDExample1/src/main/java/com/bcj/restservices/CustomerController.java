package com.bcj.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bcj.restservices.entity.Customer;
import com.bcj.restservices.service.CustomerService;


@RestController
public class CustomerController {
	
	
@Autowired
private CustomerService custService;


 Customer customer;

public CustomerService getCustService() {
	return custService;
}

public void setCustService(CustomerService custService) {
	this.custService = custService;
}
	
//Add new Customer

@RequestMapping(value ="customer/new", method = RequestMethod.POST)
public ResponseEntity<Void> saveCustomer(@RequestBody Customer cust , UriComponentsBuilder ucb){
	
	if(custService.isCustomerExsist(cust)){
		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		
	}
	else{
		
		custService.saveCustomer(cust);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(ucb.path("/customer/{id}").buildAndExpand(cust.getId()).toUri());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
  }	

  //Get single Customer by Id

 @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET ,  headers = "Accept=application/json")

  public ResponseEntity<Customer> findCustomerById(@PathVariable("id") int id){
	 
	  customer = custService.findCustomerById(id);	 
	  
	  if(customer== null)
	    return new ResponseEntity<Customer>(HttpStatus.NOT_EXTENDED);
	  
	  else
		  return new ResponseEntity<Customer>(customer,HttpStatus.OK);	 
	 
 }
 
 // get all customers
 
 @RequestMapping(value = "/customers", method = RequestMethod.GET)
 public ResponseEntity<List<Customer>> getAllCustomers(){
	 
	  List<Customer> custList = custService.getAllCustomers();
	  
	   if(custList.isEmpty())
		   return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);
	   else
	      return new ResponseEntity<List<Customer>>(custList,HttpStatus.OK);
	   	 
 }
 
 
 // Update Customer
 @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
 public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer cust)
 {
	 customer = custService.findCustomerById(id);
	 
	 if(customer==null)
		 return  new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	 else{
		 
		 customer.setFirstName(cust.getFirstName());
		 customer.setLastName(cust.getLastName());
		 customer.setAge(cust.getAge());
		 custService.updateCustomer(customer);
		 return  new ResponseEntity<Customer>(HttpStatus.OK);
		 
	 }
		 
 }
 

  // Delete Customer
 @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
 public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id){
	 
customer = custService.findCustomerById(id);
	 
	 if(customer==null)
		 return  new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	 else{
	 
		  custService.deleteCustomer(id);
		  return  new ResponseEntity<Customer>(HttpStatus.FOUND); 
	 
	 }
 }
 





}
