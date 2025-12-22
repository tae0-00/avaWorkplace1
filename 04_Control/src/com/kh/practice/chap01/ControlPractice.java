package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);

	public void pracactice1() {

		System.out.print(" 메뉴 번호를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.println(" 1. 입력 : ");
		System.out.println(" 2. 수정 : ");
		System.out.println(" 3. 조회 : ");
		System.out.println(" 4. 삭제 : ");
		System.out.println(" 7. 종료 : ");
		
		if (num == 1) {
			System.out.println(" 1. 입력 메뉴입니다. ");
			
		}
		if (num == 2) {
			System.out.println(" 2. 수정 메뉴입니다. ");
		}
		if (num == 3) {
			System.out.println(" 3. 조회 메뉴입니다. ");
		}
		if (num == 4) {
			System.out.println(" 4. 삭제 메뉴입니다. ");
		}
		if (num == 7) {
			System.out.println(" 프로그램이 종료됩니다.");

			//메서드 어디에서나 사용가능
			//현재 위치에서 메서드를 "종료" 시키는 키눠드
			//break;, return;, 
			
		}
	}

	public void pracactice2() {

		System.out.print(" 숫자 한개를 입력하세요. :");
		int num = sc.nextInt();

		
		if (num / 2 == 0 && num > 0) {
			System.out.println("짝수다");
		} else if (num < 0) {
			System.out.println("양수를 입력해주세요.");
		} else {
			System.out.println("홀수다.");
		}
	}

	public void pracactice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		double sum = kor + math + eng;
		double av = sum / 3;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + av);
		if ((kor >= 40 && math >= 40 && eng >= 40) && av >= 60) {
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
			
		/*if (!(kor >= 40 && math >= 40 && eng >= 40) && av >= 60) {
				System.out.println("불합격입니다!");
				return;
				System.out.println("축하합니다. 합격입니다!");
				-단독문으로 사용 가능 앞에 부정인 경우를 먼저 하고 나머지는 무조건 참이게 
				*/
		}

	}

	public void practice4() {

		System.out.print("월을 입력하시오 :");
		int month = sc.nextInt();

		switch (month) {
		case 1: //case 1,2 ,12 : 사용 가능 
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("해당하는 계절이 없습니다.");
			
		}
		//sysout 해보기
	}

	public void practice5() {
		System.out.print("아이디 :");
		String id = sc.next();

		System.out.print("비밀번호 :");
		String password = sc.next();


		switch (id) {
		case "tae0":
			System.out.println("로그인 성공");
			break;
		default:
			System.out.println("아이디가 틀렸습니다.");
		
		switch (password) {
		case "pwjpwj":
			System.out.println("로그인 성공");
			break;
		default:
			System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		
			
	}
	
	/*public void practice5_1() {
		
		String id = tae0;
		
		if (id.equals(id)) {
			
		}해보기 10번 문제 메서드 (); 로 하면 열림??
	}*/ 
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String str =sc.next();
		
		switch(str) {
		case "관리자" : 
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글작성 게시들 조회");
			break;
			
		case "회원" : 
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");	
			break;
		case "비회원" : 
			System.out.println(" 게시글 조회");	
			break;	
			
		}
	}
	
	public void practice7() {
		System.out.print("키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("BMI 지수 : "+ bmi);
		if(bmi<18.5) {
			System.out.println("저체중 ");
		}
		else if (bmi < 23) {
			System.out.println("정상체중");
		}
		else if ( bmi < 25) {
			System.out.println("과체중");
		}	
		else if ( bmi < 30) {
				System.out.println("비만체중");
		}
		else  {
			System.out.println("정상체중");
		}
		
	}
	public void practice8() {
		
		System.out.print("피연산자1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를(+,-,*,/,%) 입력 : ");
		String oper = sc.next();
		
		switch(oper) {
		case "+" : case "-" :case "*" : case "/": case "%" : 
			System.out.println(num1 + oper +num2 +" = "+ (double)((float)
					num1 / num2 ) );
		}
		
		
	}
	public void practice9() {
		System.out.print("중간 고사 점수 :");
		int middle = sc.nextInt();
		
		System.out.print("기말 고사 점수 :");
		int last = sc.nextInt();
		
		System.out.print("과제 고사 점수 :");
		int hw = sc.nextInt();
		
		System.out.print("출석 회수 :");
		int come = sc.nextInt();
		
		double mp = middle * 0.2;
		double lp = last * 0.3;
		double hwp = hw * 0.3;
		double cp = come ;
		
		if(cp<=come*0.3) {
			System.out.println("Fail");
		}
		else if {
			
		}
		else {
			System.out.println("Pass");
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}