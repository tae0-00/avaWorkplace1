package com.kh.chap03_class.model.vo;

public class Person {
	//필드앞에 접근제한자 표시 있음
	//-는 private +는 public 
	private String id;
	private String pwd;
	private String name;
	private int age; 
	private char gender; 
	private String phone;
	private String email;
	
	public void ChangrName(String name) {
		 this.name= name;
	}
	public void printName() {
		System.out.println(this.name); 
	}
}
