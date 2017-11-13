package com.caicongyang.client.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.caicongyang.client.service.TestService;

@RestController
public class IndexController {
	
	@Autowired
	private TestService testService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return testService.test(name);
    }
}