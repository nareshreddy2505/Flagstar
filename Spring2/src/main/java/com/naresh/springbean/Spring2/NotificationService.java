package com.naresh.springbean.Spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	@Autowired
	private EmailService emailservice;
	
//	public NotificationService(EmailService emailservice)
//	{
//		this.emailservice=emailservice;
//	}
public void sendNotification(String to, String msg)
{
  emailservice.sendEmail(to, msg);
}
}
