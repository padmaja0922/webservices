package com.bcj.soapclient.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestBody;

import com.bcj.soap.Demosoap;
import com.bcj.soap.Demosoap_Service;



@Path("/SoapClient")
public class SOAPClientService {
	
	
	@POST
	@Path("/address/new")

	public String addAddress(@RequestBody com.bcj.soap.Address addr){
		
      Demosoap_Service soapClient = new  Demosoap_Service();
		
		Demosoap ds = soapClient.getSoapServiceImplementationPort();
		 
		return ds.testing(addr);
		
			
		
	}
	
	@GET
	@Path("/new")
	@Produces("text/plain")
	public String displayString(){
		
		return "new method"; 
	}

}
