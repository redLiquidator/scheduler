package com.sch.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sch.demo.mapper.SchedulerMapper;
import com.sch.demo.mapper.UserMapper;
import com.sch.demo.model.Quiz;
import com.sch.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;

	public User SelectUserInfo(String userid){ 
		return userMapper.SelectUserInfo(userid); 
	}	 
}
