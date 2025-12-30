package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape  s = new Shape ();
	
	public double alcPerimeter(double height, double width) {
		s = new Shape(3, height, width);
		return (height + width) * 2;
	}
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		return height*width; 
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "사각형"+s.imformation(); 
	}
}
