package com.xu.test;


import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TestController {
	@Autowired
	private Ke01Service service;
	@RequestMapping("/test")
	
	public Map<String,Object> getTest() {

		return service.findAll();
	}
}
