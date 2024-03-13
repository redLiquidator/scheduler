package com.sch.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sch.demo.model.User;
@Mapper
public interface UserMapper{

	public User SelectUserInfo(String userid);
}