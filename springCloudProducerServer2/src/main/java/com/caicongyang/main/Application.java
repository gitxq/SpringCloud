package com.caicongyang.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring could ptoducerServer程序主入口(提供服务)
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value={"com.caicongyang"})//组件扫描
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
