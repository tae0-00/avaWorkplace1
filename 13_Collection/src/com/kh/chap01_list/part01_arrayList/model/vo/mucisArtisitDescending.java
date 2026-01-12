package com.kh.chap01_list.part01_arrayList.model.vo;

import java.util.Comparator;

public class mucisArtisitDescending implements Comparator<music>{

	@Override
	public int compare(music o1, music o2) {
		//1.오름차순 정렬조건
		//o1 비교메서드 o2
		
		//2. 내림차순
		//o2. 비교메서드 o1
		
		//o1,o2은 위에 있음 
		return o2.getArtist().compareTo(o1.getArtist());
		
		
	}


	
}
