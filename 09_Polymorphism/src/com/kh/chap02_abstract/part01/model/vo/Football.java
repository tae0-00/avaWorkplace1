package com.kh.chap02_abstract.part01.model.vo;


//추상클래스를 상속되게 되면 , 추상클래스 내부의 미구현된 추상메서드들을 반드시 
//구현완료해야만 컴파일 에러가 사라진다. 
public class Football extends Sports {

	@Override//에러 나면 그거 클릭하면 자동으로 만들어줌 
	public void rule() {
		System.out.println("발로 해야함");
		
		
	}

	
	
	
}
