package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

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
		String kind="";
	
		switch(menu) {
		case 1:
			System.out.println("이름 :");
			String name1 = sc.next();
			System.out.println("수량 : ");
			kind ="과일";
			Fruit f= new Fruit(kind,name1);
			break;
		case 2:
			System.out.println("이름 :");
			String name2 = sc.next();
			System.out.println("수량 : ");
			kind ="채소";
			Vegetable v= new Vegetable(kind, name2)
			break;
		case 3:
			System.out.println("이름 :");
			String name3 = sc.next();
			System.out.println("수량 : ");
			kind ="견과";
			Nut n = new Nut(kind, name3);
			break;
			default : 
				System.out.println("잘못입력했습니다. 다시입력해주세요");
				return;
			
		}
		fc.addNewKind(kind, menu)
	
	}
	public void removeKind() {
		
	}
	public void changeAmount() {
		
	}
	public void printFarm() {
		
	}
	public void buyFarm() {
		
	}
	public void mainMremoveFarm() {
		
	}
	public void printBuyFarm() {
		
	}
}
