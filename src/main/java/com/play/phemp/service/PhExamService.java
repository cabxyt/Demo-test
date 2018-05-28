package com.play.phemp.service;

import java.util.List;
import com.play.phemp.dao.entity.PhExam;

public interface PhExamService {
	int deleteByPrimaryKey(Long key);

	int insert(PhExam record);

	int insertSelective(PhExam record);

	PhExam selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhExam record);

	int updateByPrimaryKey(PhExam record);
	
	List<PhExam> query(PhExam record);

}
