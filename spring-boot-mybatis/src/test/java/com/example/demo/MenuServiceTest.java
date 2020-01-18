package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Menu;
import com.example.demo.service.MenuService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuServiceTest {

	@Autowired
	private MenuService service;
	
	@Test
	public void select() throws JsonProcessingException {
		Menu menu = this.service.getMenu(1, 3);
		assertThat(menu).isNotNull();
		System.out.println(new ObjectMapper().writeValueAsString(menu));
	}
}
