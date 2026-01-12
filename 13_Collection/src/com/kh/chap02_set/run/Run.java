package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		/*
		 * Set 
		 *  -중복을 허용하지 않는다.
		 *  -저장된 순서를 보장하지 않는다. 
		 *  
		 *  
		 *  HashSet : 중복을 허용하지 않고 빠르게 저장 및 조회가 가능한 자료구조
		 *  
		 *  LinkedHashSet : 중복을 허용하지 않지만, 저장된 순서를 유지한다.
		 *  
		 *  TreeSet : 중복을 허용하지 않지만, 오름차순정렬(기본값으로)을 지원한다.
		 */
		HashSet<String>hs1 = new HashSet<String>();
		hs1.add("반갑습니다");
		hs1.add("반갑습니다");
		hs1.add("여러분");
		hs1.add("안녕하세요");
		hs1.add("여러분");
		System.out.println(hs1);
		//저장순서 x 중복값 허용하지 않기에 3개만 출력
		
		System.out.println(hs1.size());
		
		//값 삭제 
		System.out.println(hs1.remove("여러분"));
		System.out.println(hs1);
		
		System.out.println("=========================");
		/*
		 * HashSet이 객체를 저장하는 알고리즘
		 * 1. 객체의 hashCode()메서드로 객체를 저장할 위취(주소값)을 찾는다.
		 * 2. 저장한 위치에 이미 저장된 값이 있다면 equals()를 통해 저장된 값과
		 * 새로 추가할 값이 같은지 검사한다.
		 * 3. 두값이 같다면 데이터를 중복으로 저장하지 않ㅅ고, 두값이 다르다면 저장된 값의 다음위치에 새로운 값을 저장한다. 
		 */
		HashSet<Student>hs2= new HashSet<>();
		hs2.add(new Student("공유" , 40, 100));
		hs2.add(new Student("공유" , 40, 100));
		hs2.add(new Student("성규" , 10, 900));
		hs2.add(new Student("우진" , 70, 80));
		
		
		
		System.out.println(hs2);
		System.out.println(hs2.size());//4개라고 나옴 new로 새로운 객체를 선언했으니 주소값이 달름
		
		Student s1 = new Student("민경민", 30, 10);
		Student s2 = new Student("민경민", 30, 10);
		
		System.out.println(s1.equals(s2));
		
		System.out.println("=======================");
		//Set계열 클래스 반복처리 
		//1. for문 활용하여 반복처리
		//기본 베이직 loop은 사용 불가.
		
		for(Student s:hs2) {
			System.out.println(s);
		}
		//2. Iterator를 통한 반복<추가 및 삭제는 이거 사용>
		//-List계열과 Set계열에서는 Iterator를 직접 구현하였기 떄문에 사용이 가능하나,
//		Map에서는 사용불가능
		Iterator<Student> iter = hs2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//List<-->Set
		//List에 set계열 데이터를 담는 법, Set에 List를 담는법(예시 반대로만)?
		//매개변수 생성자
		List<Student>list = new ArrayList<Student>(hs2);
		
		//2. List에 set계열 데이터를 담는 법  Set에 List를 담는법
		//addAll 사용
		List<Student>list2= new ArrayList<Student>();
		list.addAll(hs2);
		
		//LinkedHashset
		//- 저장순서 유지
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(90);
		set1.add(7);
		set1.add(4);
		set1.add(11);
		
		System.out.println(set1);
		//TreeSet
		//-데이터를 정렬시켜서 (기본오름차순) 시켜서 보관 
		Comparator<Integer>comp= Collections.reverseOrder();
		Set<Integer> set2= new TreeSet<Integer>(comp);
		set2.addAll(set1);
		System.out.println(set2);
		
	
	}

}
