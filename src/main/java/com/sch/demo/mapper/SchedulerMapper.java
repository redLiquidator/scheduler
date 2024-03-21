package com.sch.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface SchedulerMapper{

	List<HashMap<String, Object>> getUserSchedule(String userid);
}