package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "child")
@JsonInclude(value = Include.NON_EMPTY)
public class Menu {

	private Integer id;
	private Integer pid;
	private String name;
	private Integer depth;
	private Integer seq;
	
	private List<Menu> child;
	
}
