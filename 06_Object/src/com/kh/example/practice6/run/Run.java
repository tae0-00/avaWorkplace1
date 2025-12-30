package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book b = new Book();
		b.inform();
		
		Book b1 = new Book("gkgk","gkkgk","ffjd");
		b1.inform();
		
		Book b2 = new Book("자바","안녕","처음",2000,20.0);
		b2.inform();
	}
}
