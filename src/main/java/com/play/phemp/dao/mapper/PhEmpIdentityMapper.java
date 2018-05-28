package com.play.phemp.dao.mapper;




import org.apache.ibatis.annotations.Mapper;

import com.play.phemp.dao.entity.PhEmpIdentity;
@Mapper
public interface PhEmpIdentityMapper {
    int deleteByPrimaryKey(Long key);

    int insert(PhEmpIdentity record);

    int insertSelective(PhEmpIdentity record);

    PhEmpIdentity selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(PhEmpIdentity record);

    int updateByPrimaryKey(PhEmpIdentity record);
}