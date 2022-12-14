package com.kkh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 해당 클래스에 url mapping 내용이 있음을 명시
@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
