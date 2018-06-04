package com.play.phedb.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phedb.dao.entity.PhReportLogheresult;

@Mapper
public interface PhReportLogheresultMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhReportLogheresult record);

    int insertSelective(PhReportLogheresult record);

    PhReportLogheresult selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhReportLogheresult record);

    int updateByPrimaryKey(PhReportLogheresult record);
    
    List<PhReportLogheresult> query(PhReportLogheresult record);
    
    int queryCount(PhReportLogheresult record);
}