package com.bee.sample.ch1.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch1.annotation.Function;
/**
 * 访问:http://127.0.0.1:8080/sayhello.html?name=springboot
 * @author xiandafu
 *
 */
@Controller
public class HelloworldController {
	
	
	@RequestMapping("/sayhello.html")
	@Function()
	public @ResponseBody String  say(String name){
		//改动的地方，哈哈哈哈哈哈哈哈哈哈
		String  name1="薛雄辉";
	    Map map = new HashMap();
	    map.put("time", new Date());
	   
		return "hello "+name+name1+map;
	   
	}
	
	
	@RequestMapping("/javaConfig")
	@Function()
	public @ResponseBody Map say2(String name){
		String  name1="薛雄辉";
	    Map map = new HashMap();
	    map.put("time", new Date());
	   
		//return "hello "+name+name1+map;
	    return map;
	}
}
