/**
 * 
 */
package com.bcj.webshop.messaging;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.bcj.webshop.model.Order;

public class MessageSender{
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Destination messageDestination;

	

	public void sendMessage(final Order order) {
		System.out.println("Producer sends " + order);
		jmsTemplate.send(messageDestination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				ObjectMessage objectMessage = session.createObjectMessage(order);
				return objectMessage;
			}
		});
	}

}
