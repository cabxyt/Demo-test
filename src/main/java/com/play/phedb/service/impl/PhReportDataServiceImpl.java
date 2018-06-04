package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhReportData;
import com.play.phedb.dao.mapper.PhReportDataMapper;
import com.play.phedb.service.PhReportDataService;

@Service
public class PhReportDataServiceImpl implements PhReportDataService {
	@Autowired
	PhReportDataMapper phReportDataMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportDataMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.insert(record);
	}

	@Override
	public int insertSelective(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.insertSelective(record);
	}

	@Override
	public PhReportData selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportDataMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhReportData> query(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.query(record);
	}
	@Override
	public int queryCount(PhReportData record) {
		// TODO Auto-generated method stub
		return phReportDataMapper.queryCount(record);
	}
}
