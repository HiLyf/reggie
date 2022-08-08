package com.itheima.reggie.dto;

import java.util.List;

import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.entity.SetmealDish;

import lombok.Data;

@Data
public class SetmealDto extends Setmeal {

	private static final long serialVersionUID = 1L;

	private List<SetmealDish> setmealDishes;

	private String categoryName;
}
