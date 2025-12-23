package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc= new Scanner(System.in);
	
	public void practice1(){
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
ex.
1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
1 2 3 4 1 이상의 숫자를 입력해주세요.
1이상의 숫자를 입력하세요 : 8
1 2 3 4 5 6 7 8
		 */

		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else {
				for (int i = 1; i <= num1; i++) {
					System.out.print(i + " ");
				}
			// if를 뒤로 보내고 그냥 실행코드 다시 불르면 됨 practice1();
			}

		}
	}
	public void practice2(){
		
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
ex.
1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
4 3 2 1 1 이상의 숫자를 입력해주세요.
1이상의 숫자를 입력하세요 : 8
8 7 6 5 4 3 2 1
		 */
		
		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1이상의 숫자를 입력하세요");
			} else {
				for (int i = num1; i >= 1; i--) {
					System.out.println(i + " ");
				}

			}

		}
	}

	public void practice3() {

		System.out.println("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num1; i++) {
			sum += i;
			System.out.print(i + (i != num1 ? "+ " : "= "));

		}
		System.out.println(sum);

	}

	public void practice4() {

		System.out.println("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.println("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 && num2 < 1) {
			System.out.println("1 이상을 입력");
			practice4();
			return;
		}
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.println(i + " ");
		}

	}

	public void practice5() {
		while (true) {
			System.out.println("숫자 : ");
			int num1 = sc.nextInt();

			if (num1 > 9) {
				System.out.println("9이하만 ");
				continue;
			}
			for (int dan = num1; dan < 10; dan++) {
				System.out.println("=====" + dan + "단 =====");
				for (int i = num1; i < 10; i++) {
					System.out.println();
				}
			}
			break;
		}
	}

	public void practice6() {
		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.println("공차 : ");
		int gong = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " ");
			num1 += gong;
		}

	}

	public void practice7() {
		while (true) {
			System.out.println("연산자 : ");
			String oper = sc.next();

			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {

				System.out.println("정수1 : ");
				int num1 = sc.nextInt();

				System.out.println("정수2 : ");
				int num2 = sc.nextInt();

				if (num2 < 0) {
					System.out.println("0으로 안돼 ㄷㅏ시 입력");
					continue;
				}
				switch (oper) {
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				case "/":
					System.out.println(num1 / num2);
					break;
				case "%":
					System.out.println(num1 % num2);
					break;
				default:
					System.out.println("연산자 없음");
				}

			}
		}
		
			 
		 }
	 public void practice8() {
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int i=1; i<5; i++) {
			 System.out.print("*");
		  for (int j = 1; j < 5; j++ ) {
			
		 }
		 System.out.println("");
		 }
		 
		
		 
	 }
	 public void practice9() {
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int i=num; i>=num; i--) {
			 for (int j = 1; j < 5; j++ ) {
			 System.out.print("*");
			 }
			 System.out.println("");
		 }
	 }
//	 public void practice10() {
//		 System.out.print("소수 입력 :");
//		 int num = sc.nextInt();
//		 /** ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한
//		  * 
//		  */
//		 int so =num%1
//		for(int i= num%1) {
//	
//		}
		 
		 
		 
	 
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 /*public void practice11(){
		 System.out.print("숫자 입력");
		 int num1 =sc.nextInt();
		 for(int i=1; i<=num1; i++) {
			System.out.println(i+" "); 
		 }
		 if(num1<1) {
			 System.out.println("이상을 입력해");
			 practice11();
		 }
	 }
	 public void practice22(){
		 System.out.print("숫자 입력");
		 int num1 =sc.nextInt();
		 
		 for(int i=num1; i>=num1; i--) {
				System.out.println(i+" "); 
		 }
	} */
	 


	
