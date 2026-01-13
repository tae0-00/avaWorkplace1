package com.kh.practice.set.view;

import java.util.Scanner;
import java.util.Set;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc= new Scanner(System.in);
	private LotteryController lc= new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("****메인메뉴****");
			System.out.println("1.추첨대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println("메뉴번호 : ");
			int menu = sc.nextInt();
			
			
			switch(menu) {
			case 1:
				 insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력");
			}
		}
	}
	public void insertObject() {
		System.out.println("추가할 수");
		int addnum=sc.nextInt();
		
		for(int i=0; i<addnum; i++) {// 반복문 돌려줘야함
			System.out.println("추첨자이름: ");
			String name = sc.next();
			
			System.out.println("추첨자번호(-)빼고 : ");
			String phonenum = sc.next();
			
			Lottery l= new Lottery( name, phonenum );
			boolean b =lc.insertObject(l);
			if(b) {
				System.out.println("추가 완료");
			}else {
				System.out.println("중복대상입니다. 다시 입력하세요");
				i--;
			}
		}
	}
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름:");
		String name = sc.next();
		
		System.out.println("삭제할 대상 전화번호 (-)빼고 : ");
		String phonenum = sc.next();
		
		Lottery l= new Lottery(name, phonenum);
		boolean b= lc.deleteObject(l);
		if(b) {
			System.out.println("삭제완료함");
		}else {
			System.out.println("존재하지 않는 대상");
		}
	}
	public void winObject() {
		Set o=lc.winObject();//Object로 하면 안돼?
		System.out.println(o);
	}
	public void sortedWinObject() {
		Object o= lc.sortedWinObject();
		System.out.println(o);
	}
	public void searchWinner() {
		System.out.println("검색 대상자 이름: ");
		String name = sc.next();
		
		System.out.println("검색 대상자전화번호(-)빼고 : ");
		String phonenum = sc.next();
		
		Lottery l=new Lottery(name,phonenum);
		boolean b=lc.searchWinner(l);
		
		if(b) {
			System.out.println("축하합니다 당첨목록에 있습니다");
		}else {
			System.out.println("당첨목록에 없습니다. ");
		}
	}

}
