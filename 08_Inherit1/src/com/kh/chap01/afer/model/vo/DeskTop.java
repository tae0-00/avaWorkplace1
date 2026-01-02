package com.kh.chap01.afer.model.vo;

public class DeskTop extends Product{

	private boolean allInone;
	//상속메모리 구조 보여주기 
//	//부모객체의 값 초기화하기
//	//방법1. 자식 클래스에서 부모 클래스의 필드에 접근이 가능하도록 접근제한자를 수정 
//	//protectsd로 변경한 후 앞에 super 붙이기 
//	//super.brand=barnd;
//	this.allInone=allInone;
//	
//	//방법 2. 부모클래스에 있는 setter 사용
//	super.setBrand(barnd);
//	setpName(pName);
//	setpCode(pCode);
//	setPrice(price);
//	//둘다 사용가능
	
	// 방법3. 부모생성자를 호출하기 
	//제일 첫줄에 잇어야함 앞에 슈퍼를 항상 불러줘야지 부모클래스임 이름이 동일한경우 식별자인 슈퍼를 적어줘야함
	//오버라이딩 : 부모클래스롸 자식클래스의 메서드명이 동일한 케이스 
	public DeskTop() {
		
	}
	public DeskTop(String brand, String pCode, String pName, int price, boolean allInone) {//상속받은 거 전부 
		super(brand,pCode,pName,price);
		this.allInone=allInone;
	}
	public boolean isAllInone() {
		return allInone;
	}
	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
		// 객체의 정보를 문자열로 반환하는 메서드.
		// 오버라이딩 : 부모클래스와 자식클래스의 메서드명이 동일한 케이스.
	public String information() {
//		return getBrand()+", "+getpCode()+", "+getpName()
//		+", "+getPrice()+", "+isAllInOne();
		return super.imformation() +", "+ allInone;
		}
		
	}

