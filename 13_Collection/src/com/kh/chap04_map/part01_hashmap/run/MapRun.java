package com.kh.chap04_map.part01_hashmap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashmap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		/*
		 * HashMap
		 *  -많은 양의 데이터를 "빠르게 저장하고 관리"하기 위하여 사용하는 클래스로,
		 *   KeY값과 Value값을 함께 저장한다.
		 * -계층구조상 List, Set계열과 다른 Map게열 인터페이스를 상속한 클래스로,
		 * 사용하는 메서드가 다르다.
		 * -데이터를 저장할때 key,value를 한쌍으로 저장하고, key를 통해 
		 * valuer가 저장된 위치에 접근하낟.
		 * -key 중복을 허용하지 않는다.
		 * 동일한 key값에 데이터를 저장하면, 마지막으로 추가된 value 값이 저장된다. 
		 */
		//key값의 자료형은 String 
		//Value값은 자료형은 Snack
		HashMap<String, Snack> hm = new HashMap<>();

		//1.put(K key,V value) : map공간에 key,value를 세트로 추가하는 메서드
		
		hm.put("다이제", new Snack("초코맛",800));//키값 중복으로 v 삭제
		hm.put("칸초", new Snack("초코맛",400));
		hm.put("두쫀쿠", new Snack("초코맛",450));
		hm.put("포테토칩", new Snack("감자맛",500));
		hm.put("다이제", new Snack("초코맛",900));
		
		System.out.println(hm);
		
		//2. Get(K key) : V->HashMap에서 kay와 일치하는 value값을 찾는 메서드
		System.out.println(hm.get("두쫀쿠"));
		
		//3. size(): 초기화된 데이터 수 반환
		System.out.println(hm.size());
		
		//4. replace( K key , V value)
		//-hashMap에서 key값과 일치하는 value값을 찾아 새로 전달된 value로 "교쳬"만 가능 
		//put은 교체 및 추가개념
		hm.replace("다이제",new Snack("고소한 맛",500));
		
		//5. remove (Key k) : Key값과 일치하는 값을 찾아서 제거하는 메서드
								//key와 value 전부 삭제
		hm.remove("다이제");
		System.out.println(hm.get("다이제"));
		
		System.out.println("=====================");
		//Map계열 데이터 반복문 돌리기
		//방법 1. keyset() 활용한 반복
		//keySet() : map의 키값들만 따로 set에 담아 반환해주는 메서드 
		Set<String> set =hm.keySet();
		for(String key : set) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		//방법 2.entrySet()을 활용한 반복
		//-맵의 key, value값이 담긴 entry를 set에 담아 반환해주는 메서드 
		Set<Entry<String, Snack>>entrySet = hm.entrySet();
		for(Entry<String, Snack> en : entrySet){
			System.out.println("key"+en.getKey());
			System.out.println("value"+en.getKey());
		}
		
	}
	
}
