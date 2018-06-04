package com.play.phedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.play.common.Pager;
import com.play.phedb.dao.entity.PhEmpIdentity;
import com.play.phedb.service.PhEmpIdentityService;

@RestController
@RequestMapping(value = "/phEmpIdentity")
public class PhEmpIdentityController {
	@Autowired
	PhEmpIdentityService phEmpIdentityService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object get(PhEmpIdentity record) {
		List<PhEmpIdentity> list = phEmpIdentityService.query(record);
		int totalCount = phEmpIdentityService.queryCount(record);
		return new Pager<PhEmpIdentity>(list, totalCount, record.getLimit(), record.getPage());
	}

	@RequestMapping(method = { RequestMethod.POST })
	public Object post(PhEmpIdentity record) {
		return phEmpIdentityService.insert(record);
	}

	@RequestMapping(method = { RequestMethod.PUT })
	public Object put(PhEmpIdentity record) {
		return phEmpIdentityService.updateByPrimaryKeySelective(record);
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
