/**
 * 
 */
package com.bcj.psbregent.tenantportal.service;

import com.bcj.psbregent.tenantportal.dao.RegistrationDao;
import com.bcj.psbregent.tenantportal.entity.Company;

/**
 * @author Boot Camp User 008
 *
 */
public class RegistrationService {

	/**
	 * @param company
	 * @return
	 */
	public static int saveCompanyDetails(Company company) {
		
		int x = RegistrationDao.saveCompanyDetails(company);
		
		return x;
	}

	
}
