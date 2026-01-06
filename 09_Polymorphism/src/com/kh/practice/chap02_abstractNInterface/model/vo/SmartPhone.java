package com.kh.practice.chap02_abstractNInterface.model.vo;


public  abstract class SmartPhone implements CellPhone,TouchDisplay  {

	private String maker;
	
	public SmartPhone() {
		
	}
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}
	public abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
}
