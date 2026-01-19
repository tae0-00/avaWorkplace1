package com.kh.chap03_stream.part01_basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic {

	public static void main(String[] args) {
		/*
		 * 스트림(Stream)
		 * -데이터의 흐름, 스트림 내부의 데이터를 다른 스트림으로 보내고, 다시 보내는 식으로
		 * 무한한 홀므를 만ㄷ르어 낼 수있는 클래스 
		 * 
		 * 주로 컬랸션/배열의 요소들에 대한 데이터 처리시 많이 사용된다.
		 * -컬랙션의 데이터를 함수형 프로그래밍 스타일로 처리할수 있도록 지원하는 클래스
		 * -기존의 반복문이나 조건문을 활용하여 처리했던 다양한 작업들을 람다식을 통해 제엇가 가능하도록
		 * 다양한 메서드들을 정의해 두엇다
		 * -각종 자료구조(컬랙선 ,배열, 기본자료형)등 을 스크림을 통해 일관성있게 제어 할수 있도록 정의해두었다. 
		 * 
		 * 스트림의 연산메서드
		 * - 데이터를 처리하기 위한 중간 메서드와 최종 연산메서드가 존재한다.
		 * - 스트림의 데이터 처리과정 
		 *  1) 스트림 생성 및 초기화
		 *  2) 중간연산 n회 수행
		 *  3) 최종연산 1회 수행
		 * 
		 * 스트림의 특징
		 * -한번 사용한스트림은 재사용이 불가능하다
		 * -스트림은 최종연산 메서드가 호출되기 전ㄲ자ㅣ 실제 연산을 수행하지 않는다.(지연연산)
		 * -컬랙선을 통해 스트림을 변환한 경우, 기존 컬랙션의 데이터값을 변경하지 않는다.(깊은 복사) 
		 * 
		 * 스트림 객체 생성 방법
		 * 1) 배열을 통한 스트림 생성
		 * -배열을 선언 및 할다으, 초기화 수행 후 Array.Stream()호출
		 * 
		 * 2) 컬랙션을 통한 스트림 생성
		 * - 컬랙션 생서 ㅇ및 초기화 후 컬랙션.stram();
		 * 
		 */
		//1. 배열
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		IntStream intstram =Arrays.stream(arr);
		
		String [] sarr= {"아자스","야르","무지컬"};
		Stream<String> stream= Arrays.stream(sarr);
		
		//컬랙션을 통한 스트림
		ArrayList<Integer>list= new ArrayList<>();
		Stream <Integer> arrayStream =list.stream();
		
		Set<Integer> set= new HashSet<Integer>();
		Stream <Integer> setStream = set.stream();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Stream<String> mapStream= map.keySet().stream();
		
		//3. Stream 클래스를 통한 스트림 생성
		Stream<String> empty= Stream.empty();
		
		Stream<String> sStream = Stream.<String>builder().build();
		
		Stream<String> oStream = Stream.of("a","b","c","d");
		
		Stream<Integer>isStream = Stream.generate(()->1).limit(100);//내부에 100개의 1의 값이 생성
		
		Stream <Integer>is = Stream.iterate(1, i-> i+1).limit(100);
		//1부터 100까지 초기화했다된 데이터를 가진 스트림
		
		
		//기본자료형 스트림
		IntStream is3= IntStream.range(1, 5);//[1,2,3,4]
		IntStream is5= IntStream.rangeClosed(1, 5);//[1,2,3,4,5]
		
		//4. 파일스트림을 통한 스트림 생성
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
			Stream <String> lines = br.lines();
			lines.forEach(str->System.out.println(str));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		//스트링의 반복문
		//1) 배열의 반복뮨
		for(String str : sarr) {
			System.out.println(str);
		}
		//2) 스트림의 반복문
		//- forEach : 스틓림을 단순 반복 시 사용화는 최종 연산 메서드
		stream.forEach(str->System.out.println(str));
		
		//3) 배열을 통한 반복문으로, 배열 내부의 값들 중 2, 4의 배수인 값들의 함 구하기
		int sum =0;
		for(int i :arr) {
			if(i%2==0&&i%4==0) {
				sum +=i;
			}
		}
		//3-1 스트림을 통해 위 코드를 구현	
		//filter-> 조건식의 결과가 t/f가 나오는 람다식을 작성하는 중간연산 메서드
		IntStream is6= intstram.filter(num-> num%2==0)// 그 값을 남기는 메서드?
				.peek(num->System.out.println(num))//현재 사용중인 스트림값을 뽑는 메서드?
				.filter(num->num%4==0);
		
		//sum : 스트림 내부의 값을 모두 더해주는 : 최종 연산: 메서드
		
			int sum2=is6.sum();
			
			System.out.println("Sum2 : "+sum2);
			//
			
			
			
			
			
			
			
			
	}

}
