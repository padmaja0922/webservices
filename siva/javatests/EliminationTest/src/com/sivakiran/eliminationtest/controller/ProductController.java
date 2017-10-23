package com.sivakiran.eliminationtest.controller;

import com.sivakiran.eliminationtest.database.ProductDb;
import com.sivakiran.eliminationtest.service.ProductService;

public class ProductController {
	public static  ProductDb displayProducts()
	{
		 ProductDb prdt= ProductService.displayProducts();
		 
		 return prdt;
		}

}
