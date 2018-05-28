package com.play.phemp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.phemp.dao.entity.PhEmpIdentity;
import com.play.phemp.dao.entity.PhExam;
import com.play.phemp.service.PhEmpService;
import com.play.phemp.service.PhExamService;

@RestController
@RequestMapping(value = "/phexam")
public class TestController {
	@Autowired
	PhExamService phExamService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhExam record) {
		return phExamService.query(record);
	}

	@RequestMapping(method = { RequestMethod.POST })
	public String post() {
		return "post";
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public String put() {
		return "put";
	}

	@RequestMapping(method = { RequestMethod.PATCH })
	public String patch() {
		return "patch";
	}

	@RequestMapping(method = { RequestMethod.DELETE })
	public String delete() {
		return "delete";
	}
}