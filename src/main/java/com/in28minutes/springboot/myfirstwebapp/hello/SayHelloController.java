package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller     // building here is a web UI-related component, something which handles request these are called controllers
public class SayHelloController {
    
    //"say-hello" => "Hello! What are you learning today?"	
	
	// http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody    // if we wont write this annotation then it will throw error as when you return String String back it will be looking for something called view for a specific name (Spring MVC work)
	                 // and it will return whatever is returned by this msg as is to the browser
	public String sayHello() {
		return "Hello! What are you learning today?"; 
	}
	
	@RequestMapping("say-hello-html")
	//@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML Page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
		
		//this is very complex to add html so we will go for 'views'
		//Popular view- JSP(Java Server Pages)
	}
	
	// we will create sayHello.jsp folder for that we have to create the structure 
	// /src/main/resousayrces/META-INF/resources/WEB_INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
