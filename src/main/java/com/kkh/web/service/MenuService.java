package com.kkh.web.service;

import java.util.List;

import com.kkh.web.entity.Menu;

public interface MenuService {
	public List<Menu> getList();
	public int addToBasket(int id);
	public Menu get();
	public int count();
	public int insert();
	public int update();
	
	void testTs();
	
	
}
