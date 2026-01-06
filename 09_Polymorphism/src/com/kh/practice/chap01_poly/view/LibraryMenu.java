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
			default : 
				System.out.println("잘못입력하셨습니다. ");
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
	
		//여기서 검색 결과 는 코드 만들어야 함
		
		System.out.println("검색할 제목 키어드 ");
		String keyword= sc.next();
		Book [] searchList = lc.searchBook(keyword);//이부분이 넘기는 건데 얘는 배열을 맞춰줌 
		for(int i=0; i<searchList.length; i++) {
			System.out.println(searchList[i]);
			}
		}
		//이건 배열 출력이 안되겠지??그래서 포문 사용해야하는데
		
		
		
	
	public void rentBook() {
	
		selectAll();
		System.out.println("대여할 도서 번호 선택 :");
		int index = sc.nextInt();
		int result = lc.rentBook(index);// 이부분이 넘기는거
		
		switch(result) {
		case 0 : 
			System.out.println("성공적으로 대여되었습니다");
		    break;
		case 1 : 
			System.out.println("나이 제한으로 대여 불가능 합니다.");
			break;
		case 2 : 
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이 페이지에서 확인하세요  ");
			return;//여기는 브레이크가 맞다??
		default : 
			System.out.println("잘못입력하셨습니다. ");
		}
		
	}
}
