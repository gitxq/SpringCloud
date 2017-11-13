package com.caicongyang.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = ResumeClientHystrix.class)
public interface ResumeClientService {

	/**
	 * name:远程服务名，及spring.application.name配置的名称
	 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
	 * @param name
	 * @return
	 */
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name);
}
