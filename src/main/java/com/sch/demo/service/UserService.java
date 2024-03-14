package com.sch.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sch.demo.mapper.UserMapper;
import com.sch.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	//사용자 정보 조회
	public User SelectUserInfo(String userid){ 
		return userMapper.SelectUserInfo(userid); 
	}	
	
	//ID가 있고 비번이 일치하면 로그인
	//ID가 없음
	//ID는 일치하나 비번이 틀림 
	 public User login(User user){
	        User dbuser = userMapper.findById(user.getUserid());
	        if(dbuser.getUserid() != null){
	            // ID가 존재하는 경우 비밀번호 일치 여부 확인(DB 와 사용자가 입력한 비번)
	            if(dbuser.getPassword().equals(user.getPassword())) {
	                //비밀번호 일치
	                return dbuser;
	            } else {
	                //비밀번호 불일치
	                return null;
	            }
	        } else {
	            // 조회 결과가 없다
	            return null;
	        }
	    }
}
