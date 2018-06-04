package com.play.phedb.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phedb.dao.entity.PhReportData;

@Mapper
public interface PhReportDataMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhReportData record);

    int insertSelective(PhReportData record);

    PhReportData selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhReportData record);

    int updateByPrimaryKey(PhReportData record);
    
    List<PhReportData> query(PhReportData record);
    
    int queryCount(PhReportData record);
}