package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhExam;
import com.play.phedb.service.PhExamService;

@RestController
@RequestMapping(value = "/phExam")
public class PhExamController {
	@Autowired
	PhExamService phExamService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhExam record) {
		List<PhExam> list = phExamService.query(record);
		int totalCount = phExamService.queryCount(record);
		return new Pager<PhExam>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhExam record) {
		return phExamService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhExam record) {
		return phExamService.updateByPrimaryKeySelective(record);
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
