package com.bcj.restfulservices.service;

import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bcj.restfulservices.dao.CountryDao;
import com.bcj.restfulservices.entity.Country;

public class CountryService {
	
	CountryDao counDao = new  CountryDao();
	

@POST 
@Produces(MediaType.APPLICATION_JSON)
  public void saveCountry(Country country){
	
	  counDao.saveCountry(country); 
	
	
	
}
	
	
	

}
