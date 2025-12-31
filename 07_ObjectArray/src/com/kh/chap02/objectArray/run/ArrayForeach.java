package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phon;

public class ArrayForeach {

	public static void main(String[] args) {

		int []arr  = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//basic loop
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		//개선된 향상된 반복문 advanced loop/ foreach
		/*
		 * for each문
		 * -배열 또는 컬렉션과 함꼐 사용된 ㄴ반복문으로 배열 또는 컬략션의 
		 * 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근할떄 사용
		 * 
		 * 초기식 조건식 증감식 없음 !!!
		 * 
		 *  반복횟수는 배열의 크기.
		 *  [표현법]
		 *  for( 순차적으로 접근한 값을 담을 변수 : 배열명) {
		 *    //반복적으로 실행할 내용 
		 *  }
		 *  
		 *  
		 */
		int[] arr2 = {10,20,30};
		for(int a:arr2) {
			System.out.println(a);
		}
		Phon[] phones= new Phon [3];
		
		phones[0]=new Phon("갤럭시","삼성","노트11",15000);
		phones[1]=new Phon("아이폰","애들","11프로",13000);
		phones[2]=new Phon("갤럭시","삼성","노트12",17000);
		
		//int [] phones2 = {15000,13000,17000}; 따로만들지 않음
		
		//총 합
		int sum=0;
		for( Phon p : phones) {
			sum+=p.getPrice();
			System.out.println("총합은:"+ sum);
		}
	}

}
