package com.sch.demo.service;

public enum Message {
	AUTHENTICATION_SUCCESS(999, "인증성공"),
    ALREADY_EXIST_USERNAME(100, "이미 존재하는 아이디입니다."),
    WRONG_PASSWORD(101,"비밀번호가 틀렸습니다."),
    NOT_FOUND_MEMBER(102, "회원 정보가 없습니다.");

	Message(int i, String string) {
		// TODO Auto-generated constructor stub
	}

}
