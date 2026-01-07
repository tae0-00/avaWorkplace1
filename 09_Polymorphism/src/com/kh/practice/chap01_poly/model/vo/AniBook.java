package com.kh.practice.chap01_poly.model.vo;
//실선은 익스펜드 점선은 인플리
public class AniBook extends Book {
	private int accessAge ;
	public AniBook() {
		
	}
	public AniBook(String title, String author, String publisher,int accessAge) {
		super(title, author, publisher);
		this.accessAge=accessAge;
		
		
	}
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		return  super.toString() + accessAge +  " ";
	}

	
}
