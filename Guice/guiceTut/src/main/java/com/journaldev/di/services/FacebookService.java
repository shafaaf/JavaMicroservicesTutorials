package com.journaldev.di.services;

import javax.inject.Singleton;

@Singleton
public class FacebookService implements MessageService {

	public boolean sendMessage(String msg, String receipient) {
		//some complex code to send Facebook message
		System.out.println("Facebook message sent to "+receipient+" with message="+msg);
		return true;
	}

}
