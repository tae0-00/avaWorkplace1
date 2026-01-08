package com.kh.practice.charCheck.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		
	}
	public int  countAlpha(String s)throws CharCheckException{
		
		int count=0;
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열에 공백이 포함되 있습니다. ");
			}
		//z캐릭터 배열로 바꾸는거
		//char [] arr =s.s.toUpperCase().toCharArray();
		for(int i=0; i<s.length(); i++ ) {
			char ch = s.charAt(i);
			if((ch>='a'&& ch<='z')|| (ch>='A'&&ch<='Z')) {
				count++;
			}
			}
		 return count;
		}
	}
	
