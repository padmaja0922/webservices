package com.psbussinesspark.tenentportal.service;

import com.psbussinesspark.tenentportal.dao.LoginDao;

/**
 * @author Bootcamp User 014 Takes the Login information and verify
 */

public class LoginService {
	/**
	 *Getting user id and password and verify with data in database
	 */
	public static String verifyTanent(String user, String code) {
		String result = LoginDao.verifyTanent(user);
		// Separating user name and return
		String[] words = result.split("\\s");
		if (words[1].equals(code))
			return words[0];
		else
			return null;
	}

}
