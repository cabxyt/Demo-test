package com.play.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.play.entity.PhEmpIdentity;
import com.play.mapper.PhEmpIdentityMapper;

@RestController
public class TestController {
	@Autowired
	PhEmpIdentityMapper ph;

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		PhEmpIdentity record = new PhEmpIdentity();
		record.setEmpId((long) (Math.random() * 1000000000));
		record.setUniquNo((long) (Math.random() * 1000000000));
		record.setIdType((short) 5);
		record.setIdCode((long) (Math.random() * 1000000000) + "");
		record.setMobile((long) (Math.random() * 1000000000) + "");
		record.setEmail((long) (Math.random() * 1000000000) + "");
		ph.insert(record);
		return "helloWorld";
	}

	@RequestMapping("/getjson")
	public PhEmpIdentity getjson() {
		PhEmpIdentity record = new PhEmpIdentity();
		record.setEmpId((long) (Math.random() * 1000000000));
		record.setUniquNo((long) (Math.random() * 1000000000));
		record.setIdType((short) 5);
		record.setIdCode((long) (Math.random() * 1000000000) + "");
		record.setMobile((long) (Math.random() * 1000000000) + "");
		record.setEmail((long) (Math.random() * 1000000000) + "");
		ph.insert(record);
		return record;
	}

	@RequestMapping("/postjson")
	public PhEmpIdentity postjson(@RequestBody PhEmpIdentity param) {
		PhEmpIdentity record = param;

		ph.insert(record);
		return param;
	}

	public static void main(String[] args) {
		System.out.println((long) (Math.random() * 1000000000));
	}
}
