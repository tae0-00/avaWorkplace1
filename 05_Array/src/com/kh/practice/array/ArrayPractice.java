package com.kh.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int[] org = new int [10];
		int value =10; 
		for(int i=0; i<org.length; i++ ) {
			org[i]=value--;
			System.out.print(org[i]+ " ");
		}
		
	
	}
	public void practice100(){
		int [] arr = new int [10];
		int value = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=value--;
			System.out.print(arr[i]);
		}
		
	}
	public void practice200(){
		System.out.print("양 정수: ");
		int num =sc.nextInt();
		
		int [] arr = new int [num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]);
		}
	}
	
	public void practice300(){
		int [] arr= new int [10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print("\n"+ arr[i]);
		}
		
	}
	
	
	public void practice400(){
		
		String [] arr = {"월 " , "화","수","목", "금","토", "일" };
		
		System.out.print( " 0~6");
		int num =sc.nextInt();
		
		if (num<0 || num>6) {
			System.out.println("잘못 입력");
			return;}
		for(int i=0; i<arr.length; i++) {
			
			//fo문에 프린하면 배열의 길이 만큼 다 프린트 되니까 한번 출력은 포문 밖에서,,
		}	
		System.out.println(arr[num]+"요일");
		
	}
	
	public void practice500(){
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		int [] arr= new int [num];
		int sum=0;
		for(int i=0; i <arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
			sum += arr[i]; 
			
		}
		System.out.println("\n종합 : "+ sum);
	}
	
	public void practice600(){
		
//			문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			System.out.print("문자열 : ");
			String str = sc.next();
			char[] arr = str.toCharArray();
			
			System.out.print("문자열에 있는 문자 : ");
			int count = 0;
			// 전체 문자 반복
			for(int i =0; i< arr.length; i++) {
				char ch = arr[i]; // 중복인지 검사하고자 하는 문자.
				
				// 문자 중복 검사
				// 현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인.
				boolean isDup = false;
				for(int j = 0; j<i; j++ ) {
					if(ch == arr[j]) {
						// 중복
						isDup = true;
						break;
					}
				}		
				if(!isDup) {
					System.out.print(ch+", ");
					count++;
				}
			}
			System.out.println("\n문자 개수 : "+count);
//			문자의 개수와 함께 출력하세요
		

	}
	public void practice601(){
		System.out.print("문자열 : ");
		String str= sc.next();
		
	}
	
	
	
	public void practice2(){
		System.out.print("양의 정수:" );
		int num =sc.nextInt();
		
		
		int [] org = new int [num];
		
		for( int i=0; i<org.length; i++) {
			org[i]=i+1;//1을 추가한 이유는 1부터 입력받은 값을 구해야해서
			System.out.print(org[i] + " ");
		}
	}
	public void practice3() {
		
		
		int [] org = new int[10];
	
		for(int i=0; i<org.length; i++) {
			org[i]=(int)(Math.random()*10+1);
			
			System.out.print(org[i]+" "); 
		}
		//System.out.println(Arrays.toString(j));
		}
		
		
		

	
	
	public void practice4() {
		
		String [] org = { "월","화","수","목","금","토","일"};
		System.out.print("\n0~6 사이의 숫자 입력:");
		int num =sc.nextInt();
		
		if(num>6|| num<0) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
			
			System.out.println(org[num]+"요일");
			// org 배열에 num의 값인 자리의 숫자를 넣었을때 나오는 값
						
		}
	 public void practice5(){
		 System.out.print("정수");
		 int num=sc.nextInt();
		 
		 int [] arr = new int[num];
		
		 for( int i=0; i<arr.length; i++) {
			 arr[i]=sc.nextInt();
		 }
		 for( int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]);
			 sum+=arr[i];
		 }
	 }	
	 
		
	 public void practice6(){
		 //전체문자 반복
		 //중복인지 검사하고자 하는 문자
		 
		 //현재 위치에서 앞쪽의 단어들 중 현재 단어와 일피하는 값이 있는지 확인
		 //중복이 아닌 애들이 구해뎠을때만 카운트를 더함 
		 
	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
