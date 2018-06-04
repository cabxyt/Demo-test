package com.play.phedb.service;

import java.util.List;
import com.play.phedb.dao.entity.PhReportJsondata;

public interface PhReportJsondataService {
	int deleteByPrimaryKey(Long key);

	int insert(PhReportJsondata record);

	int insertSelective(PhReportJsondata record);

	PhReportJsondata selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhReportJsondata record);

	int updateByPrimaryKey(PhReportJsondata record);
	
	List<PhReportJsondata> query(PhReportJsondata record);
	
	int queryCount(PhReportJsondata record);

}
