package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		
	}
	
	public void imformation() {
		System.out.println(pName+" ,"+price + ","+ brand);
	}
	
}
