/**
 * 
 */
package com.bcj.webshop.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.webshop.messaging.MessageSender;
import com.bcj.webshop.model.Order;


public class OrderService {

	@Autowired
	MessageSender messageSender;

	public String generateOrderID() {

		Random count = new Random();

		int number = count.nextInt((9998 - 100) + 1) + 1000;
		String orderID = number + "";

		return orderID;
	}

	public boolean sendOrder(Order order) {

		OrderService serv = new OrderService();
		order.setOrderId(serv.generateOrderID());

		try {
			messageSender.sendMessage(order);
			return true;
		} catch (Exception exp) {
			return false;
		}
	}

}
