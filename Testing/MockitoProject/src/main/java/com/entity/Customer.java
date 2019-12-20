package com.entity;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Customer {

	private int id;
	private String name;
	private String email;
	private int phone;
	private String address;
	private String token;
}
