package com.play.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.play.entity.PhEmpIdentity;
@Mapper
public interface PhEmpIdentityMapper {
    int deleteByPrimaryKey(Long empId);

    int insert(PhEmpIdentity record);

    int insertSelective(PhEmpIdentity record);

    PhEmpIdentity selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(PhEmpIdentity record);

    int updateByPrimaryKey(PhEmpIdentity record);
}