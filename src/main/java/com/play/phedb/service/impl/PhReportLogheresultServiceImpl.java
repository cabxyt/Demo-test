package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhReportLogheresult;
import com.play.phedb.dao.mapper.PhReportLogheresultMapper;
import com.play.phedb.service.PhReportLogheresultService;

@Service
public class PhReportLogheresultServiceImpl implements PhReportLogheresultService {
	@Autowired
	PhReportLogheresultMapper phReportLogheresultMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.insert(record);
	}

	@Override
	public int insertSelective(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.insertSelective(record);
	}

	@Override
	public PhReportLogheresult selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhReportLogheresult> query(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.query(record);
	}
	@Override
	public int queryCount(PhReportLogheresult record) {
		// TODO Auto-generated method stub
		return phReportLogheresultMapper.queryCount(record);
	}
}
