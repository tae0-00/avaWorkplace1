package com.kh.chap06_method.run;

import com.kh.chap06_method.model.vo.MethodTest1;
import com.kh.chap06_method.model.vo.MethodTest2;

public class Run {

	public static void main(String[] args) {

		MethodTest1 m1= new MethodTest1();
		m1.metod1();//일반 메서드 호출방법
		//스태틱 메서드는 다름
		
		MethodTest2.method(0);
	}

}
