package com.sivakiran.eliminationtest.service;

import com.sivakiran.eliminationtest.dao.ProductDao;
import com.sivakiran.eliminationtest.database.ProductDb;

public class ProductService {

	public static  ProductDb displayProducts()
	{
		 ProductDb prdt= ProductDao.displayProducts();
		 
		 return prdt;
		}
}
