package com.sch.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sch.demo.mapper.SchedulerMapper;
import com.sch.demo.model.Quiz;


@Service
public class schedulerService {
	@Autowired
	SchedulerMapper schedulerMapper;
	 
	public List<Quiz> SelectQuizList(){ 
		//return schedulerMapper.SelectQuizList(); 
		return null;
	}	 
}
