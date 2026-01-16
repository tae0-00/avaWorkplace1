package com.kh.chap01_innerClass.run;

import com.kh.chap01_innerClass.prat01_instace.OuterClass;

import com.kh.chap01_innerClass.prat02_static.model.vo.Member;
import com.kh.chap01_innerClass.prat03_local.OuterClass3;

public class Run {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		oc.method();
		//InnerClass ic= oc.new InnerClass(); 내부클래스의 사용목적과 맞지 않음 
		
		//빌더 클래스를 활용한 객체 생성
		Member m = new Member.Builder().id("tae0").name("김태경").age(26).build();
		//빌더에 있는 값들을 불러왔고 ()안에는 값을 집어넣음 
		
		/*
		 *빌더클래스 사용시 장점
		 *-불필요한 생성자들이 없다
		 *- 필드의 순서에 상관없이 객체 생성 가능
		 *-명시적인 메서드명으로 가독성이 확보된다.
		 *vo클래스에 setter메서ㅗ드가 없어 불변성 유지가 가능
		 *-올바른 값이 초기화되었는지 검증가능  
		 */
		OuterClass3 o3= new OuterClass3();
		Runnable r= o3.getRunnable(0);
		r.run();
		
	}

}
