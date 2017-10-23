package com.bcj.restfulservices.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.bcj.restfulservices.entity.Country;

public class CountryDao {

	
	
	  private static SessionFactory sessionFactory;
	     
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            
	            Configuration configuration = new Configuration().configure();
	            ServiceRegistry serviceRegistry
	                = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();
	             
	           
	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
	        }
	         
	        return sessionFactory;
	    }

		public void saveCountry(Country country) {
			
			Session session = 
			
		}
	
	
	    
	
	
	
	
}
