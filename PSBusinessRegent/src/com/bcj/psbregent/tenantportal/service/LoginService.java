/**
 * 
 */
package com.bcj.psbregent.tenantportal.service;

import com.bcj.psbregent.tenantportal.dao.LoginDao;

/**
 * This class gets username and password from controller class and pass them to
 * LoginDao class fro verification
 *
 */
public class LoginService {

	/**
	 * @param userId
	 * @param password
	 * @return result
	 * 
	 * 
	 */

	public static boolean verifyLogin(String userId, String password) {

		boolean result = LoginDao.verifyLogin(userId, password);
		return result;

	}

}
