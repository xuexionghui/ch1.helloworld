package com.bee.sample.ch1.controller;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration    //这是一个配置类
public class JacksonConf {
    @Bean   //将这个方法注入到容器中
	public ObjectMapper  getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectMapper setDateFormat = objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		return objectMapper;
	}
}
