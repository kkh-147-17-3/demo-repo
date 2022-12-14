package com.kkh.web.dao;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.kkh.web.entity.Menu;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuDaoTest2 {
	
	@Autowired
	MenuDao menuDao;
	
	
	@Test
	void testGetList() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testCount() {
		fail("Not yet implemented");
	}

	@Test
	void testInsert() {
		Menu menu = new Menu();
		menu.setId(3);
		menu.setImg("/hello.png");
		menu.setName("카페 아메리치노");
		menu.setPrice(10000);
		menuDao.update(menu);
		menuDao.get(3);
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
