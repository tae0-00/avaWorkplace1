package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap04_map.part01_hashmap.model.vo.Snack;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu <K , V>{
	private Scanner sc=new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu(){
		
			System.out.println("=====KH 사이트=======");
			while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴번호 입력 : ");
			int menu= sc.nextInt();
			
			switch (menu) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력 다시입력");
			}
		}
	}
	public void memberMenu(){
		while(true) {
			System.out.println("*****회원메뉴*******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기 ");
			System.out.println("3. 로그아웃");
			System.out.println("메뉴 번호 : ");
			int menu= sc.nextInt();
			
			switch (menu) {
			case 1:
				changePassword();
				break;
			case 2:
				logIn();
				 changeName();
				break;
			case 3:
				 mainMenu();
				 return;
			default:
				System.out.println("잘못입력 다시입력");
			}
		}
	}
	public void joinMembership(){
		System.out.println("아이디 입력: ");
		String id= sc.next();
		
		System.out.println("비번 입력: ");
		String password= sc.next();
		
		System.out.println("이름 입력: ");
		String name= sc.next();
		
		 Member m = new Member( password,name);
		 
		 boolean b= mc.joinMembership(id, m);
		 if(b) {
			 System.out.println("성공적으로 회원가입 완료");
		 }else {
			 System.out.println("중복아이디");
		 }
	}
	public void logIn(){
		System.out.println("아이디 입력: ");
		String id= sc.next();
		
		System.out.println("비번 입력: ");
		String password= sc.next();
		
		String log= mc.logIn(id, password);
		if(log==null) {
			System.out.println("틀린 아이디 또는 비번 입니다 다시입려하세요");
			return;
		}else {
			System.out.println("ooo님, 환영합니다,");
			memberMenu();
		}
	}
	public void changePassword(){
		System.out.println("아이디 입력: ");
		String id= sc.next();
		
		System.out.println("비번 입력: ");
		String password= sc.next();
		
		System.out.println("변경할 비번 입력: ");
		String changepwd= sc.next();
		
		boolean mc.changeName(id, changepwd);
		if() {
			
		}
		
		
	}
	public void changeName(){
		
	}
	public void sameName(){
		System.out.println(" 검색할 이름 입력: ");
		String serchname= sc.next();
		TreeMap<K, V> tt= mc.sameName(serchname);
		//Set<Entry<String, Snack>>entrySet = hm.entrySet();
		Set<Entry<K, V>>entrySet = tt.entrySet();
		//for(Entry<String, Snack> en : entrySet){
		for(Entry<K, V> en :entrySet ) {
			System.out.println("en.getKey()"+en.getValue());
		}
	}
	

}
