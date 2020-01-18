package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.MenuMapper;
import com.example.demo.model.Menu;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class MenuService {

	private final MenuMapper mapper;
	
	public Menu getMenu(int pid, int depth) {
		Menu menu = this.mapper.select(pid);
		if(menu.getDepth().intValue() < depth) {
			menu.getChild().forEach(m -> {
				m.setChild(getMenu(m.getId(), depth).getChild());
			});
		}
		return menu;
	}
}
