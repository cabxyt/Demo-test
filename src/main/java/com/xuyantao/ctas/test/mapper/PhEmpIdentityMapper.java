package com.xuyantao.ctas.test.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.xuyantao.ctas.test.entity.PhEmpIdentity;
@Mapper
public interface PhEmpIdentityMapper {
    int deleteByPrimaryKey(Long empId);

    int insert(PhEmpIdentity record);

    int insertSelective(PhEmpIdentity record);

    PhEmpIdentity selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(PhEmpIdentity record);

    int updateByPrimaryKey(PhEmpIdentity record);
}