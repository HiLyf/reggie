package com.itheima.reggie.dto;

import java.util.ArrayList;
import java.util.List;

import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;

import lombok.Data;

@Data
public class DishDto extends Dish {

	private static final long serialVersionUID = 1L;

	// 菜品对应的口味数据
	private List<DishFlavor> flavors = new ArrayList<>();

	private String categoryName;

	private Integer copies;
}
