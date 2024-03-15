package com.sch.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sch.demo.controller.LoginController;
import com.sch.demo.mapper.UserMapper;
import com.sch.demo.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	UserMapper userMapper;

	// @Enumerated(EnumType.STRING)
	// @Column(nullable = false)
	Message message;

	// 사용자 정보 조회
	public User SelectUserInfo(String userid) {
		return userMapper.SelectUserInfo(userid);
	}

	public User login(User user) {
		User dbuser = userMapper.findById(user.getUserid());
		if (dbuser != null) {
			// ID가 존재하는 경우 비밀번호 일치 여부 확인(DB 와 사용자가 입력한 비번)
			if (dbuser.getPassword().equals(user.getPassword())) {
				dbuser.setMessage(Message.AUTHENTICATION_SUCCESS.toString());
				log.debug("result ::: 비밀번호 일치");
				return dbuser;
			} else {
				log.debug("result ::: 비밀번호 불일치");
				// throw new MemberException(MemberExceptionType.WRONG_PASSWORD);
				return new User(Message.WRONG_PASSWORD.toString());
			}
		} else {
			log.debug("result ::: 아이디가 존재하지 않음");
			// throw new MemberException(MemberExceptionType.NOT_FOUND_MEMBER);
			return new User(Message.NOT_FOUND_MEMBER.toString());
		}
	}
}
