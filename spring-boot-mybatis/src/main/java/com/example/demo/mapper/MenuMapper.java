package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Menu;

@Mapper
public interface MenuMapper {

	Menu select(int pid);
}
