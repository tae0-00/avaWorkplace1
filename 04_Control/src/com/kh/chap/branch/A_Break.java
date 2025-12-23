package com.kh.chap.branch;

import java.util.Scanner;

public class A_Break {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * break: 코드를 실행중 break문을 만나게 되면 현재 속해맀는 가강 가꾸운 반복문을 빠져낟간다.
	 * 
	 */
		public void method1() {
			//매번 반복적우로 랜덤값(1~100)을 출력
			//단, 출력된 랜덤값이 3의배수인 경우 반복을 종료. 
			
			for(;;)/*초기식 조건문 없으면 이런식으로 표기 아니면 true 사용*/ {
				int random = (int)(Math.random()*100+1);
			System.out.println("random : "+ random);
			
			if(random %3 == 0) {
				break;
			}
			}
		}
		public void method2() {
			while(true) {
				System.out.print("문자열 입력 : ");
				String str =sc.next();
				
				if(str.equals("exit")) {
					System.out.println("종료");	
					break;
				}
				System.out.println(str + "의 글자수 :"+ str.length());
			}
		}
		/*public void method3() {
			//메번 반복적으로 사용자에게 양수를 입력받아 1부터 사용자가 입력한 값까지 출력하는 프로그램을 만드시오
			//단. 사용자가 양수를 입력하는 경우 반복을 종료 시키시오.
			
			
			
			
			while(true) {
				System.out.print("양수를 입력하시오 : ");
				int num1 =sc.nextInt();
				
				if(num1 > 0) {
								for(int i=1; i <=num1 ; i++) {
						System.out.println("");
					}
				}
				System.out.println("잘못");
			}
			else { break;
				}
			}*/
		public void method4() {
			loop1:
			for(int i =0; i<10;i++) {
				loop2: 
				for(int j =0; j<10; j++) {
					System.out.println(i);	
					if (i==5) break loop1;//loop 심볼이라 함외부 반복문 탈출
					
					//break 가장 가까운 반복문을 탈출 그래서 외부 반복문을 종료시키고 싶으면 loop1이런식으로 만들고 break 뒤에 붙이기
					}
			}
		}
		
}
