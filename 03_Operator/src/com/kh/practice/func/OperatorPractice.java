package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candys = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 "+ (candys / person));
		System.out.println("남는 사탕 개수 "+ (candys % person));
	}

	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classes = sc.nextInt(); 
		
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		System.out.print("성별 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("성적 : ");
		double d = sc.nextDouble();
		
		System.out.println(
				grade+"학년 "+classes+"반 "+num+"번 "+name
				+(ch == 'M' ? "남학생" : "여학생")
				+ "의 성적은 "+d+"이다.");
	}

	public void practice3() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "어린이" : 
						(age <= 19 ? "청소년" : "성인");
		System.out.println(str);
	}

	public void practice4() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		System.out.println(
				kor >= 40 && eng >= 40 && math >= 40
				&& avg >= 60.0 ? "합격" : "불합격");
	}
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.next();
		char gender = str.charAt(7);// 1 남 | 2여자
		System.out.println(gender == '1' || gender == '3'
				? "남자" :"여자" );
	}
	
	
	public void practice6(){
		System.out.print("정수 1 :" );
		int num1 =sc.nextInt();

		System.out.print("정수 2 :" );
		int num2 =sc.nextInt();


		System.out.print("입력 :" );
		int num3 =sc.nextInt();

		System.out.println( num3<=num1 || num3 > num2 ? true : false );
	}

		public void practice7(){
		 
		System.out.print("입력1  :" );
		int num1 =sc.nextInt();

		System.out.print("입력 2 :" );
		int num2 =sc.nextInt();

		System.out.print("입력 3 :" );
		int num3 =sc.nextInt();
		
		
		System.out.println((num1 == num2)&& (num2== num3) ? true : false) ;
		}
		public void practice8(){

		System.out.print("A사원의 연봉  :" );
		int money1 =sc.nextInt();

		System.out.print("B사원의 연봉  :" );
		int money2 =sc.nextInt();

		System.out.print("C사원의 연봉  :" );
		int money3 =sc.nextInt();

		double bonusA = money1 * 0.4;
		double bonusB = money2 * 0;
		double bonusC = money3 * 0.15;

		double sumA = money1 + bonusA ;
		double sumB = money2 + bonusB;
		double sumC = money3 + bonusC;
		System.out.println("A사원 연봉/연봉+a :" + (sumA >=3000 ? "3000 이상\n" : "3000미만\n")+ 
					 "B사원 연봉/연봉 +a :" + (sumB >=3000 ? "3000원 이상\n" : "3000미만\n")+
					 "C사원 연봉/연봉 +a  :" +(sumC >=3000 ? "3000원 이상\n" : "3000미만\n"));
		}}
	
	
	
	

