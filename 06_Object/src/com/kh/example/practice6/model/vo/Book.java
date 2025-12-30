package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher ;
	private String author;
	private int price;
	private double discountRate;
	
	public Book(){
		
	}
	public Book(String title,String publisher,String author ){
		this.title=title;
		this.publisher=publisher;
		this.author= author;
	}
	public Book(String title,String publisher,String author,int price, double discountRate) {
		this(title,publisher,author);
		this.price= price;
		this.discountRate=discountRate;
		
	}
	public void inform() {
		System.out.println( title+publisher+author+price+discountRate);
	}
	
	/*public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public String getPublisher(){
		return publisher;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int */
}
