package com.kkh.web.dao;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuDaoTest {

	@Autowired
	private MenuDao menuDao;
	
	
	@Test
	void testGetList() {
//		System.out.println(menuDao);
		System.out.println(menuDao.getList(0,30, null, null));
		//fail("Not yet implemented");
	}

}
