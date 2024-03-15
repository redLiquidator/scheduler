package com.sch.demo.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private String userid;
	private String email;
	private String name;
	private String password;
	private Date signup_date;
	
	private String Message;
	
	public User(String Message) {
		this.Message = Message;
	}

}
