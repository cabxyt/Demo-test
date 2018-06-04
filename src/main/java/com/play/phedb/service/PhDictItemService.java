package com.play.phedb.service;

import java.util.List;
import com.play.phedb.dao.entity.PhDictItem;

public interface PhDictItemService {
	int deleteByPrimaryKey(Long key);

	int insert(PhDictItem record);

	int insertSelective(PhDictItem record);

	PhDictItem selectByPrimaryKey(Long key);

	int updateByPrimaryKeySelective(PhDictItem record);

	int updateByPrimaryKey(PhDictItem record);
	
	List<PhDictItem> query(PhDictItem record);
	
	int queryCount(PhDictItem record);

}
