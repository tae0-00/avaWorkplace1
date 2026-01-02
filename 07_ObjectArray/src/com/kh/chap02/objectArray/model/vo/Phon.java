package com.kh.chap02.objectArray.model.vo;

public class Phon {
	private String name; 
	private String  serises; 
	private String   brand; 
	private int price;
	
	public Phon() {
		
	}
	


	public Phon( String name,String  serises,String   brand,int price) {
		this.name=name;
		this.serises=serises;
		this.price=price;
		this.serises=serises;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSerises() {
		return serises;
	}



	public void setSerises(String serises) {
		this.serises = serises;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	//public imformation() {
		
	//}
}
