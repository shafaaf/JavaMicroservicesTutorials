package com.journaldev.di.services;

public class MockMessageService implements MessageService{

	public boolean sendMessage(String msg, String receipient) {
		System.out.println("Mock Message sent to user "+receipient+" with message=" + msg);
		return true;
	}

}
