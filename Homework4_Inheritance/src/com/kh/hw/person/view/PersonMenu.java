package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc= new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public PersonMenu() {
		
	}
	public void mainMenu() {
		
		while(true) {//학생이랑 사원이랑 같은 메소드안에 있는데 이걸 어떻게 나누지?
		int [] arr= pc.personCount();// 여기서는 new한느거 아니고 [0]에 학생 [1]에 사원 배열
		System.out.println("학생은 최대 3명까지 저장할수 있습니다.");
		System.out.println("현재 저장된 학생은 "+arr[0]+"입니다.");
		System.out.println("사원은 최대 10명까지 저장할수 있습니다.");
		System.out.println(" 현재 저장된 사원은 "+arr[1]+"입니다.");
		System.out.println("1. 학생메뉴 ");
		System.out.println("2. 사원메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴번호 :");
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
		int [] arr = pc.personCount();
		if(arr[0]<3) {
		System.out.println("1.학생추가");
		}
		else {
			System.out.println("학생수가 다차서 더이상 활성화되지 않습니다. ");
		}
		System.out.println("2. 학생보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴번호");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			if (arr[0]>=3) {
				System.out.println("잘못입력, 다시 입력");
				continue;//브레이크 아님 다시 압력해야햇 
			}
			insertStudent();
			break;
		case 2 : 
			printStudent();
			break;
		case 9 : 
			System.out.println("메인으로 돌아갑니다.");
			return;
		default : 
			System.out.println(" 잘못입력했습니다. 다시 해주세요");
			}
		}
	}
	public void employeeMenu(){
		int [] arr = pc.personCount();
		while(true) {
			if(arr[1]<10) {
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
				if (arr[1] >= 10) {
					System.out.println("잘못입력");
					break;
				}
				insertStudent();
				break;
			case 2 : 
				printStudent();
				break;
			case 9 : 
				System.out.println("메인으로 돌아갑니다.");
			
				return;
			default : 
				System.out.println(" 잘못입력했습니다. 다시 해주세요");
			}
		}
	}
	public void insertStudent() {
		while(true) {
			int [] arr= pc.personCount();
			int studentc =arr[0];
			if (studentc>=3) {
				System.out.println("다차서 추가를 종료하고 학생메뉴로 갑니다. ");
				return;
			}
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
		
		arr = pc.personCount();//이거 다시 해줘야함 값을 받고 값을 바뀐거라서 
		studentc = arr[0];//이거 다시 해줘야함 값을 받고 값을 바뀐거라서 
		
		if (studentc>=3) {
			System.out.println("다차서 추가를 종료하고 학생메뉴로 갑니다. ");
			return;
		}
		else  {
			System.out.println("그만하시려면 N또는 n 이어하시려면 아무키나 누르세요");
			String no = sc.next();
			if (no.equals("n") || no.equals("N")) {
				return;
			} 
		}
		
	}
}
	public void printStudent() {//여기서 널값 조건식 꼭 해야하는거 잊지 말기!!!
		Student [] arr = pc.printStudent();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
			System.out.println(arr[i]);
			}
		}
		
	}
	public void  insertEmployee()  {
		while(true) {
			int [] arr =pc.personCount();
			int emco =arr [1];
			if(emco>=10) {
				System.out.println(" 사원 수 다참 메누ㅠ로 돌아감");
				return;
			}
			
			System.out.println("사원 이름: ");
			String name = sc.next();
			
			System.out.println("사원 나이 :");
			int age = sc.nextInt();
			
			System.out.println(" 사원 키");
			double h= sc.nextDouble();
			
			System.out.println(" 몸무게");
			double w= sc.nextDouble();
			
			System.out.println("급여");
			int sal = sc.nextInt();
			
			System.out.println("부서");
			String dept = sc.next();
			
			pc.insertEmployee(name, age, h, w, sal, dept);
			
			arr = pc.personCount();
			emco = arr[1];
			if(emco>=10) {
				System.out.println(" 사원 수 다참 메누ㅠ로 돌아감");
				return;
			}
			else {
				System.out.println("계속 해? 안하면 n 아니면 아무키 누리세여");
				String n= sc.next();
				if(n.equals("n")||n.equals("N")) {
					return;
				}
			}
		}
	}
	public void printEmployee() {
		Employee[] arr = pc.printEmployee();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				System.out.println(arr[i]);
			}
		}
	}
}
