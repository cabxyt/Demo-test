package com.play.phemp.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phemp.dao.entity.PhExam;

@Mapper
public interface PhExamMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhExam record);

    int insertSelective(PhExam record);

    PhExam selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhExam record);

    int updateByPrimaryKey(PhExam record);
    
    List<PhExam> query(PhExam record);
    
    List<PhExam> queryCount(PhExam record);
}