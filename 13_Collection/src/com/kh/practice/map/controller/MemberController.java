package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController <K, V>  {
	private HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		boolean b=false;
		if(id.isEmpty()) {
			map.put(id, m);
			b= true;
		}
		return b;
		
	}
	public String logIn(String id ,String password ) {
		
	}
	public boolean changePassword(String id, String oldPw, String newPw ) {
		
	}
	public void changeName(String id, String newName) {
		
	}
	public TreeMap<K, V>sameName(String name){
		
	}

}
