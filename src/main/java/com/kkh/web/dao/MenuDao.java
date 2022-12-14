package com.kkh.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.kkh.web.entity.Menu;

// IoC Container에 인터페이스를 담음

@Mapper
public interface MenuDao {

	/* 
	 * #{data} 또는 ${data}
	 * #{data} 는 알아서 문자열인지 아닌지 확인해줌
	 * 만약 title ="hello" 인 경우 SELECT * FROM Menu WHERE title LIKE 'hello'
	 * ${data} 는 안의 값이 그대로 들어감
	 * 위의 경우 SELECT * FROM Menu WHERE title LIKE hello (오류발생할 수 있음)
	 * 그러나 사용하는 경우가 자주 있음 (아래의 LIKE와 같이)
	 * @Select("SELECT * FROM Menu where name LIKE '%${name}%'")
	 * Query를 template에 .xml 파일로 별도로 저정하는 것이 좋을 수 있음
	 * src/main/resources 는 기본적으로 노출되지 않고, public과 static만 노출되기 때문에 resources 폴더 안에
	 * 저장하는 것이 좋음.
	 */
	
	List<Menu> getList(
					int offset, int size,
					String field,
					String query);
		
	Menu get(int id);
	
	int count(String query);
	
	int insert(Menu menu);
	int update(Menu menu);
	int updateAll(Menu[] menus);
	
	int delete(int id);
	
	int deleteAll(int[] ids);
}
