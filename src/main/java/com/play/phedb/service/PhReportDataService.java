package com.play.phedb.service;

import java.util.List;
import com.play.phedb.dao.entity.PhReportData;

public interface PhReportDataService {
	int deleteByPrimaryKey(Long key);

	int insert(PhReportData record);

	int insertSelective(PhReportData record);

	PhReportData selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhReportData record);

	int updateByPrimaryKey(PhReportData record);
	
	List<PhReportData> query(PhReportData record);
	
	int queryCount(PhReportData record);

}
