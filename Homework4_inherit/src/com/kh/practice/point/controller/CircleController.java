package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();
	
	public CircleController() {
		
	}
	public String calcArea(int x, int y,int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area= (Math.PI)*radius*radius;
		
		return c.toString() +"/"+ area;
	}
	public String calcCircum(int x, int y, int radius ) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		//매개변수 
		//c= new Circle(x,y,radius);//필드최기화 
		
		double circum =(Math.PI)*radius*2;
		
		return c.toString()+"/ "+ circum;
	}
}
