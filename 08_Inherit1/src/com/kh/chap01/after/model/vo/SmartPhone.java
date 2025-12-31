package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product {

	public SmartPhone(String brand,String pCode,String  pName,int price,String  mobileAgency) {
		super(brand, pCode,pName,price);
		//생산성증가 작은양의 코드로 다양한클래스를 작성할수있다 정의해둔 부모클래스를 통해 달ㄴ 클래스로의 확장이 요ㅕㅇ이
		//클래스간의 상속은 다중 상속이 붕가능하다(단잃 상속만 지원)
		//명시되어있지는 않지만 모든 킁애스는 "오브젝트 클래스의 후손이다 
		//=>오브젝트의 메서드를 사용할수 있다 마음에 안들면 오버라이딩이 가능한다( 
		//
	}
	
	public String information() {
		return super.information()+","+
	}
	
}
