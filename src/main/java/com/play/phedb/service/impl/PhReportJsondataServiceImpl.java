package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhReportJsondata;
import com.play.phedb.dao.mapper.PhReportJsondataMapper;
import com.play.phedb.service.PhReportJsondataService;

@Service
public class PhReportJsondataServiceImpl implements PhReportJsondataService {
	@Autowired
	PhReportJsondataMapper phReportJsondataMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.insert(record);
	}

	@Override
	public int insertSelective(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.insertSelective(record);
	}

	@Override
	public PhReportJsondata selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhReportJsondata> query(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.query(record);
	}
	@Override
	public int queryCount(PhReportJsondata record) {
		// TODO Auto-generated method stub
		return phReportJsondataMapper.queryCount(record);
	}
}
