package com.kh.chap01_poly.part01.run;

import java.time.Instant;

import com.kh.chap01_poly.part01.model.vo.*;

public class Run {

	public static void main(String[] args) {

		/*
		 * '='(대입연산자를 기준으로 왼쪽과 오른쪽의 자료형은 항상 같아야한다.
		 * 1. 부모타입 참조변수로 부모타입 객체를 다루는 경우
		 * 
		 */
		System.out.println("1. 부모타입 참조변수 부모 객체 다루기");
		//부모타입 참조변수 p1=부모타입 객체
		Parent p1 = new Parent();
		p1.printparent();
		
		//2. 자식타입 참조변수로 자식타입 객체 다루기
		System.out.println("2. 자식타입 참조변수로 자식타입 객체 다루기");
		
		Child1 c1 = new Child1();
		c1.printparent();// 부모 메서드 호출
		c1.printChild1();// this애서 메서드 호출 
		
		//3.부모타입 참조변수ㅎ로 자식타입 객체를 다루는 방법
		System.out.println("3. 부모타입 참조변수로 자식타입 객체 다루기");
		Parent p2=/*(Parent)*/ new Child1();//다형성이 적용된 개념 저 부분이 자동으러 추가 되있음
		
		p2.printparent();//부모타입변수로는 parent클래스내부의 메서드/필드만 접근가능
		//자식클래스의 매서드를 젒근하고자 한다면, 다운캐스팅이 필요!
		//자식간의 형변환은 불가능 그래서 헷갈리면 안됨 
		((Child1)p2).printChild1();//다운캐스팅,,
		/*
		 * 대입연산자 기준 양쪽의 자료형이 다름에도 불구하고 오류가 나지 않는다. 
		 * 이유는. 자식객체가 부모자료형으로 " 자동형변환"되거 있기 때문
		 * 상속구조의 경우 클래스간의 형변환이 가능
		 * 
		 * 클래스간 형변환
		 * 1. UpCasting
		 * -자식 타입에서 부모타입으로 자동 형변환 
		 * -자동형변환이 가능하므로 형변환연산자는 생략이 가능
		 * -ex) 자식객체.부모메서드();
		 *      부모참조변수 = 자식객체();
		 * 
		 * 2.DowmCastring
		 * -부모타입에서 자식타입으로 형변환 되는 경우
		 * -생략이 불가능(강제 형변환 필요)
		 * -ex)((자식)부모).자식메서드();
		 * 
		 * 다형성을 사용하는 이유 
		 * -부모타입으로 부터 파생된 여러가지 타입의 자식 객체들을 "하나의 부모클래스로 " 다룰수 있기 떄문.
		 * 
		 */
		/*
		 * 다형성 적용 전 
		 * child1 객체와 child2객체를 객체배열로 다루기
		 */
		Child1[] arr1= new Child1[2];
		arr1[0]= new Child1(1,2,4);
		arr1[1]= new Child1(1,2,6);
		
		Child2[] arr2= new Child2[2];
		arr2[0]= new Child2(2,4);
		arr2[1]= new Child2(1,2);
		
		//다형성이 적용된다면 , 부모타입 래퍼런스로 다양한 자식객체들을 받아줄수 있다. 
		Parent[]arr= new Parent[4];
		arr[0]= new Child1(1,2,4);
		arr[1]= new Child2(3,4);
		arr[2]= new Child1(3,3,3);
		arr[3]= new Child2(5,4);
		
		System.out.println("내가 만들어야하는 객체배열이 줄어듬?");
		//반복문 활용한 메서드 호출
		for(int i=0; i<arr.length; i++) {
			//각 인덱스 별로 실제 참조하고 있는 자식클래스로 적절히 다운캐스팅 후, 
			//메서드를 호출하려면??
		//1.instnaceof 자료형 연산자 활용 
			//객체가 실제로 참조하고 있는 클래스를 확인하여 자료형과 같다면 true 다르다면 false를 반환
			if(arr[i]instanceof Child1){
			((Child1)arr[i]).printparent();
			}
			//else if ()
		
		//2.오버라이딩을 이용하기
			/*
			 * 동적바인딩(부모 자식 클래스 사이에서만 발생)
			 * -프로그램이 실행되기 전에는 컴파일 단계에거 참조변수의 클래스의 메서드를 실행한다고 나오지만
			 * 실제 Run런타임단계에서는 자식객체 내부의 오버라이딩된 메서드를 찾아가서 실행되는 기능. 
			 */
			arr[i].print();
		}	
		
	}

}
