package com.play.phedb.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phedb.dao.entity.PhDictItem;

@Mapper
public interface PhDictItemMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhDictItem record);

    int insertSelective(PhDictItem record);

    PhDictItem selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhDictItem record);

    int updateByPrimaryKey(PhDictItem record);
    
    List<PhDictItem> query(PhDictItem record);
    
    int queryCount(PhDictItem record);
}