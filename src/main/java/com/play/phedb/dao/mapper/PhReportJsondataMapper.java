package com.play.phedb.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phedb.dao.entity.PhReportJsondata;

@Mapper
public interface PhReportJsondataMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhReportJsondata record);

    int insertSelective(PhReportJsondata record);

    PhReportJsondata selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhReportJsondata record);

    int updateByPrimaryKey(PhReportJsondata record);
    
    List<PhReportJsondata> query(PhReportJsondata record);
    
    int queryCount(PhReportJsondata record);
}