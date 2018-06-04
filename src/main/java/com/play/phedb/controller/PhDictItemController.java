package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhDictItem;
import com.play.phedb.service.PhDictItemService;

@RestController
@RequestMapping(value = "/phDictItem")
public class PhDictItemController {
	@Autowired
	PhDictItemService phDictItemService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhDictItem record) {
		List<PhDictItem> list = phDictItemService.query(record);
		int totalCount = phDictItemService.queryCount(record);
		return new Pager<PhDictItem>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhDictItem record) {
		return phDictItemService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhDictItem record) {
		return phDictItemService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping(method = { RequestMethod.PATCH })
	public String patch() {
		return "patch";
	}

	@RequestMapping(method = { RequestMethod.DELETE })
	public Object delete() {
		return "delete";
	}
}
