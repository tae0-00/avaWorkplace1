package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;

public class LibraryMenu {
	
	private LibraryController  lc = new LibraryController ();
	private Scanner sc = new Scanner(System.in);
	
	public LibraryMenu() {
		
	}
	public void mainMenu() {
		while(true) {
			System.out.println("===메뉴===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 :");
			int num =sc.nextInt();
			
			switch(num) {
			case 1 : 
				lc.myInfo();
				break;
			case 2 : 
				selectAll();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
				rentBook();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			}
		}
	}
	public void selectAll() {
		
		Book [] bList = lc.selectAll();
		//for(Book b :bList) {
		//	System.out.println(b);
		for(int i=0; i<bList.length; i++) {
				System.out.println(i+"번의 도서 :"+ bList[i]);
			}
		}
	
	public void searchBook() {
	
		System.out.println("검색할 제목 키어드 ");
		String keyword= sc.next();
		lc.searchBook();
		
		Book [] 
		
	}
	public void rentBook() {
	
	}
}
