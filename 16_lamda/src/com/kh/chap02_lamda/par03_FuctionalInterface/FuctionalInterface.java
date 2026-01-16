package com.kh.chap02_lamda.par03_FuctionalInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuctionalInterface {
	/*
	 * 함수형 인터페이스
	 * 	- 람다식을 통해 구현되는 추상메서드를 깆고 있는 엔터페이스로 내부에 오직 1개만의 추상메서드를 가지고 있다
	 * 	-ㄱ람다식을 사용하기 위해서는 함수형 인터페이스가 필요하다.
	 * 
	 * 자바의 대표 함수형 인터페이스들
	 *  	인터페이스         |       추상메서드
	 * -------------------------------------------
	 * 1. Runable          |    run() : void
	 * 2. Supplier<R>      |    get() : R
	 * 3. Cunsumer<T>      |    accecpt(T) : void 데이터저장
	 * 4. Function<T,R>    |    apply(T) :R
	 * 5. predicater<T>    |    test(T)  : boolean
	 * ...
	 */

	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i=0; i<10; i++) {
				System.out.println(new Date());
			}
		};
		r.run();
		//2. supplier<R>
		//공급역활의 함수
		//매개변수 없고 반환값 있음
		Supplier<Long>supple= ()->{
			return new Date().getTime();
		};
		System.out.println(supple.get());
	
		//. Comsumer
		//-매개변수 0 ,반환값 x
		Consumer<String> con =(name)-> {
			System.out.println("이름 :"+ name);
		};
		con.accept("태경");
		
		//4. Function<T,R>
		//매개변수 o 반환형 0
		Function<String, Integer>fun = str->{
			return str.length();
		};
		int re = fun.apply("오늘은 진짜 진심 집에 가고싶소");
		System.out.println(re);
		//5. pridicate<T>
		//매개변수 0 반환형은 boolean고정
		Predicate<Integer>pre = num ->{
			return num%2==0;
		};
		System.out.println(pre.test(100));
	}
}
