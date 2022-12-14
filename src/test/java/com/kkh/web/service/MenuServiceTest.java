package com.kkh.web.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MenuServiceTest {
	
	@Autowired
	private MenuService service;

	@Test
	void testGetList() {
		System.out.println(service.getList());
	}

}
