package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhReportData;
import com.play.phedb.service.PhReportDataService;

@RestController
@RequestMapping(value = "/phReportData")
public class PhReportDataController {
	@Autowired
	PhReportDataService phReportDataService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhReportData record) {
		List<PhReportData> list = phReportDataService.query(record);
		int totalCount = phReportDataService.queryCount(record);
		return new Pager<PhReportData>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhReportData record) {
		return phReportDataService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhReportData record) {
		return phReportDataService.updateByPrimaryKeySelective(record);
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
