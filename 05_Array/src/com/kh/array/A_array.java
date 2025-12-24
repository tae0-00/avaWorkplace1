package com.kh.array;

import java.util.Arrays;

public class A_array {
	/*
	 * 변수란 하나의 공간에 하나의 값을 저장할수 있는 저장공간이다.
	 * 		int a =10;
	 * 		
	 * 배열: 하나의 공간에 여러가지의 값을 담을 수 있다.("같은 자료형" 기준)
	 * 		ex) int[a] = new int[3];
	 * 		int 자료형값을 담을 수 있는 저장공간이 3칸 할당된다. 4바이트 x 3 만큼 저장공간 사용??
	 * 		[ 0,0,0]
	 * 		배열에서 저장된 데이터를 꺼낼떄는 "인덱스를 "를 활용하며 인덱스값은 0부터 시작.
	 * 		arr[0], arr[1], arr[2]
	 * 		배열의 크기 만약 5, 배열의 마직막 인덱스는 4
	 * 		배여르이 크기가 n이라면, 해당배열의 마지막은 항상 n-1 
	 * 여러가지의 값을 관린하기 위해 사용
	 */
	public void method1() {
		/* 배열 선언 
		 * 자료형[] 배열명;
		 * 자료형 [] ;
		 */
		int a; 
		int [] arr;
		int arr2 [];
		
		/*
		 * 배열 할당
		 * -이 배열에 몇 개의 값들을 보관할지, 그 배열의 크기를 지정해주는 과정
		 * -크기는 지정해주면, 지정한 갯수만틈 저장공간을 가진 배열이 생성
		 * 
		 * [표현법]
		 * 배열명 = new 자료형 [배열크기];
		 * 	
		 */
		arr =new int[5];// 할당 완료
		int [] arr3 = new int[5];
		
		System.out.println(arr3 [0]);
		
		arr3[0]=1;
		arr3[1]=2;
		arr3[2]=3;//[1,2,3,0,0]
		
		
		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		System.out.println(arr3);// 주소값으로 나옴 참조형변수
			
	}
	public void method2() {
		int num =10; //변수는 스택에 저장됨
		
		int [] iarr = new int[5];
		
		System.out.println("iarr :" + iarr);// 배엘에 저장한 값이 아닌 주소값이 나옴 
		System.out.println("iarrdml Hash Code:"+ iarr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 코드
		
		int []arr2 = new int[5];//[0,0,0,0,0]
		System.out.println("arr2dml Hash Code:"+ iarr.hashCode());
		
		int [] arr3 = arr2;
		System.out.println("iarrdml Hash Code:"+ iarr.hashCode());
	}
	public void method3() {
		
		int[]iArr =new int[5];
			for( int i=0; i<5; i++){
			
			//5대신에 길이 .랭스를 집어 넣기
			iArr[i]= i;
			}
	}
			public void method4() {		
				int re =0;
				//문자열 초기화
				String str ="";
				//배열 초기화
				int[]arr =null;
			//null은 모든 참고변수의 기본값
				//단, 참고자료가 null을 저장한 상태에서 주소값이ㅣ 있어야 수핼할수 맀는
				//행위를 코드로 입력하면 에러 남
				
				
				
				
				
			}
		
			public void method5() {	
				/*
				 * 
				 * arr [0] =2;
				 * arr [1] =4;
				 * arr [2] =6;
				 * arr [3] =8;
				 * arr [4] =10;
				 * 
				 * 1. 반복문을 활용하여 배열 최기화하기ㅑ
				 * 
				 * 2. 초기화 왼료된 배열을 반복문을 활용하여 내부애 정장된 값을 출력
				 * 출력형식 : 10 8 6 4 2
				 * 
				 */
				int [] arr = new int[5];
				  int value =2 ;
				  for(int i=0; i< arr.length; i++) {
					  System.out.print(i+" ");
					  
				  }
				  //int [] iArr = null;
				  System.out.println(" ");
			}
		
		
			public void method6() {	
				int [] arr = new int[5];
				
				//배열의 크기를 벗어난 인덱스 제시시 제러 발생
				//배열은 한번 지정한 크기를 변경할 수없다
				//배열의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야한다. 
				
				arr= new int[6];
				arr[5]=12;//기존 0~4의 인덱스값은 0으로 돌아간다. 
				//복사가 필요함
				
			}
			public void method7() {	
				//배열의 선어느 할당, 초기화 한번에 수행하는 법
				//방법 1.
				int[ ]arr1 =new int[] {1,2,3,4};// [1,2,3,4]
				//방법2
				int []arr2= {1,2,3,4};
			
			}
			public void method8() {	
				//문자열을 문자배열로 만드느 법
				
				//방법1/
				String str ="merry";
				char[]arr =str.toCharArray();//[m e rr y]
				
				//방법2/
				char[]arr2 =new char[str.length()];
				for(int i=0; i<arr2.length; i++) {
					arr2[i]=str.charAt(i);
				}
				System.out.println(Arrays.toString(arr));//Arrays.toString(배열)배열내부의 값을 문자열로 변환 하는 메서드
				System.out.println(arr2);
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	
}
