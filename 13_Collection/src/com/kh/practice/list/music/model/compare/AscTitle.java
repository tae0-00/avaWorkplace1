package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {

		//result 변수 만들어서 
		if(o1.getTitle().equals(o2.getTitle())) {
			return o1.getSinger().compareTo(o2.getSinger());
		}
		else {
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
		//o2.getSinger().compareTo(o1.getSinger());
		
		
	}

}
