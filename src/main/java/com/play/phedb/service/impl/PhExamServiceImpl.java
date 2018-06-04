package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhExam;
import com.play.phedb.dao.mapper.PhExamMapper;
import com.play.phedb.service.PhExamService;

@Service
public class PhExamServiceImpl implements PhExamService {
	@Autowired
	PhExamMapper phExamMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phExamMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.insert(record);
	}

	@Override
	public int insertSelective(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.insertSelective(record);
	}

	@Override
	public PhExam selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phExamMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhExam> query(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.query(record);
	}
	@Override
	public int queryCount(PhExam record) {
		// TODO Auto-generated method stub
		return phExamMapper.queryCount(record);
	}
}
