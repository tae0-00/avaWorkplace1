package com.kh.practice.chap01_poly.controller;



import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {

	private Member  mem;
	private Book [] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	public LibraryController() {
		
	}
	public void insertMember(Member mem) {
		this.mem=mem;
		}
		
	
	public Member myInfo() {
		return this.mem;
		
	}
	public Book[] selectAll() {
		return bList;
		
	}
	public Book[] searchBook(String keyword) {
		Book [] bArr= new Book[5];
		int count = 0;
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)){//같은게 아니라 포함하고 있는 개념이라 컴테인 사용
				bArr[count++]=bList[i];
			}
		}
		return bArr;
	}
	public int rentBook(int index) {
		int result= 0;
		Book book= bList[index];//를 사용해야함 
		
		//b instanceof AniBook;//instanceof는 boolean을 반환 그래서 보통 조건식에 사용
		//아니면 booiean자료형에 담아서 사용할수 있긴 함
		if(book instanceof AniBook) {
			AniBook ani = (AniBook) book; 
			if(mem.getAge()<ani.getAccessAge()) {
				result=1;
			}
		}
		if(book instanceof CookBook) {
			CookBook cb = (CookBook)book;
			if(cb.isCoupon()==true) {
			mem.setCouponCount(mem.getCouponCount()+1);//이게 음 카운트에 카운트를 넣어야함 
				result = 2;
				//이거 안돼,,, 
			}
		}
		
		return result;
//		for(int i=0; i<bList.length;i++) {
//			if(bList[i] instanceof AniBook) {
//			  AniBook ani = (AniBook)bList[i];
//			  if(mem.getAge()<ani.getAccessAge()) {
//				  result =1;
//			  }
//			}
//		}
//		for(int i=0; i<bList.length;i++) {
//			if(bList[i] instanceof CookBook) {
//				CookBook cb = (CookBook)bList[i];
//				if(cb.isCoupon()==true) {
//				int num=mem.getCouponCount()+1;
//				num+=1;
//				result =2;
//				
//				}
//			}
//		}
//		return result;
//		}
		//이거는 포문으로 하면 안되는건가??
	}
			
}	
	

