package com.kh.chap02_abstract.part01.model.vo;


//추상메서드가 존재하는 순간 반드시 추상클레스로 정의해야한다. 앞에  abstract을 붙임
public abstract class Sports {

	private int people;//스포츠에 참여하는 사람들 수
	
	public int getPeople() {
		return people;//
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public Sports() {
		
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

		//경기규칙을 설명하는 매서드 
		//-각 자식틀래스에서 반드시 오버라이딩하여 상세한 규칙ㄷ으로 출력해야한다/.
		/*
		 * 추상메서드 '
		 * -몸통보다 존재하지 않는 비완성된 메서드를 의미한다
		 * -추상메서드를 정의하기 위해서는, abstract예약어를 추가해야한다.
		 * -만일, 클래스 내부에 추상메서드가 존재하는 경우 해당 메서드는 반드시
		 * 추상클래스로 정의해야 한다. 
		 * 
		 * 추상클래스를 사용하는 경우
		 * -부모클래스를 사용하면서 모든 자식클래스에서 공통으로 구현해애하는 메서드가 존재하는 경우
		 * 메서드 구현의 강제를 위해 추상클래스를 사용한다.
		 * -상속이 메인이며 메서드 강제는 서브 
		 * 
		 * 
		 */
//	public void rule() {
//		System.out.println("경기규칙을 설명하는 메서드입니다. ");
//	}
	public abstract void rule(); 
		
	
}
