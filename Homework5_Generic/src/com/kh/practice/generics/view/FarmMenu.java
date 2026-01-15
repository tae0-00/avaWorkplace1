package com.kh.practice.generics.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu extends Farm {

	private Scanner sc= new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		while(true) {
			System.out.println("******메인메뉴 ********");
		}
		
		
	}
	public void adminMenu() {
		
	}
	public void customerMenu() {
		
	}
	public void addNewKind() {
		System.out.println(" 메뉴번호 입력");
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 :");
		int menu = sc.nextInt();
		
		Farm re=null;
		int acount =0;
		switch(menu) {
		case 1:
			System.out.println("이름 :");
			String name1 = sc.next();
			System.out.println("수량 : ");
			acount=sc.nextInt();
			
			re= new Fruit ("과일",name1);
			break;
		case 2:
			System.out.println("이름 :");
			String name2 = sc.next();
			System.out.println("수량 : ");
			acount=sc.nextInt();
			re= new Vegetable("채소", name2);
			break;
		case 3:
			System.out.println("이름 :");
			String name3 = sc.next();
			System.out.println("수량 : ");
			acount=sc.nextInt();
			re = new Nut("견과", name3);
			break;
			default : 
				System.out.println("잘못입력했습니다. 다시입력해주세요");
				return;
			
		}
		
		boolean b= fc.addNewKind(re, acount);
		if(!b) {
			System.out.println("새 농산물추가에 실패함 다시 입력하세요");
			return;
		}else {
			System.out.println("새농산물 추가함");
		}
	
	}
	public void removeKind() {
		
	}
	public void changeAmount() {
		
	}
	public void printFarm() {
		
		HashMap<Farm, Integer> map =fc.printFarm();
		for(Farm s: map.keySet()) {
			System.out.println(s.getKind());
		}
	}
	public void buyFarm() {
		
	}
	public void mainMremoveFarm() {
		
	}
	public void printBuyFarm() {
		
	}
}
