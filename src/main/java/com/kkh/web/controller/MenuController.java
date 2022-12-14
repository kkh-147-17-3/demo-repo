package com.kkh.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kkh.web.service.MenuService;


// 해당 클래스에 url mapping 내용이 있음을 명시
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	
	
	
	
//	public MenuController() {
//		this(null);
//	}
//	
//	public MenuController(MenuService service) {
//		super();
//		this.service = service;
//	}
//
//	@GetMapping("addList")
//	public String addList(Model model) {
//		service.insert();
//		model.addAttribute("data", "hello");
//		return "menu/list";
//	}

	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("data", "hello");
		return "menu/list";
	}
	
	@GetMapping("detail")
	public String detail(Model model) {
		return "menu/detail";
	}

	// IoC Container에 1개만 있는 경우 별도의 configuration 없이 알아서 주입해줌
	// setter injection 방법
	public void setService(MenuService service) {
		this.service = service;
	}
}
