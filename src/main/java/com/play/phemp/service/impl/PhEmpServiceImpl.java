package com.play.phemp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.phemp.dao.entity.PhEmpIdentity;
import com.play.phemp.dao.mapper.PhEmpIdentityMapper;
import com.play.phemp.service.PhEmpService;

@Service
public class PhEmpServiceImpl implements PhEmpService {
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
		return phEmpIdentityMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(PhEmpIdentity record) {
		// TODO Auto-generated method stub
		return phEmpIdentityMapper.updateByPrimaryKey(record);
	}
}
