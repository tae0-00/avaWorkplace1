package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/*
		 * 
		 * 캡슐화(내가 만든 클래스에 보호막 외부에서 조작하지 못하도록 막기위해)
		 * -추상화를 통해정의된 속성과 기능들을 묶어서 관리하는 기법으로, "데이터의접근제한"을 원칙으로 둔다.
		 * -외부로부터 "데이터의 접근을 막는 역할을 수행.
		 * -객체 내부의 데이터를 반드시 확인하거나 사용해야하는 경우,
		 *  객체 내부의 값을 조작할 수 있는 메서드를 추가로 작성하애야한다.
		 * 
		 *
		 */
		Student std= new Student();
		//std.name;//캡슐화를 통해 데이터가 은닉됨
		std.setName("김태경");
		String name =std.getName();
		
		
	}

}
