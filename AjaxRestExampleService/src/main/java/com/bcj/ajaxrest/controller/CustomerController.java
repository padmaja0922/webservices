package com.bcj.ajaxrest.controller;

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

import com.bcj.ajaxrest.entity.Customer;
import com.bcj.ajaxrest.service.CustomerService;


@RestController

public class CustomerController {

	@Autowired
	private CustomerService custService;


	private Customer customer;

	public CustomerService getCustService() {
		return custService;
	}

	public void setCustService(CustomerService custService) {
		this.custService = custService;
	}
		
	//Add new Customer

	@RequestMapping(value ="/create", method = RequestMethod.POST)
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

	 @RequestMapping(value = "/getfrm/{id}", method = RequestMethod.GET )

	  public Customer findCustomerById(@PathVariable("id") int id){
		 
		 System.out.println("controller");
		 customer = custService.findCustomerById(id);	 
		  
		  if(customer== null)
		    return null;
		  
		  else
			  return customer;	 
		 
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
	 @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	 public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer cust)
	 {
		 System.out.println("servicecontroller");
		 System.out.println(id);
		 cust.setId(id);
		 
		 customer = custService.findCustomerById(id);
		 		 
		 if(customer==null)
			 return  new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		 else{
			
			 customer.setFirstName(cust.getFirstName());
			 customer.setLastName(cust.getLastName());
			 customer.setEmail(cust.getEmail());
			 customer.setPhone(cust.getPhone());
			 System.out.println(customer);
			 custService.updateCustomer(customer);
			 return  new ResponseEntity<Customer>(HttpStatus.OK);
			 
		 }
			 

	 }

	  // Delete Customer
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	 public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") int id){
		 
	customer = custService.findCustomerById(id);
		 
		 if(customer==null)
			 return  new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		 else{
		 
			  custService.deleteCustomer(id);
			  return  new ResponseEntity<Customer>(HttpStatus.FOUND); 
		 
		 }
	 }
	 

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	
}
