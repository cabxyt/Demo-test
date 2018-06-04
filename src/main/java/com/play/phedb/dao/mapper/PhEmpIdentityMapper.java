package com.play.phedb.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.play.phedb.dao.entity.PhEmpIdentity;

@Mapper
public interface PhEmpIdentityMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhEmpIdentity record);

    int insertSelective(PhEmpIdentity record);

    PhEmpIdentity selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhEmpIdentity record);

    int updateByPrimaryKey(PhEmpIdentity record);
    
    List<PhEmpIdentity> query(PhEmpIdentity record);
    
    int queryCount(PhEmpIdentity record);
}