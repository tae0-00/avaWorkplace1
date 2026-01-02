package com.kh.chap06_method.model.vo;

public class MethodTest1 {
	/*
	 * 
	 * 메서드
	 * [표현법]
	 * 접근제한자 예약어 자료형 메서드명 ([매개변수]){
	 *수행할 코드
	 *
	 *return 반환할 값;(생략가능)
	 *	 }
	 *
	 *
	 *1. 매개변수 없고, 반환할 값도 없는 메서드
	 *
	 */
	//1. 매개변수 없고, 반환할 값도 없는 메서드
	public void metod1() {
		System.out.println("매개변수 x 반환할 값 x");
	
		//return; 생략 되어있음 
	}
		//2. 매개변수는 없고 반환형은 있는 메서드 
		public int method2() {
			System.out.println("매개변수 있고 반환형은 없다 ");
			int random =(int)(Math.random()*100+1);
			
			return random;
		}}
		//3. ox
		/*public void method3(int x ,int y) {
			int max=0;
			int min=0;
			if(x>y) {
				min=y;
				max=x;
			
		
		//4/매개변수 0 반환 0
		public int mul(int a, int b) {
			return a*b
		}*/

