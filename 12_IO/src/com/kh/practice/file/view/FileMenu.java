package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	public FileMenu() {
	}

	public void mainMenu() {

		while(true) {
		System.out.println("****my note****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기 ");
		System.out.println("메뉴 번호 :");
		int menu =sc.nextInt();
		
		switch(menu) {
		case 1 : 
			fileSave();
			break;
		case 2 : 
			fileOpen();
			break;
		case 3 :
			fileEdit();
			break;
		case 9 :
			System.out.println("프로그램 종료합니다");
			return;
		default :
			System.out.println("잘못입력했습니다 다시 입력하세요");
			}
		}	
	}

	public void fileSave() {
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it이라고 입력하면 종료됩니다.");
			System.out.println("내용 :");
			String input = sc.next();
			StringBuilder sb=new StringBuilder(input);
			if(input.equals("ex끝it")) {
				System.out.println("저장할 파일명을 입력해주세요.(ex. myFile.txt) : ");
				String name=sc.next();
				boolean isdup= fc.checkName(name);
				if(isdup) {
					System.out.println("이미 존재하는 파일입니다, 덮어쓰심?(y/n)");
					char ch = sc.next().toUpperCase().charAt(0);
					if(ch=='y') {
						fc.fileSave(name, sb);
					}else {
						System.out.println("저장할 파일명을 입력해주세요");
						fc.fileSave(name, sb);
					}
				}
			}
			return;
		}
	}

	public void fileOpen() {

		System.out.println("열 파일 명");
		String name= sc.next();
		
		boolean isdup= fc.checkName(name);
		if(isdup) {
			System.out.println(fc.checkName(name));
		}else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}

	public void fileEdit() {
		System.out.println("수정할 파일 명 :");
		String edit = sc.next();
		
		boolean isdup=fc.checkName(edit);
		if(isdup) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it이라고 입력하면 종료됩니다.");
			System.out.println("내용 :");
			String input = sc.next();
			StringBuilder sb= new StringBuilder(input);
			if(input.equals("ex끝it")) {
				fc.fileEdit(edit, sb);
				return;
			}else {
				System.out.println("없는 파일입니다.");
				fc.fileEdit(edit, sb);
				
			}
		}
	}
}
