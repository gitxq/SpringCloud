package com.caicongyang.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 实现断路器功能
 * *注意：实现断路器时一直不起作用，后来在application.properties中加入feign.hystrix.enabled=true打开断路器，但是官方文档中貌似说默认是打开的...
 * @author data
 */
@Component
public class ResumeClientHystrix implements ResumeClientService {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "服务器跑路了，请稍等";
	}

}
