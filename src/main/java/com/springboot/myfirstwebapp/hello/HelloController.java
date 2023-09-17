package com.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayhello() {
		return "Hello! What are you doing?";
	}
	
//	@RequestMapping("say-hello-html")
//	@ResponseBody
//	public String sayhellohtml() {
//		StringBuffer sb = new StringBuffer();
//		sb.append("<html>");
//		sb.append("<head>");
//		sb.append("<title>My First html</title>");
//		sb.append("</head>");
//		sb.append("<body>");
//		sb.append("<body>");
//		sb.append("<body>");
//		sb.append("<body>");
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
		
		
		///src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	
	
}
