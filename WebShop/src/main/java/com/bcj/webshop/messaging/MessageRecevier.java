package com.bcj.webshop.messaging;


import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageRecevier implements MessageListener {
	
	
	

	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	public static void main( String[] args )
    {
        MessageRecevier app = new MessageRecevier();
        app.run();
    }
 
    public void run()
    {
        try
        {
            ConnectionFactory factory = new ActiveMQConnectionFactory(url);
            Connection connection = factory.createConnection();
            connection.start();
           Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("messageQueue1");
            MessageConsumer consumer = session.createConsumer(destination);
            consumer.setMessageListener(this);
        }
        catch (Exception e)
        {
            System.out.println("Caught:" + e);
            e.printStackTrace();
        }
    }
 
    public void onMessage(Message message)
    {
        try
        {    TextMessage txtMessage = (TextMessage)message;
                System.out.println("Message received: " + txtMessage.getText());
           
        }
        catch (JMSException e)
        {
            System.out.println("Caught:" + e);
            e.printStackTrace();
        }
    }

}
