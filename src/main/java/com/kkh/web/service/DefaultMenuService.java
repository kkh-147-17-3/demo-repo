package com.kkh.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.kkh.web.dao.MenuDao;
import com.kkh.web.entity.Menu;

@Service
public class DefaultMenuService implements MenuService {

	@Autowired
	private MenuDao menuDao;

	public DefaultMenuService() {
		this(null);
	}
	
	public DefaultMenuService(MenuDao menuDao) {
		super();
		this.menuDao = menuDao;
	}
	
	@Autowired
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}



	@Override
	public List<Menu> getList() {
		List<Menu> list = menuDao.getList(0,10,null,null);
		System.out.println(list);

		return list;
	}
	
	@Override
	public Menu get() {
		Menu menu = menuDao.get(4);
		System.out.println(menu.toString());
		return menu;
	}

	@Override
	public int addToBasket(int id) {

		return 0;
	}

	@Override
	public int count() {
		int result = menuDao.count("오");
		System.out.println(result);
		return result;
	}

	@Override
	public int insert() {
		Menu menu = new Menu(0, "샤케라토", 7000, "");
		menuDao.insert(menu);
		System.out.println(menu.toString());
		return 0;
	}
	
	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Transactional(isolation= Isolation.READ_UNCOMMITTED)
	@Override
	public void testTs() {
		Menu menu = menuDao.get(42);
		menu.setId(3);
		menu.setPrice(menu.getPrice() - 500);
		menuDao.update(menu);
		menu.setPrice(menu.getPrice() - 100500);
		menuDao.update(menu);
	}
}
