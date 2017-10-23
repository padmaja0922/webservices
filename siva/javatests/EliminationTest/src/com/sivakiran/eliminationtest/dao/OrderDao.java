package com.sivakiran.eliminationtest.dao;

import com.sivakiran.eliminationtest.database.OrderDb;

public class OrderDao {
public static void  saveOrderId(String odrId)
{
	OrderDb.saveOrderId(odrId);
	}
}
