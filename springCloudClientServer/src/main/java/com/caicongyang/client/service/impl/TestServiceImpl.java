package com.caicongyang.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caicongyang.client.ResumeClientService;
import com.caicongyang.client.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private ResumeClientService resumeClientService;
	
	@Override
	public String test(String test) {
		return resumeClientService.hello(test);
	}

}
