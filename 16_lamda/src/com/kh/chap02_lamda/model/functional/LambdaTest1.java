package com.kh.chap02_lamda.model.functional;

/*
 * 함수형인터체이스로 사용될 인터페이스는 
 * 내부적으로 반드시 1개의 추상메서드만 존재해야한다. 
 */
//함수형이고 람다식 인터페이스로 만든다라는 선언방식
@FunctionalInterface
public interface LambdaTest1 {
	int add(int x, int y);
	//void ptint(); 함수형 인터페이스는 메서드가 2개 있을수 없다.

}
