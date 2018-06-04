package com.play.phedb.service;

import java.util.List;
import com.play.phedb.dao.entity.PhReportLogheresult;

public interface PhReportLogheresultService {
	int deleteByPrimaryKey(Long key);

	int insert(PhReportLogheresult record);

	int insertSelective(PhReportLogheresult record);

	PhReportLogheresult selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhReportLogheresult record);

	int updateByPrimaryKey(PhReportLogheresult record);
	
	List<PhReportLogheresult> query(PhReportLogheresult record);
	
	int queryCount(PhReportLogheresult record);

}
