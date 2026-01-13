package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController  {
	private HashMap<String ,Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		
		if(id.isEmpty()) {
			return false;
		}
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);//여기서 id가 key가 됨
		return true;
		
	}
	public String logIn(String id ,String password ) {
		
		if(map.containsKey(id)) {
			Member m= map.get(id);//지금 이게 put("",new member("",""))같은의미?
			if(m.getPassword().equals(password)){
				return m.getName();
			}
		}
			return null;
	}
	public boolean changePassword(String id, String oldPw, String newPw ) {
		if(map.containsKey(id)) {
			Member m= map.get(id);
			if(m.getPassword().equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	public void changeName(String id, String newName) {
		Member m =map.get(id);
		m.setName(newName);
		
	}
	public TreeMap<String ,Member>sameName(String name){
		
		TreeMap<String ,Member> sn =new TreeMap<String, Member>();
		Member m = map.get(id);
		Set<String ,Member> set=sn.keySet();
		//if(map.get(name).equals(name)) 이건안되는대 아이디 어딧냐
		
		
		
		
			
		
	}

}
