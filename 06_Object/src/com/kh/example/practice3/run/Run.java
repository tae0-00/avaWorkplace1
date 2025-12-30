package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {

		Circle cr = new Circle();
		cr.getAreaOfCircle();
		cr.getSizeOfCircle();
		
		cr.incrementRadius();
		
		cr.getAreaOfCircle();
		cr.getSizeOfCircle();
	}

}
