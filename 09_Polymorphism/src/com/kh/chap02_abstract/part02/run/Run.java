package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.*;

public class Run {

	public static void main(String[] args) {

		//추상클래스
		//Person p = new Person();
		//객체 생성 뷸가
		
		Person p1= new Mother("구연진","50",50,"출산");
		Person p2 = new Baby("아기","50",50);
		
		System.out.println(p1);
		
		p1.eat();
		p2.eat();
		
		System.out.println(p1);
		
		
		//인터페이스
		//Basic b =new Basic();//안돠ㅣㅁ
		Basic b1= new Mother("구연진","50",50,"출산");
		Basic b2 = new Baby("아기","50",50);
		
		b1.eat();//동적바인딩
		b2.eat();

		System.out.println(b1);
		System.out.println(b2);//동적바인딩
		//실선은 익스펜드 점선은 인플리
	}	

}
