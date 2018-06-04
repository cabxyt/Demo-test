package com.play.phedb.service;

import java.util.List;
import com.play.phedb.dao.entity.PhEmpIdentity;

public interface PhEmpIdentityService {
	int deleteByPrimaryKey(Long key);

	int insert(PhEmpIdentity record);

	int insertSelective(PhEmpIdentity record);

	PhEmpIdentity selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhEmpIdentity record);

	int updateByPrimaryKey(PhEmpIdentity record);
	
	List<PhEmpIdentity> query(PhEmpIdentity record);
	
	int queryCount(PhEmpIdentity record);

}
