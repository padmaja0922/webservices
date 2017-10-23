/**
 * 
 */
package com.bcj.crud.controller;

import com.bcj.crud.service.RefinementService;

/**
 * @author Bootcamp User 014
 *
 */
public class RegfinementController {
	public static boolean deleteCustomer(int id,int mode)
	{
		return RefinementService.deleteCustomer(id,mode);
	}
}
