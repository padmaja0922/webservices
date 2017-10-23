package com.sivakiran.eliminationtest.service;

import com.sivakiran.eliminationtest.dao.CartDao;

public class CartService {
public String item,brand,colar,cartId;
	public static String generateId(int prdt)
	{
		if(prdt==1)
		{
			CartService cart = new CartService();
			cart. item="phone";
			cart. brand="i-phone";
			cart.colar="red";
			cart.cartId="PMR1128";
		
			CartDao.saveCart(cart);
			return cart.cartId;		
		}
		return null;
	}
}
