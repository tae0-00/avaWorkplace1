package com.kh.chap01.oneVsMany.model.vo;

public class Book {

	//도서명,저자명, 가격, 출판사
	private String title; 
	private String author; 
	private  int price;
	private String  publisher;
	
	public Book() {
		
	}
	public Book(String title, String author, int price, String  publisher ) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.publisher=publisher;
	}
	public void setTitle(String title) {//알트 쉬프트 s 게터 세터 
		this.title=title;
	}
	public String getTitle() {
		return title;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	//모든 필드 정보를 하나의 문자열로 합쳐 반환시켜주는 메서드
	public String imformation() {
		return title+","+author+","+price+","+publisher;
	}
}

