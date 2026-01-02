package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class objectRun {

	public static void main(String[] args) {

		//객체배열이 없이 코딩
		//1. setter초기화
		
		Book bk1= new Book();
		
		bk1.setTitle("c언어");
		bk1.setAuthor("민경민");
		bk1.setPrice(2500);
		bk1.setPublisher("이지스");
				
		//2.매개변수 생성자로 객체 생성 및 초기화 
		Book bk2= new Book("자바", "김태경 ",21000,"이지스");//표현력이 부족하지만 짧음 
		
		//3. 매개변수 생성자로 객체 생성 및 초기화 
		Book bk3= new Book("원피스","오다",1000,"이지스");
		
		//도서정보 출력서비스 
		for(int i=0; i<3; i++) {
			if(i==0) {
				System.out.println(bk1.imformation());
			}
			else if(i==1) {
				System.out.println(bk2.imformation());	
			}
			else if(i==2) {
				System.out.println(bk3.imformation());
		}
	}
		
		//객체만 있는 상테에선 작어비 비효율 배열에 넣어서 관리해줘애 한다.
		Book[]arr= new Book[3];//null null null
		    arr[0]=bk1;
			arr[1]=bk2;
			arr[3]=bk3;
			
		//배열을 통해 도서정보 출력 서비스
			for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].imformation());
			}
			//사용자에게 검색할 도서 목록을 입력받아 전체 도서중 일치하는 제목찾기 
			Scanner sc =new Scanner(System.in);
			System.out.print("검색제목");
			String searTitle = sc.next();
			
			
		//객체배열 사용 . 반복문 사용
			for(int i=0; i<arr.length; i++) {
				Book bk =arr[i];//따로 변수 만들기
				if(searTitle.equals(bk.getTitle())) {
					System.out.println(bk.imformation());
				}
			}
	}	
	
}
