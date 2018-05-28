package com.play.phemp.service;

import com.play.phemp.dao.entity.PhEmpIdentity;

public interface PhEmpService {
	int deleteByPrimaryKey(Long key);

	int insert(PhEmpIdentity record);

	int insertSelective(PhEmpIdentity record);

	PhEmpIdentity selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhEmpIdentity record);

	int updateByPrimaryKey(PhEmpIdentity record);

}
