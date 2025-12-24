package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
			/*
			 * 배열복사
			 * -얕은 복사 :배열의 주소값만을 복사한다.
			 * -얘는 변경을 하면 복사한 1 번 2번의 값들 또한 같이 변경
			 * -깊은 복사 :동일한 새로운 배열을 하나 '생성'하여 "내부의 값들"까지 생성하는 복사 개념
			 * =얘는 수정을 하면 수정한 1번만 수정 2번에 변경은 없음
			 */
			public void method() {
				int[]origin = {1,2,3,4,5};
				
				System.out.println("원본배열");
				
				for( int i= 0; i<origin.length;i ++) {
					System.out.print(i + " ");
				}
				//얕은 복사
				int copy [] = origin;
				System.out.println("복사 배열 출력");
				for (int i =0; i <copy.length; i++) {
					System.out.print(i + " ");
				}//수정하면 둘다 바뀜
				System.out.println();
		
	}//깊은 복사1
			public void method2() {
		//1. for문을 활용
		//
				int[] origin = {1,2,3,4,5};
				int[]copy = new int[origin.length];
				
				for(int i=0; i< copy.length; i++) {
					copy[i]=origin[i]; 
				}
				}
			public void method3() {
				//깊은 복사 2
				//새로운 배열 생성 후 system클래스의 arraycopy 복사
				
				int[] origin = {1,2,3,4,5};
				int[] copy = new int [10];
				
				//system.arraycopy(원본배열, 원본배열의 복사를 시작할 인덱스, 복사본 배열, 
									//복사본 배열의 복사를 시작할 인덱스, 복사할 갯수
				
				
				//1번 001234500
				//2번 012300000
				//3번 034500000
				
				//System.arraycopy(origin, 0, copy, 0, 5);
				System.arraycopy(origin, 0, copy, 2, 5);
				System.arraycopy(origin, 0, copy, 1, 3);
				System.arraycopy(origin, 2, copy, 1, 3);
				
				
				System.out.println(Arrays.toString(copy));
				
			}
			public void method4() {
				//깊은 복사3 
				//3. Arrays 클래스의 copyOf메소드 사용
				
				int[] origin = {1,2,3,4,5};
				
				//Arrays.copyOf(원본배열명, 복사할 개수)
				
				int [] copy =Arrays.copyOf(origin, 5);//복사본 개수== 복사본 배열의 크기
				
				System.out.println(Arrays.toString(copy));
				
			}
			public void method5() {
				//4. clone메서드를 사용한 복사
				
				int [] or= {1,2,3,4,5};
				int [] copy =or.clone(); //인덱스 지정 없음 복사할 갯수지정 없음
				// 원본과 정확히 똑같은 배열을 깊은 복사 하고싶을 때
				
				System.out.println(Arrays.toString(copy));
				
				
				
			}
}
