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
	
	private String startDate;
	
	public User(String Message) {
		this.Message = Message;
	}
	
    //기본 생성자 추가
	//HttpMessageNotReadableException: JSON parse error: 
	//Cannot construct instance of `com.sch.demo.model.User` (although at least one Creator exists): 
	//cannot deserialize from Object value (no delegate- or property-based Creator)]
    public User() {

    }

}
