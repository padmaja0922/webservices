package com.bcj.creditcard.service;



import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.bcj.creditcard.entity.CreditCard;
import com.bcj.creditcard.entity.Customer;


/*
 * This class sends email to all the customers who applied for credit card with details of accepted or rejected
 */


public class MailService {

	public void sendMail(Customer customer, CreditCard card) {

		final String from="pmutthoju.bcj@gmail.com";
	    final String password="anuchandu1";
	    String to = customer.getEmail();
	
	    Properties props = new Properties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");
	
	 
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
        	
	            protected PasswordAuthentication  getPasswordAuthentication() {
	              return new PasswordAuthentication(from, password) ; }
	
          });
		
        // compose the message

		try {

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Activate your  Credit Card ");

			if (customer.getStatus().equalsIgnoreCase("Approved"))
				message.setText(acceptedmessage(customer, card));
			else
				message.setText(customer.getFirstName() + " " + customer.getFirstName() +" Your Credit Card Application is Declined because your Credit score is less ");

			// Send message

			Transport.send(message);
			System.out.println("message sent successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}

	
/*
 * This method returns accepted message with card details	
 */
	
	public static String acceptedmessage(Customer customer, CreditCard card) {

		String accept = "Your credit card application is  " + customer.getStatus();
		accept = accept + " with Card number : " + card.getCardNo() + " and Credit Limit " + card.getCreditLimit();

		return accept;

	}

}
