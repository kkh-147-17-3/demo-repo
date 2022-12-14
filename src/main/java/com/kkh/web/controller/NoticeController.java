package com.kkh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// 해당 클래스에 url mapping 내용이 있음을 명시
//RestController라는 의미는, restful로 해당 클래스의 반환값이 그대로 return됨을 의미함.
//Controller로 하면 무조건 view에 해당하는 문서를 찾음
@Controller
@RequestMapping("/notice")
public class NoticeController {
	@GetMapping("/list")
	public String list(Model model) {
		//출력 문자열이 아니라, 출력 문서를 의미하는 것을 알려줘야 함.
		//template 폴더에서 notice라는 폴더를 찾고, 거기서 list.html를 탐색함
		
		return "/notice/list";
	}
	
	@ResponseBody // RestController로 한 것 처럼 해당 메소드의 return 값이 http response message body 안에 삽입된다.
	@RequestMapping("/detail")
	public String detail() {
		return "공지 내용 출력";
	}
}
