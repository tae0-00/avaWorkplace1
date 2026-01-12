package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc= new Scanner(System.in);
	private  BookController bc = new BookController();
	
	public BookMenu (){
		
	}

	public void mainMenu() {
		while(true) {
			System.out.println("*****메인메뉴****");
			System.out.println(" 1. 새 도서 추가  ");
			System.out.println(" 2. 도서 전체 조회 ");
			System.out.println("3. 도서 검색 조회 ");
			System.out.println(" 4. 도서 삭제   ");
			System.out.println(" 5. 도서 명 오름차순 정렬 ");
			System.out.println(" 9. 종료");
			System.out.println(" 메뉴 번호 선택");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력 다시 입력");
			}
		}
	}
	public void insertBook() {
		System.out.println("도서명 입력");
		String title = sc.nextLine();
		
		System.out.println("저자명 입력");
		String author = sc.nextLine();
		
		System.out.println("3. 장르 번호 입력 : (1.인문 / 2.자연과학 / 3.의료 / 4.기타) ");
		int category = sc.nextInt(); 
		
		
		System.out.println("4. 가격 입력");
		int price = sc.nextInt();
		
		
		Book b =bc.insertBook(new Book(title, author, category, price));
		
	}
	public void selectList() {
		
	}
	public void searchBook() {
		
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
}
