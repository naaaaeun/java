package com.kbstar.noti;

import com.kbstar.frame.Notification;

public class NotificationImple implements Notification{

	@Override
	public void sendEmail(String email, String msg) throws Exception {
		System.out.printf("\n%s로 %s 전송..\n",email,msg);
	}

	@Override
	public void sendSMS(String contact, String msg) throws Exception {
		System.out.printf("\n%s로 %s 전송..\n",contact,msg);
	}

}
