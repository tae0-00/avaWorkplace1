package com.kh.example.practice4.model.vo;

public class Student {

	private static final int  grade; 
	static {
		grade=3;
	}
	private int classroom;{
		classroom=1;
	}
	private String name; {
		name="김태경";
	}
	private double height;{
		height=155;
	}
	private char gender; {
		gender='W';
	}
	
	public Student() {
		
	}
	//한번에 해도 됨 
	//{classroom=1;
//	name="김태경";
	//height=155;
	//gender='W';
//}
	public void imformation() {
		
		System.out.println(grade+"학년" +classroom +"반"+ name +height+"cm"+ gender);
	}
	
}
