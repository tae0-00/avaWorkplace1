package com.kh.array;

public class A_array {
	/*
	 * 변수란 하나의 공간에 하나의 값을 저장할수 있는 저장공간이다.
	 * 		int a =10;
	 * 		
	 * 배열: 하나의 공간에 여러가지의 닶을 담을 수 있다.("같은 자료형" 기준)
	 * 		ex) int[a] = new int[3];
	 * 		int 자료형값을 담을 수 있는 저장공간이 3칸 할당된다. 4바이트 x 3 만큼 저장공간 사용??
	 * 		[ 0,0,0]
	 * 		배열에서 저장된 데이터를 꺼낼떄는 "인덱스를 "를 활용하며 인덱스값은 0부터 시작.
	 * 		arr[0], arr[1], arr[2]
	 * 		배열의 크기 만약 5, 배열의 마직막 인덱스는 4
	 * 		배여르이 크기가 n이라면, 해당배열의 마지막은 항상 n-1 
	 * 
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
}
