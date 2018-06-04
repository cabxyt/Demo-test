package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhEmpIdentity;
import com.play.phedb.dao.mapper.PhEmpIdentityMapper;
import com.play.phedb.service.PhEmpIdentityService;

@Service
public class PhEmpIdentityServiceImpl implements PhEmpIdentityService {
	@Autowired
	PhEmpIdentityMapper phEmpIdentityMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.insert(record);
	}

	@Override
	public int insertSelective(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.insertSelective(record);
	}

	@Override
	public PhEmpIdentity selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhEmpIdentity> query(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.query(record);
	}
	@Override
	public int queryCount(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.queryCount(record);
	}
}
