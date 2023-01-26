package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String Test()
	{
		int a = 6;
		int b = 89;
		return "this is just testing sum of a and b is " + (a+b);
	}
}
