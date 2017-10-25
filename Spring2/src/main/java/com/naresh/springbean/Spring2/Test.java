package com.naresh.springbean.Spring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main (String[] args)
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	
	NotificationService notificationService = context.getBean(NotificationService.class);
	notificationService.sendNotification("naresh@gmail", "delivered");
	context.close();
	//addding a few lines of comments
	//these are the lines
}
}
