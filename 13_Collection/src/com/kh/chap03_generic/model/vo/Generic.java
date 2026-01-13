package com.kh.chap03_generic.model.vo;

//현재 클래스에서 사용할 타입변수 지정
public class Generic < T , G>{
	/*
	 * 제네릭 설정 방법
	 * -제네릭 (타입변수)는 여려 참조변수로 대체될수 있는 부분을 하나의 문자로 표현한다,
	 * ex) <T>,<G>,<E>..
	 * -제네릭은 class및 method,필드에 각각 지정할수 있다. 
	 */
	T t;//그냥 내 맘대로 타입을 지정한 거임 나중에 자료형을 지정해주면 되ㅗ 안해줘도 object로 됨 
	G g;
	

	public T getT() {//그냥 내 맘대로 타입을 지정한 거임 나중에 자료형을 지정해주면 되ㅗ 안해줘도 object로 됨 
		return t;
	}


	


	public G getG() {
		return g;
	}


	public void setG(G g) {
		this.g = g;
	}


	public void setT(T t) {
		this.t = t;
	}
	public static <V> void printTest(V item) {

		System.out.println(item);
	}
}
