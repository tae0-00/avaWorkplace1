package com.kh.chap03_stream.part02.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {

	/*
	 * 스트림의  중간연산 및 최종연산 메서드들
	 * 
	 * 중간연산 메서드
	 * 1) distinct : 중복값 제거
	 * 2) fliter : 내부요소 필터링
	 * 3) map : 데이터 반환
	 * 4) peek : 중간 확인 메서드 
	 * 5) sort : 정렬 메서드 
	 * ...
	 * 
	 * 최종연산 메서드들 
	 *  1) Iterating 계열 : forEach
	 *  
	 *  2) Collectiong 계열 : collect(Collectior.메서드)
	 * ->스트림 내부 요소를 내가 원하는 계열의 컬랙션으로 반환 
	 * 
	 *  3) Calculating 계열 : min ,max, sum ,average 등
	 *  -> 산술연산 관련된 최종 처리 메서드들(기본자료형스트림에서만 존재)
	 *  
	 *  4) Matching : AnyMatch, all Matchnone, noneMatch
	 *  -> 스트림 내부 요소애서 특정 조건을 만족하는 요소를 선택하기 위해 사용
	 *  
	 *  5) REduction 계열 : reduce메서드를 통해 요소 내부의 값을 다양한 방법으로 연산 후 결과겂을 반환하는 메서드
	 *  Calculating 계열에서 제공하지 않는 연산기능을 수행할때 사용한다. 
	 */
	//중간연산 메서드(distinct, filter, forEach)
	public static void main(String[] args) {
		
	
	List <Integer> list = Arrays.asList(1,2,3,4,7,6,4,7,6,5,8,5,7,5);
	Stream<Integer> stream= list.stream();

	stream.distinct().filter(i->i%2==0).forEach(i-> System.out.println(i));
	String [] names = {"김태경", "김성규","코난","남도일","초난강","김선호"};
		
	Arrays.stream(names).filter(name->name.startsWith("김")).forEach(System.out::println);
	//2) map: 현재 스트림요소를 다른 요소로 바꾸는 메서드
	List<Integer>list2=Arrays.asList(1,2,3,4,5);
	
	list2.stream().map(i->i+"!")//Stream<String>으로 변함
	.forEach(i->System.out.println(i));
	
	//3) map2(Int, Double, Long) :Stream을 기본 자료형스크림으로 변결해주는 메소드 
	Arrays.stream(names).mapToInt(name->name.length()).forEach(System.out::println);
	
	
	
	//4. Collect 계열 매서드
	list2.stream().map(i->i*100).collect(Collectors.toList());
	
	//4-1 Collection.ToList() : 스트림의 데이터를 문자열로 ㅂ변경
	
	
	
	//4-2 Collection.Toset() : set으로 변경
	List<Integer> list4= Arrays.asList(1,2,3,4,5,6,7,8);
	Set set = list.stream().collect(Collectors.toSet());
	
	System.out.println(list4);
	
	//4-3
	//Collection.toMap(Function, Fuction): 스트림의 결과를 map으로 
	Map<Integer, String >re2= list4.stream().distinct().collect(Collectors.toMap(i->i, i->"#"+"#"));
	

	//5) Calculating 계열
	//-산술연산시 사용하는 메서드들로 기본자료형 스트링에 존재
	//5-1 녀ㅡ()
	int sum = IntStream.rangeClosed(1, 100).sum();
	
	double avg = DoubleStream.iterate(1, i->i+1).limit(100).average().getAsDouble();//
	
	//3) summaryStatics : 스트림 요소의 통계값을 가진 객체를 반환해주는 메서드
	//통계값 -> 총 개숫, 합, 평균, 최소, 최대 값 반환
	IntSummaryStatistics summary =
			IntStream.of(32,50,19,40,55,17,28).summaryStatistics();
	System.out.println(summary);//.get해서 내가 원하는 값만 출력도 가능
	
	//6. Reducyion 계열
	// reduce (초기값, 초기값을 다루는 람다식)
	int re=
	Arrays.asList(1,2,3,4,5,6,7,8,9,10)
	.stream()
	//첫번째 매개변수 : 초기값을 저장하는 변수
	//두ㅂ번째 매개변수 : 스트림 내부 요소
	.reduce(0,(sum2, n)-> {
		System.out.println("sum2에 저장된 ㄷ값 ="+sum2);
		System.out.println("n에 저장된 ㄷ값 ="+n);
		return sum2 + n;
	});
	System.out.println(re);
	
	int re4= Arrays.asList(1,2,3,4,5,56,6,7,8,9,10).stream().reduce(0, (max,n)->{
		return max< n ? n : max;
	});
	System.out.println(re4);
	
	
	class Member{
		String name;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + "]";
		}
		
	}
	
	List<Member> arr = Arrays.asList(
			new Member("홍길동", 35),
			new Member("신사임당", 40),
			new Member("세종", 45),
			new Member("홍난파", 80),				
			new Member("전달력", 69));	
			
			//Member 객체배열에서 최고령자 구하기.
		Member maxage= arr.stream()
		//초기값 생략시 스트림의 첫번째 요소가 초기값으로 들어간다.
		.reduce((m1,m2)->{
			return m1.age<m2.age? m2: m1;
		}).get();
		
		//초기값을 ㅅ생략하는 경우 반환형이 욥션널?그러면 내가 직접 예외처리해줘야함 get사용 아니면 초기값에 null넣기
		System.out.println(maxage);
	
		//Member 객체배열 arr에서 모든 회원 나이 합 구하기
		int sumage= arr.stream().map(m->m.age)//Member-> age로 변환??
				.reduce(0, (sum3, age)->{
			return sum3+age;
					
		});
		
		//7) Match 계열
		// anyMatch
		//- 스트림의 요소들 중 하나라도 true가 나어면 true
		boolean bool =Arrays.asList("1","2","c","d4").
				stream().anyMatch(str->str.startsWith("d"));
		System.out.println(bool);
		
		//noneMatch : 스트림의 요소가 모두 false면 true를 반환
		bool =Arrays.asList("홍길동", "123","가나다").stream().noneMatch(s->s.length()>4);
		
		//3) allMatch : 스트림의 모든 요소가 true인 경우 true
		bool=Arrays.asList("홍길동", "123","가나다").stream().allMatch(str->str.length()<=3);
		
		//4. findFirst : 스트림 요서중 조건을 만족하는 첫번째 요소를 찾은 후 반환
		String str= Arrays.asList("홍길동","1111","1111","1가나아").
				stream().filter(str2->str2.startsWith("1")).findFirst().get();//이경우에는 
		System.out.println(bool);
		System.out.println(str);
		
		//5) findAny :스트림 요소가 하나라도 존재한다면, 해당 요소를 즉시 반환
		str= Arrays.asList("홀기롣ㅇ", "1234", "ㄵㄷㄹㄴㄹㅈㄷ").
				stream().filter(s->s.length()<=4).findAny().get();
		System.out.println(str);
	}
}
