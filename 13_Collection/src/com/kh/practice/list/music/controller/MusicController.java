package com.kh.practice.list.music.controller;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.music;
import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List list = new ArrayList<Music>();

	public MusicController() { 
		
	}
	
	public int addList(Music music) {
		try {	
		list.add(music);
			return 1;
		}catch (Exception e) {
			return 0;
		}
	}
	public int addAtZero(Music music) {
	try {
		list.add(0,music);
		return  1;
	}catch (Exception e) {
		return 0;
	}
}
	public List printAll () {
	
		return list;
}
	public Music searchMusic(String title) {
		Music m=  null;
		for(Object o :list) {
			Music music = (Music) o;
			if(music.getTitle().equals(title)) {
				m= music;
				break;
			}
		}
	return m;
}
	public Music removeMusic(String title) {
		Music m=  null;
		
		for(int i=0; i<list.size();i++) {
			Music music = (Music)list.get(i);
			if(music.getTitle().equals(title)) {
				m= music;
				list.remove(i);
			}
		}
		//방법 2
		//Object o= searchMusic(title);
		//m=(Music)o;
		//list.remove(o);
		
		
		return m;
}
	public Music setMusic(String title, Music music) {
		try {
		int ind =-1;
		Music re = null;
		for(int i=0; i<list.size();i++) {
			Music m = (Music)list.get(ind);
			if(m.getTitle().equals(title)) {
				ind=i;
				re = m;
				break;
			}
		}
		list.set(ind, music);
		return re;
		}catch(Exception e) {	
		return null;
		}

}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		
		return 1;
}
	public int descSinger() {
	Collections.sort(list);
	return 1;
}

}
