package com.bcj.rest.controller;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.bcj.rest.model.Customer;
import com.bcj.rest.service.CustomerService;

@Path("/customer")
public class CustomerController {

	@POST
    @Path("/create")
    @Consumes("application/json")
    public Response addCustomer(Customer cust){
        cust.setfName(cust.getfName());
        cust.setlName(cust.getlName());
        cust.setNumber(cust.getNumber());
        CustomerService srvs=new   CustomerService();
       srvs.addCustomer(cust);
     
        
        return Response.ok().build();
    }

}
