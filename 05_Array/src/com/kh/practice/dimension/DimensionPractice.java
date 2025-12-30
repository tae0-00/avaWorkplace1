package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
Scanner sc = new Scanner(System.in);
	

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
		
		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			arr[i][j]="("+i+","+"j"+")";
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));	

		}
	}
	public void practice2(){
		int [][] arr= new int [4][4];
		int v=1;
		for(int i= 0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=v++;
			}
		}	
		for(int i= 0; i<arr.length; i++ ) {
			System.out.println(Arrays.toString(arr[i]));	
		}	
	}
	 public void practice3(){
		 int [][]arr =new int  [4][4];
		 int v=16;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j]=v--;
			 } 
		 }
		 for(int i= 0; i<arr.length; i++ ) {
			 System.out.println(Arrays.toString(arr[i]));
				}
	 }

		public void practice4() {
	
		 int [][]arr =new int [4][4];
		
		 for(int i =0;i<arr.length-1; i++ ) {
			 for(int j =0; j<arr[i].length-1; j++) {
				 arr[i][j] =(int)(Math.random()*10+1);
				 arr[i][3]+= arr[i][j];
				 arr[3][j]+= arr[i][j];
				 arr[3][3]+= arr[i][j]*2;
				
		 }
		 }
		 for(int i =0;i<arr.length; i++ ) {
			 System.out.println(Arrays.toString(arr[i]));
		 }
		}
		
		public void practice5() {
		int hang;
		int yeol;
		while(true) {	
		 System.out.print("행크기 : " );
		  hang = sc.nextInt();
		
		 if(hang>0&&hang<10) {
			 break; }
			 System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다. ");
			}
			 
		 while(true) {
		 System.out.print("열 크기 : ");
		 yeol = sc.nextInt();
		
		 if(yeol>0&&yeol<10) {
			 break;
		 }
			 System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다. ");
			}
		 
		 char [] [] arr= new char [hang][yeol];
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0;j<arr[i].length; j++) {
				 char random= (char)(Math.random()*26+'A');
				 arr[i][j]= random;
				 
			 }
		 }
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(Arrays.toString(arr[i]));
		 }
	 }
		
		public void practice6() {
			String [][] strarr = new String [][]
					{{"이","까","왔","앞","힘"},
					{"차","지","습","으","냅"},
					{"원","열","니","로","시"},
					{"배","심","다","좀","다"},
					{"열", "히", "! ", "더", "!! "}};
			
			for(int i=0; i<strarr.length; i++) {
				for(int j=0; j<strarr[i].length; j++) {
					
				}
			}
			for(int i=0; i<strarr.length; i++) {
				for(int j=0; j<strarr[i].length; j++) {
					System.out.print(strarr[j][i]+ " ");
				}
		}
		} 
		public void practice7() {
			System.out.println("행의 크기 : ");
			int hang = sc.nextInt();
			
			
			char [][]arr=new char[hang][];
			
			for(int i=0; i<arr.length; i++) {
				while(i<arr.length) {
				System.out.print(i+ "행의 열 크기 :");
				int yeol = sc.nextInt();
				
				
				}
			}
		}
}
