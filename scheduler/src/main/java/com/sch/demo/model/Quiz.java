package com.sch.demo.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quiz {
	private int quiz_id;
	private String question;
	private String answer;
	private String type; //short or multiple
	private int reward;
	private Date created_by; 
	private Date updated_at;
}
