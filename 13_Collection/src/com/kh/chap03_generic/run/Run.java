package com.kh.chap03_generic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap03_generic.model.vo.Child1;
import com.kh.chap03_generic.model.vo.Child2;
import com.kh.chap03_generic.model.vo.Generic;
import com.kh.chap03_generic.model.vo.GenericExtends;
import com.kh.chap03_generic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {

		/*
		 * 1. 제네릭 이전 프로그램 방식(jdk5이전)
		 *  -컬랙션에 데이터를 추가시 항상 Object객체로 저장해야 했다
		 *  -저장된 데이터를 꺼내서 활용시에는 항상 "강제형변환"이 필요했다.
		 *  -단, 형변환시 잘못된 자료형으로의 형변환을 진행한다면 에러가 발생 할수 있다. 
		 */
		List l = new ArrayList();
		for(Object o : l) {
			//o가 String이 아닌경우 에러발생 
			String s= (String)o;
		}
		/*
		 * 2. 제네릭 등장(JDK1.5)
		 * -데이터의 자료형을 일반화시켜 여러 자료형을 다룰 수 있게 만든 문법
		 * -클래스의 메서드의 "반환형", "매개변수", 필드의 "자료형"들을 미리 확정짓지 않고,
		 * 파라미터화 하여 나중에 지정할 수 있는 문법
		 * -즉, 제네릭을 사용하면 다양한 장=료형(타입)들을 저장할수 있기 때문에 타입변수<T> 라고도 불린다,
		 * -제네릭을 사용하면 런타임이 아닌 컴파일 시점에서 에러를 캐치할 수 있으므로 타입안전성을 확보할수 있다. 
		 */
		Generic<Integer, String> g1= new Generic<Integer, String>();
		
		g1.setT(1111);
		g1.setG("ddddd");
		Generic.printTest(1919191);
		
		
		//대입될 데이터의 자료형을 미이 지정하지 않고 컴파일 시점에서 내 맘대로 지정하여
		//사용하므로 재사용성이 크게 증가하였다. 
		
		/*
		 * 3.제네릭의 extends 문법
		 * 	-제네릭에서의 extends는 클래스간의 상속 개념이 아닌 제네릭으로 지정한 자료형의 범뤼를 "제한"시키는데 사용한다. 
		 * 	-<T extends Parent> : T에는 부모클래스나 부모클래스를 상속받은 자료형마 ㄴ대입 가능
		 * 	-<T extends Interface> : 인테페이스를 구현한 클래스만 대입 가능
		 *
		 */
		GenericExtends <Parent> parent = new GenericExtends<Parent>() ;
		GenericExtends<Child1>chils1 = new GenericExtends<Child1>();
		//parent 및 parent의 자식클래스가 아닉디에 타입 오류 발생
		//GenericExtends<String> str = new GenericExtends<>();
		parent.setType(new Parent());//이거 뭐지
		parent.printing();
		
		/*
		 * 4. 와일드카드(?)
		 * -Generic에 들어가야할 자료형을 모르는 경우 사용
		 * -와일드카드(?)의 의미는 어떤 자료형이 들어올지 모른다(unknown)의 의미로 사용하며,
		 * 모든자료형(any)이 들어올수 있다는 의미는 아니다.
		 * -?는 extends와 super 에약어로 자료형의 범위를 제한 할수 있다.
		 * -? Extends T : 상한제한=>와이드카드의 범위를 T또는 T의 자식들로 제한하는 기능
		 * ? super T : 하한제한 => 와일드카드의 범위를 T 또는 T의 "조상" 들로 제한
		 * 
		 */
		//자료형의 범위가 정해져있지 않은 상황에 사용.
		GenericExtends<?>unknown = new GenericExtends<>();
		//unknown.setType(new Parent());
		//?로 타입변수 사용시 올바른 ㄱ값을 사용중인지 검사가 불가능하기 떄문에 에러가 발생,,
		//?의 제대로 사용하려면 extend외 super를 사용하여 ?의 범위를 제한하여 한다.
		
		//1. extends를 통한 와일드카드 상한제한
		GenericExtends<? extends Parent>unknown2= new GenericExtends<Parent>();
		//?의 범위 : parent, parent의 자식들 
		
		//Child1 c= (Child1)new Parent();
		//Child2 c2= new Child2();
		
//		unknown2.setType(new Parent()); //?의 범위에 paent의 자식 12 가 포함될수도 있으므로 대입불가능한 상황이 생긴ㄷ.
//		unknown2.setType(new Child1()); //?의 범위에 2가 포함되어 있으므로 대입불가능한 상황이 생기낟. 
//		unknown2.setType(new Child2());
//		
		Parent p= unknown2.getType();
		//unknown2가 parents든 chid1 ,2든 다형성에 의해 값을 추출하여 대입 가능
		//즉, extends를 통한 상한제한은 데이터를 "가져올때" 자주 사용한다.
		
		//2. suoper를 통한 하한제한
		//? super Parent : 와일드카드의 범위는 최하 parent부터 object
		GenericExtends<? super Parent>unknown3= new GenericExtends<Parent>();
		//? 의 현재 범위 : patrnt, object
		
		unknown3.setType(new Parent());
		unknown3.setType(new Child1());
		unknown3.setType(new Child2());
		
		//값을 "대입하고자 " 할떄는 sper를 통한 하한제한을 사용하는 것이 적절
		
		Parent p3 = unknown3.getType();//?는 Object일 수 있음 
		//단, 클래스 레벨를 Parent에서 자식클래스까지로 선언했기에 지금은 오류가 나지않지만
		//원래는 가장 큰 object까지임 그래서 오류날수 있음 
		
		Object o3= unknown3.getType();
		//따라서 타입변수에 extends를 통한 타입제한이 없는 경우,데이턴ㄴ 항상 extends 형태로만 추출이 가능
		
		
		
		
	}

}
