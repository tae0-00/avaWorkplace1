package com.kh.chap04_feild.run;

import com.kh.chap04_feild.model.vo.FieldTest1;
import com.kh.chap04_feild.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {

		FieldTest1 ff = new FieldTest1();
		ff.test(0);
		
		//필드3 필드 및 메소드 호출
		//스태틱 필드 및 메서드 호출방법
		//1. 클래스명.static 필드명  sysout에 넣는 경우 2. 클래스명. static 메서드() 스캐너로 전제 메서드 불러오는 경우
		 System.out.println(FieldTest3.PI);//객체를 생성하지 않아도 이미 저장공간에 할당 되어있음
		
		FieldTest3.test();
	}

}
