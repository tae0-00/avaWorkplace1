package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void practice1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총점 : "+ (int)(kor + eng + math));
		System.out.println("총점 : "+ (int)(kor + eng + math)/3);
		
		//선생님 답도 왜.. 정수로 나오지?
			System.out.print("국 : ");
			double kor1 = sc.nextDouble();
			
			System.out.print("영 : ");
			double eng2 = sc.nextDouble();
			
			System.out.print("수 : ");
			double math3 = sc.nextDouble();
			
			int total = (int)(kor1 + eng2 + math3);
			int avg = total / 3;
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);
	
}}