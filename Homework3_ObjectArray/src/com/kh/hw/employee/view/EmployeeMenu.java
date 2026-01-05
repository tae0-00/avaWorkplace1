package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private  EmployeeController ec =new EmployeeController();
	
	public EmployeeMenu() {
		while(true) {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력 ");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호를 누르세요 : ");
		int num =sc.nextInt();
		if(!(num==1 || num==2 || num==3 || num==4 ||num==9)) {
			System.out.println("잘못입력했습니다. ");
		}
		else {
		switch(num) {
		case 1 : insertEmp();
		break;
		case 2 : updateEmp();
		break;
		case 3: deleteEmp();
		break;
		case 4 : printEmp();
		break;
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
		}
	}
	public void insertEmp() {
		
		System.out.print("사원 번호 :");
		int empNo = sc.nextInt();
		System.out.print("사원 이름 :");
		String name = sc.next();
		System.out.print("사원 성별 :");
		char gender = sc.next().charAt(0);
		System.out.print("전화 번호 : ");
		String phone =sc.next();
		System.out.println("추가 정보를 더 입력하시겠습니까?(y/n)");
		String yes = sc.next();
		if(yes.equals("y")||yes.equals("Y")) {
			System.out.print("사원 부서 :");
			String dept=sc.next();
			System.out.print("사원 연봉");
			int salary =sc.nextInt();
			System.out.print("보너스 율 :");
			double bonus =sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}
		else {
			ec.add(empNo, name, gender, phone);
			return;
		}
		
	}
	public void updateEmp() {
		while(true) {
		System.out.println("가장 최근의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.println("메뉴 번호를 입력하세요");
		int num = sc.nextInt();
		if(!(num==1|| num==2 || num==3 || num ==9)) {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		else {
			switch(num) {
			case 1: 
				System.out.print("수정할 전화번호 :");
				String ph= sc.next();
				ec.modify(ph);
			break;
			case 2: 
				System.out.print("수정할 사원 연봉");
				int sal=sc.nextInt();
				ec.modify(sal);
				break;
			case 3: 
				System.out.print("수정할 보너스 율");
				double bo = sc.nextDouble();
				ec.modify(bo);
				break;
			case 9:
				System.out.print("메인메뉴로 돌아갑니다.");
				return;
			}
		}
	}
}
	public void deleteEmp() {
		System.out.println("정말 삭제하겠습니까 (y/n)");
		String yes= sc.next();
		if(yes.equals("y")||yes.equals("Y")) {
			ec.remove();
			System.out.println("삭제에 성공했습니다.");
		}
		else {
			System.out.println("삭제를 취소합니다. ");
		}
	}

	public void printEmp() {
		String info = ec.inform();
		if (info == null) {
			System.out.println("사원 데이터가 없습니다. ");
		} else {
			System.out.println(info);
		}
	}
}

