package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.Basketball;
import com.kh.chap02_abstract.part01.model.vo.Football;
import com.kh.chap02_abstract.part01.model.vo.Sports;

public class Run {

	public static void main(String[] args) {

		//추상클래스로 객체 생성?
	//	Sports s = new Sports(); {
		//-추상클래스는 객체 생성이 불가능하다.	
		//-참조변수로는 사용이 가능하다. (다형성 때문에??)
		Sports s = new Basketball();
		
		Sports [] s1 = new Sports[2];
		s1[0]= s;
		s1[1]=new Football();
		
		for(Sports spo : s1) {
			spo.rule();
			/*
			 * :::추상클래스란 :::
			 * -추상클래스란 미완성돤 부분이 존재하는 클래스임을 의미한다
			 * -미완성된 클래스이기 때문에 객체 생성은 불가능하나, 참조변수로는 사용이 가능한다'
			 * -추상메서드가 포함돤 경우, 클래스는 반드시 추상클래스로 정의해야한다.
			 * -추상클래스는 "일반 필드" 일반 메서드" "생성자" "추상메서드"로 이루어짐
			 * -추상클래스는 클래스의 상속이 주된 목적이며 메소드 강제 구현은 서브다.
			 *
			 * ::추상메서드 
			 * -미완성된 메서드를 의미하며, 메서드의 몸통부분이 구현되지 않은 메서드
			 * -추상메서드는 자식클래스에서 " 오버라이딩 "을 통하여 완성하며, 자식클래스의
			 * 상속받은 추상메서들르 재정의하지 않는 경우 에러가 발생한다.
			 * -추상메서드를 통해 클래스간의 통일성을 확보할수 있다. 
			 * 
			 */
		}
		}

}
