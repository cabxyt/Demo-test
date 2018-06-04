package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhReportLogheresult;
import com.play.phedb.service.PhReportLogheresultService;

@RestController
@RequestMapping(value = "/phReportLogheresult")
public class PhReportLogheresultController {
	@Autowired
	PhReportLogheresultService phReportLogheresultService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhReportLogheresult record) {
		List<PhReportLogheresult> list = phReportLogheresultService.query(record);
		int totalCount = phReportLogheresultService.queryCount(record);
		return new Pager<PhReportLogheresult>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhReportLogheresult record) {
		return phReportLogheresultService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhReportLogheresult record) {
		return phReportLogheresultService.updateByPrimaryKeySelective(record);
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
