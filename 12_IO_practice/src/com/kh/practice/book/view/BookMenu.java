package com.kh.practice.book.view;

import java.awt.print.Book;
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
			
		}
	}
	public void fileRead() {
		bc.fileRead();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));){
			System.out.println(ois.readUTF()+
					ois.readUTF()+ois.readInt()+ois.read);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

