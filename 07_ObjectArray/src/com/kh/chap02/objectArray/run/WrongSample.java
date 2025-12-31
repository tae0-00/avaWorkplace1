package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phon;

public class WrongSample {

	public static void main(String[] args) {

		Phon[] arr= new Phon[3];
		
		//잘못도된점 
		//1.i의 범위가 잘못되었다. 
		//2. arr배열에 객체가 초기화 되지 않음
		//  -변수가 null을 가지고 있는 상태에서 주소값이 있을때만 수행가능한 어떤 행위를 수행하는 경우 (NPE)발생
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}

}
