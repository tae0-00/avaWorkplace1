package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member  mem;
	private Book [] bList = new Book[5];
	
	
	
	public LibraryController() {
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	public void insertMember(Member mem) {
		for(int i=0; i<bList.length; i++ ) {
			bList[i].
		}
		
	}
	public Member myInfo() {
		for(int i=0; i<bList.length; i++ ) {
			
			
		}
		
	}
	public Book[] selectAll() {
		for(int i=0; i<bList.length; i++ ) {
			bList[i].
	}
	public Book[] searchBook(String keyword) {
		
	}
	public int rentBook(int index) {
		
	}
}
