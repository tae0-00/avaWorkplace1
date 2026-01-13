package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.List;
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
		System.out.print("도서명 입력");
		String title = sc.nextLine();
		
		System.out.print("저자명 입력");
		String author = sc.nextLine();
		
		System.out.print("3. 장르 번호 입력 : (1.인문 / 2.자연과학 / 3.의료 / 4.기타) ");
		int category = sc.nextInt(); 
//		//스위치문을 활용햐야함?
//		switch(category) {
//		case 1: 
//			category=Integer.parseInt("인문");
//			break;
//		case 2 :
//			category=Integer.parseInt("2자연과학");
//			break;
//		case 3: 
//			category=Integer.parseInt("3.의료");
//			break;
//		case 4: 
//			category= Integer.parseInt("4.기타");
//			break;
//		default : 
//			System.out.println("잘못입력");
//		}
//		
		System.out.print("4. 가격 입력");
		int price = sc.nextInt();
		sc.nextLine();
		String [] arr= {"인문","자연과학","의료","기타"};
		Book b =new Book(title, author, arr[category-1], price);
		bc.insertBook(b);
		
	}
	public void selectList() {
	List <Book> bookList= bc.selectList();//그냥 대입하는거임 
	//ArratList<Book> bookList = bc.selectList(); 같은건가?
	if(bookList.isEmpty()) {
		System.out.println("존재하는 도서 없음");
	}else {
		for(Book b : bookList) {//이제 향상된 포문 사용하자
			System.out.println(b);
			//sc.nextLine(); 왜 여기가 아니라 인트에 하지?
		}
	}
		
	}
	public void searchBook() {
		System.out.println("검색할 도서명 :");
		String keyword = sc.nextLine(); 
		
		List <Book> searchList= bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색결과가 없다");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			
			}
		}
	}
	public void deleteBook() {
		System.out.println("삭제할 도서명 :");
		String title =sc.nextLine();
		System.out.println("삭제할 저자명 :");
		String author =sc.nextLine();
		
		Book br =bc.deleteBook(title, author);
		
		if(br!=null) {
			System.out.println("성공적으로 삭제");
			
		}else {
			System.out.println("삭제할 도서 찾지 못함");
		}
		
	}
	public void ascBook() {
		if(bc.ascBook()==1) {
			System.out.println("정렬에 삭제 성공");
			
		}else {
			System.out.println("정렬에 실패");
		}
	}
}
