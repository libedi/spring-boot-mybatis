package com.example.demo.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Menu;

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MemuMapperTest {

	@Autowired
	private MenuMapper mapper;
	
	@Test
	public void select() {
		// given
		Integer pid = 1;
		
		// when
		Menu menu = this.mapper.select(pid);
		
		// then
		assertThat(menu).isNotNull();
		assertThat(menu.getId()).isEqualTo(pid);
		assertThat(menu.getChild()).isNotEmpty();
	}
}
