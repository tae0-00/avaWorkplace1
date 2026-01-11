package com.kh.practice.book.view;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book [] bArr;
	
	public BookMenu() {
		bc.makeFile();
		
		bArr = bc.fileRead();
	}
	public void mainMenu() {
		while(true) {
		System.out.println(" 1. 도서 추가 저장 :");
		System.out.println("2. 저장 도서 출력 :");
		System.out.println("9. 프로그램 끝내기 :");
		System.out.print("메뉴 번호 ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			fileSave();
			break;
		case 2: 
			fileRead();
			break;
		case 9:
			System.out.println("프로그램 종료");
			return;
		default :
			System.out.println("잘못입력했습니다. 다시 입력해주세요");
			
			}
		}
	}
	public void fileSave() {
		while(true) {
			System.out.println("도서명 :");
			String title= sc.next();
			System.out.println("저자 명 :");
			String author= sc.next();
			System.out.println("도서 가격 : ");
			int price = sc.nextInt();
			
			//SimpleDateFormat cal = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
			System.out.println("출판날짜 (yyyy-mm-dd):");
			String date = sc.next();
			String[] arr = date.split("-");
			int year = Integer.parseInt(arr[0]); // "2025"
			int mon = Integer.parseInt(arr[1]); // "2025"
			int da = Integer.parseInt(arr[2]); // "2025"
			
			Calendar cal = new GregorianCalendar(year , mon, da);
			
			
			System.out.println("할인율 :");
			double discount = sc.nextDouble();
			
			
			Book book = new Book ( title, author, price, cal, discount );	
			
			
			for(int i=0; i<bArr.length; i++) {
				if(bArr[i]==null) {
					bArr[i]=book;
					bc.fileSave(bArr);
					break;
				}
			}
			return;
		}
	}
	public void fileRead() {
		bArr =bc.fileRead();//배열에 값을 넣어야지 그냥 하는건 호출인가?
		for(int i=0; i<bArr.length; i++) {
			System.out.println(bArr[i]);
		}
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

