package com.naresh.springbean.Spring2;

import org.springframework.stereotype.Component;

@Component
public class Emailext implements EmailService
{

	@Override
	public void sendEmail(String to, String body) {
     System.out.println("Mail Service");
     System.out.println("Sending to "+to);
     System.out.println("Message "+body);
	}
//adding a comment
}
