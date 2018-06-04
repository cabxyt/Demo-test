package com.play.phedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.play.phedb.dao.entity.PhDictItem;
import com.play.phedb.dao.mapper.PhDictItemMapper;
import com.play.phedb.service.PhDictItemService;

@Service
public class PhDictItemServiceImpl implements PhDictItemService {
	@Autowired
	PhDictItemMapper phDictItemMapper;

	@Override
	public int deleteByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phDictItemMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.insert(record);
	}

	@Override
	public int insertSelective(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.insertSelective(record);
	}

	@Override
	public PhDictItem selectByPrimaryKey(Long key) {
		// TODO Auto-generated method stub
		return phDictItemMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<PhDictItem> query(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.query(record);
	}
	@Override
	public int queryCount(PhDictItem record) {
		// TODO Auto-generated method stub
		return phDictItemMapper.queryCount(record);
	}
}
