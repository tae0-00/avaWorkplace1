package com.kh.chap02_lamda.par04_methodRef;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {
	/*
	 * 람다식의 메소드 참조 문번(method Reference)
	 * -메서드참조는 람다식이 수행하는 일이 " 어떤 메서드를 그대도 호출하는 것"일 때
	 * 그 메서드의 이름만으로 람다식을 대체하는 문법
	 * 
	 * ->기존 람다식 구문을 더욱 간결하게 표현하기 위해 사용한다. 
	 * ex) (str)->{return str.length();}
	 *     String:: length;
	 * -람다식을 통해 기능이 이미 정의되어있는 다른 메서드의 기능을 호출하고, 반환시키거나
	 * 출력하거나 단순한 역할을 수행할 때 , 그 다른메서드의 이름만 추가시크는 형채로 작성하는 구문
	 * 
	 * 메서드 참조의 종류
	 * 1. static 메서드 참조
	 * 2. 일반 메서드 참조
	 * 3. 객체 메서드 참조
	 * 4. 생성자 참조
	 */
	
	public static void main(String[] args) {
		//Comsumer ->s->void
		Consumer<String>print;
		print = str->System.out.println(str);
		print.accept("안녕");
		
		//메서드참조로 변환
		print=System.out::println;
		print.accept("아자스");
		
		//2, 일반메서드 참조
		Function<String , Integer>strlen;
		strlen =str ->str.length();
		strlen =String ::length;
		
		System.out.println(strlen.apply("무지컬"));
		
		//2) a.equals(b)
		BiFunction<String, String, Boolean>strequal;
		strequal=(a,b)->a.equals(b);
		strequal=String::equals;
		
		System.out.println(strequal.apply("샤갈","샤갈" ));
		
		//3. 객체 메서드 참조.
		String title ="소나기";//문자열 객체 이건 익명내부클래스개념이고 그래서 이 타이틀은 상수임
		Predicate<String>et;
		et=str->title.equals(str);
		et =title::equals;
		
		System.out.println(et.test("소나기"));
		
		//4. 생성자 참조 
		class person{
			
			private String name;
			private int age;
			
			public person() {
				
			}
			public person(String name) {
				
			}
			public person(String name, int age) {
				
			}
		}
		Supplier<person>perconsp;
		perconsp=()->new person();
		perconsp=person:: new;
		
		BiFunction<String, Integer, person>personfu;
		personfu= (name, age)->new person(name, age);
		personfu=person::new;
	}

}
