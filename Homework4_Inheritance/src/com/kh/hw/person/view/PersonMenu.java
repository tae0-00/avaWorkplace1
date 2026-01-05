package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;

public class PersonMenu {

	private Scanner sc= new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public PersonMenu() {
		
	}
	public void mainMenu() {
		while(true) {//학생이랑 사원이랑 같은 메소드안에 있는데 이걸 어떻게 나누지?
		System.out.println("학생은 최대 3명까지 저장할수 있습니다.");
		System.out.println("현재 저장된 학생은 "+ pc.personCount());
		System.out.println("사원은 최대 10명까지 저장할수 있습니다.");
		System.out.println(" 현재 저장된 사원은 "+pc.personCount());
		System.out.println("1. 학생메뉴 ");
		System.out.println("2. 사원메뉴");
		System.out.println("9. 끝내기");
		System.out.println("메뉴번호 :");
		int menu= sc.nextInt();
		
		switch(menu) {
		case 1 :
			studentMenu();
			break;
		case 2 :
			employeeMenu();
			break;
		case 9 : 
			System.out.println("종료합니다");
			return;
		default : 
			System.out.println("잘못입력했습니다. 다시 입력해주세요");
		}
		}	
	}
	public void studentMenu() {
		while(true) {
		if(pc.personCount()==null&&pc.personCount().length<4) {
		System.out.println("1.학생추가");
		}
		else {
			System.out.println("학생수가 다차서 더이상 활성화되지 않습니다. ");
		}
		System.out.println("2. 학생보기");
		System.out.println("9. 메인으로");
		System.out.println("메뉴번호");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			if (pc.personCount() != null && pc.personCount().length > 3) {
				System.out.println("잘못입력");
			}
			insertStudent();
			break;
		case 2 : 
			printStudent();
			break;
		case 9 : 
			System.out.println("메인으로 돌아갑니다.");
			mainMenu();
			return;
		default : 
			System.out.println(" 잘못입력했습니다. 다시 해주세요");
			}
		}
	}
	public void employeeMenu(){
		while(true) {
			if(pc.personCount()==null&&pc.personCount().length<11) {
			System.out.println("1.사원추가");
			}
			else {
				System.out.println("사원수가 다차서 더이상 활성화되지 않습니다. ");
			}
			System.out.println("2. 사원보기");
			System.out.println("9. 메인으로");
			System.out.println("메뉴번호");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				if (pc.personCount() != null && pc.personCount().length > 10) {
					System.out.println("잘못입력");
				}
				insertStudent();
				break;
			case 2 : 
				printStudent();
				break;
			case 9 : 
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default : 
				System.out.println(" 잘못입력했습니다. 다시 해주세요");
			}
		}
	}
	public void insertStudent() {
		System.out.println("학생 이름 :");
		String name = sc.next();
		System.out.println("학생 나이 :");
		int age = sc.nextInt();
		System.out.println("학생 키 :");
		double height = sc.nextDouble();
		System.out.println("학생 몸무개 :");
		double weight = sc.nextDouble();
		System.out.println("학생 학년 :");
		int grade = sc.nextInt();
		System.out.println("학생 전공 :");
		String major = sc.next();
		//이부분 이상함
		pc.insertStudent(name, age, height, weight, grade, major);
		for(int i=0; i<pc.personCount().length;i++) {
			if (pc.personCount().length==3) {
				System.out.println("다차서 추가를 종료하고 학생메뉴로 갑니다. ");
				return;
			}
			if(pc.personCount().length<4) {
				System.out.println("그만하시려면 N또는 n 이어하시려면 아무키나 누르세요");
				String no= sc.next();
				if(no.equals("n")||no.equals("N")) {
					break;
				}
				
		}
			else {
			System.out.println( pc.insertStudent(name, age, height, weight, grade, major));
			}
			}	
		
	}
	public void printStudent() {
		Employee[] arr = new {pc.printStudent()};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr);
		}
		
	}
	public void  insertEmployee()  {
		
	}
	public void printEmployee() {
		
	}
}
