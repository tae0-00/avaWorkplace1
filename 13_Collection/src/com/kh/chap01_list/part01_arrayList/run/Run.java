package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.music;

public class Run {
	public static void main(String[] args) {
	/*
	 * 컬랙션 (collection)
	 * 	-자료구조가 내장되어있는 클래스로 자바에서 제공하느 ㄴ자료구조를 담당하는 프레임워크
	 * 	-
	 * 
	 * 자료구조 
	 *  - 방대한 데이터들을 효율적으로, 구조적으로 다룰때 필요한 개념
	 *  
	 *  프레임워크 
	 *   - 효율적인 기능들이 정의되어있는 틀 
	 *   
	 *   >>데이터들이 새롭게 추가되거나 삭제되거나, 수정이 되는 기능들을 이미 정해놓은 틀이다.
	 *   
	 *  배열과 컬랙션(List)의 차이점
	 *  -배열의 단점
	 *  1. 같은 자료형의 데이터만 저장가능
	 *  2. 배열의 크기를 수정할수 없다.
	 *  3. 배열내부의 값들을 조작하기 불편함 가능은함
	 *  
	 *  -컬랙션의 장점
	 *  1. 여러자료형의 값을 저장할수 있다.(제네릭 설정을 통해 한가지 유형의 데이터만 저장도 간응)
	 *  2. 중간에 값을 추가하거나 삭제하는 등 배열내부의 값등을 조작하기우;한 편리한 메서드 정의가 
	 *  내장되어있다. 
	 *  3. 크기에 대한 제약이없다. (베열깊은복사를 알아서 해준다.)
	 *  
	 *  컬랙션의 3가지 분류
	 *  1. List계열
	 *  -담고자하는 값만을 저장한다.
	 *  -값을 저장시 순서를 유지한다.
	 *  -중복값을 담아도 상관없다.
	 *  -ArrayList,vector, linkList등이 존재한다.
	 *  
	 *  Set계열
	 *   -담고자하는 값만을 저장한다.
	 *   -값을 저장할때 순서를 유지하지 않는다.(Index 없음)
	 *   -중복값을 허용하지 않는다.
	 *   -HashSet, TreeSet
	 *   
	 *   Map게열
	 *   -담고자하는 값(value)과 그 값을 저장하는 key를 함계 저장한다
	 *   -값 저장시 순서를 유지하지 않는다.(Index 없음)
	 *   -key의 중복은 허용하지 않으나, value의 중복은 허용 
	 *  
	 */
		//List list =new ArrayList();//자동으로 크기 10배열 생성
		
		/*
		 * 제네릭(<E>)
		 * -q별도의 제네릭설정없이 컬랙션 생서시 제네릭은 Object로 설정된다.
		 * -제네릭을 설정하면 타입의 값들만 컬렉션에 담을 수 있자.
		 * 
		 * 제네릭을 사용하는 이유 
		 * 1. 명시한 타입의 객체만 저장가능하도록하여 "타입의 안정성"을 확보하게 위해서
		 * 2. 컬랜션에 저장된 객체를 꺼내서 사용할때 직접 형변환하는 작업을 없애기 위래서
		 * 
		 */
		ArrayList<music> list = new ArrayList<>(3);// 객체 생성시에는 제네릭 생략가능 
		//>>크기 3칸짜리 배열 만든거임 [null,null,null]
		System.out.println(list);//size기준 내용 출력
		//1. add(E e) : 리스트의 끝(초기화된 위치)에 전달된 e를 추가시켜주느느 메서드 
		list.add(new music("tears","소잔휘"));
		list.add(new music("와", "이정현"));
		list.add(new music("ㅇㅇ","ff"));
		System.out.println(list);
		
		//add(int index E e)
		//리스트에 전달되는 인덱스갑 위치에 e를 추가하는 메서드 
			
		list.add(0, new music("바다의 왕자","박명수"));
		//중간에 값 추가 시 알아서 기존값들을 뒤로 한칸씩 땡겨주는 깊은복사가 내부적으로 발생한다
		
		System.out.println(list);
		
		//3.set(int index,E e)
		//리스트에 해당 인덱스의 값을 전달되는 e로 변경시켜주는 메서드 
		list.set(0, new music("순정","코요태"));
		
		System.out.println(list);
		//얘는 아예 원래 값을 삭제하고 수정시키는 개념
		
		//4. remove(int index) : 리스트에 인덱스위치의 값을 삭제시키는 메서드 
		
		list.remove(1);
		System.out.println(list);
		
		//5.size(
		//-리스트에 최기화된 데이터 수를 반환하는 메서드
		System.out.println("리스트에 담긴 데이터 수: "+list.size());
		
		//6. get(int index) : E
		//- 리스트에서 인덱스위치의 값을 반환해주는 메서드
		music m = list.get(0);
		System.out.println(m);
		
		//만약 제네리 설정을 안하면??(다운 캐스팅 형변환해야한다)
		music m1 =(music)list.get(0);
		
		ArrayList<Integer> Iarr = new ArrayList<>(3);
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		
		//7. contains(E e ): boolean
		System.out.println(Iarr.contains(9));
		
		//8. indexOf(E e) : int
		//- 매개인자 요소가 몇번 인덱스에 잇는지 그 값을 반환(없다면 -1)
		System.out.println(Iarr.indexOf(900));
		
		//List를 활용한 반복문
		System.out.println("=======================");
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=======================");
		//향상된 반복문
		for(music mm:list) {//조건이 잇다면 안되지 
			System.out.println(mm);
		}
		System.out.println("=======================");
		//3)Iterator 반복문
		//-컬랙션 내부 인자를 Iterator에 담아서 관리하는 방식
		Iterator<music> iter = list.iterator();
		while(iter.hasNext()) {
			music m4 =iter.next();//이터레이터에 저장된 값을 꺼내는 함수
		//	iter.remove();//싹다  삭재됨
			System.out.println(m4);
		}
		System.out.println(list);
		
		System.out.println("=========================-");
		
		//9.sublist(int index1 int index2)까지 개념
		//인덱스1에서 2까지 데이터를 추출한 새로운 sublist를 반환하는메서드
		List<music> list2 = list.subList(0, 1);
		System.out.println(list2);
		
		System.out.println("===============================");
		
		//10. addAll(Collection c)
		//리스트에 컬랙션에 잇는 모든 데이터를 추가해주는 메서드 
		list.addAll(list2);
		System.out.println(list.size());
		
		//11.isempty()
		//-리스트가 비어있는지 확인하는 메서드 
		System.out.println("리스트의 값이 비어있나요?" + list.isEmpty());
		
		//list.clear();
		//12. 리스트에 저장한 모든 값을 지워주는 메서드
		list.clear();
		System.out.println("리스트가 비어있나요?"+list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
