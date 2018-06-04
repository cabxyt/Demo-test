package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhReportJsondata;
import com.play.phedb.service.PhReportJsondataService;

@RestController
@RequestMapping(value = "/phReportJsondata")
public class PhReportJsondataController {
	@Autowired
	PhReportJsondataService phReportJsondataService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhReportJsondata record) {
		List<PhReportJsondata> list = phReportJsondataService.query(record);
		int totalCount = phReportJsondataService.queryCount(record);
		return new Pager<PhReportJsondata>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhReportJsondata record) {
		return phReportJsondataService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhReportJsondata record) {
		return phReportJsondataService.updateByPrimaryKeySelective(record);
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
