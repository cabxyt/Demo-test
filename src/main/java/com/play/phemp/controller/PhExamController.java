package com.play.phemp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.phemp.dao.entity.PhExam;
import com.play.phemp.service.PhExamService;

@RestController
@RequestMapping(value = "/phExam")
public class PhExamController {
	@Autowired
	PhExamService phExamService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhExam record) {
		return phExamService.query(record);
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
