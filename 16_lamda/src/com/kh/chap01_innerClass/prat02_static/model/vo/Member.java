package com.kh.chap01_innerClass.prat02_static.model.vo;

public class Member {

	private String id;
	private String name;
	private int age;
	
	public Member() {
		
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	/*
	 * 빌더패턴 
	 * - 자바의 "객체생성 방식의 단점"을 보안하기 위해 광ㄴ된 객체생성 디자인 패턴
	 * - 정적 내부클래스를 활용하고 외부클래스의 필드를 초기화하고, 외부클래스 객체를 최종적으로
	 * 	생성하여 반환하는 방식
	 * - 매개변수 생성자가 많아지는 경우 사용을 고려하는 것이 좋다.
	 * 
	 * 기존 객체생성의 초기화 방식
	 * 1) 생성자를 이용한 객체생성 및 초기화
	 * -객체를 생성할때 매개변수를 전달하여 필드값을 초기화 하는 방식
	 * -단점으로는, 많아질수록 만들어야하는 생성자가 많아질수 있다,
	 * -생성자 매개변수의 정보를 설명할 수 없기 떄문에 잘못된 값이 추가될 위험이 있다. 
	 * 
	 * 2)setter 메서드 방식
	 * - 추가해야 할 값의 정보를 확인 할 수 있기때문에 가독성은 좋으나 코드 길이가 길어질수 있다
	 * - 객체의 불변성이 깨질수 있다. (처음 값을 유지 하는것이 좋은데 이건 바뀔 가능성을 줌)
	 * 
	 */
	//외부클래스. 빌더
	public static class Builder {
		private  String id;
		private String name;
		private int age;
		
		public Builder() {
			
		}
		
		public Builder id(String id) {
			this.id=id;
			return this;
		}
		public Builder name(String name) {
			this.name=name;
			return this;
		}
		public Builder age (int age) {
			this.age=age;
			return this;
		}
		//빌드메소드
		//빌드클래스의 초기화딘 데이터 검증후, 외부클래스 객체의 필드로 옮겨서 반환하느 ㄴ메소ㅓ드
		public Member build() {
			Member m =new Member ();
			if(id==null) {
				return null;
			}
			m.id=id;
			m.name= name;
			m.age= age;
			
			return m;
		}

		
		
		
		
		
		
	}
}
