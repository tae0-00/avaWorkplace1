package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static int SIZE =10;
	private Member[] m =new Member[SIZE];
	
	//필드에 카운트를 추가하면 카운트에 계속 정보를 담고 있어서 더 편함
	public MemberController() {
		
	}
	public int existMemberNum() {//틀림
		int count =0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null) {
			count++;
			}
		}
		return count;
	}
	
	public boolean checkId (String inputId) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	public String insertMember(String id, String name,String password,
			String email,char gender,int age) {
		
		for(int i=0; i<m.length; i++) {//여기서는 향상된 반복문 쓰면 안돼
			if(m[i]==null) {
				m[i]=new Member(id, name, password, email, gender ,age);
				
				break;
			}
		}
		return " ";
		
	}
	public String searchId(String id) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}
	public Member [] searchName(String name) {//이름은 동명이인일수 잇어서 배열을 사용
		//
		int count =0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getName().equals(name)) {
				count++;
			}
		}
		if(count==0) {
			return null;
		}
		
		Member [] arr = new Member[count];
		int num=0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getName().equals(name)){
				arr[num]=m[i];
				num++;
			
			}
		}
		return arr;
	}
	public Member[] searchEmail(String email) {
		int count =0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getEmail().equals(email)) {
				count++;
			}
		}
		if(count==0) {
			return null;
		}
		int num=0;
		Member [] arr= new Member [count];
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null && m[i].getEmail().equals(email)) {
				arr[num]=m[i];
				num++;
			}
		}
		return arr;
	}
	public boolean updatePassword(String id, String password) {
		/*int count=0;
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&& m[i].getId().equals(id)) {
				count++;
			}
		}
		if(count==0) {
			return false;
			지금 이건 중복임 필요없음
		}*/
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getId().equals(id)){
				//여기서 이제 비밀번호를 수정해야하는데,,
				m[i].setPassword(password);
				return true;//이 안에 리턴이 있어야 됨 아이디 같고 수정되면 그냥 바로 이 메서드 탈출해도 되니까
			}
		}
			return false;
	}
	public boolean updateName(String id, String name) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&&m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	public boolean updateEmail(String id, String email) {
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&& m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	public boolean delete(String id) {// 배열초기화는 향상 반복문 쓰면 안돰
		for(int i=0; i<m.length; i++) {
			if(m[i]!=null&& m[i].getId().equals(id)) {
				m[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {// 배열초기화는 향상 반복문 쓰면 안돰
		for(int i=0; i<m.length; i++) {
			m[i]=null;
			//m= new Member[Size]로 해도 됨 
		}
	}
	public Member[] printAll() {
		return m;
	}
}