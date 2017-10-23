package com.sivakiran.eliminationtest.userinterface;

import com.sivakiran.eliminationtest.controller.ProductController;
import com.sivakiran.eliminationtest.database.ProductDb;

public class ProductUi {
	public static  boolean  displayProducts()
	{
		 ProductDb prdt= ProductController.displayProducts();
		 System.out.println("\nProduct.Id   Product    Brand ");
		 System.out.println("_________________________________");
		 System.out.println("     1"+"       Phone      "+prdt.getPhn());
		 System.out.println("     2"+"       watch      "+prdt.getWth());
		 System.out.println("     3"+"       Computer   "+prdt.getPc());
		 System.out.println("     4"+"       software   "+prdt.getSoftware());
		 return true;
		}

}
