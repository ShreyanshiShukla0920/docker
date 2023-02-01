package com.dockertest.DockerTest.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public Map<String,Object> getValues(){
		Map<String,Object> map = new HashMap<>();
		map.put("Java Collections",Arrays.asList("Java","Python") );
		map.put("code", 233);
		return map;
		
		
	}

}
