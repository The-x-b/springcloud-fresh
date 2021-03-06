package com.ac.fresh.user;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
@MapperScan("com.yc.fresh.user.mapper")
@SpringBootApplication
@EnableEurekaClient  //将应用注册到eureka服务器
@EnableRedisHttpSession //将session缓存到redis

public class FreshUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreshUserApplication.class, args);
	}
}
