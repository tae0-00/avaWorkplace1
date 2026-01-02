package com.kh.chap02.override.model.vo;

public class Book {
	private String title; 
	private String  author; 
	private int  price;
	
	public Book() {
		
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//메서드 오버라이딩 
	/*
	 * 오버라이딩
	 * -상속받고 있는 부모클래스의 메서드를 자식클래스에 재정의하는것
	 * -부모가 재공하고 있는 매서드르 자식이 일부분 고쳐사용하갰다는 의미이며 자식클래스가 우선권을 가짐
	 * 
	 * 성립조건
	 * -부모메서드의 메서드명과 동일해야한다.
	 * -매개변수의 자료형 갯수 순서도 모두 동일해야한다 
	 * -반환형도 동일해야한다. 
	 * -부모메서드의 접급제한자보다 공유범위가 더 크거나 같아야한다. 
	 * 
	 * 오버라이딩@override 어노테이션
	 * -생략가능
	 * -잘못된 조건으로 오버라이딩 한 경우 오류를 통해 잘못됨을 알게 하기 위해서
	 * - 이 메서드가 오버라이딩된 메서드라는걸 알리는 목적으로 사용한다. 
	 * 
	 * 
	 */
	@override
	public String toString() {
		return title+","+author+","+price;
	}

}
