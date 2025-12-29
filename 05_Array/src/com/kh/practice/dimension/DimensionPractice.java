package com.kh.practice.dimension;

import java.util.Arrays;

public class DimensionPractice {

	public void practice1(){
		/*
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고
인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
ex.
(0, 0)(0, 1)(0, 2)
(1, 0)(1, 1)(1, 2)
(2, 0)(2, 1)(2, 2)
		 */
		String[][] arr= new String [3][3];
		String str= "("+0+","+0+")";
	    char ch = str.charAt(1);
	    char ch1 = str.charAt(3);
	    
		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			
			
		
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));	

		}
	}
	public void practice2(){
		int [][] arr= new int [4][4];
		int v=0;
		for(int i= 0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=1+v++;
			}
		}	
		for(int i= 0; i<arr.length; i++ ) {
			System.out.println(Arrays.toString(arr[i]));	
		}	
	}
	 public void practice3(){
		 int [][]arr =new int  [4][4];
		 int v=1;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j]=v--;
			 } 
		 }
		 for(int i= 0; i<arr.length; i++ ) {
				System.out.println(Arrays.toString(null));
	 }
}
