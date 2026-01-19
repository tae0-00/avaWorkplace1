package com.kh.chap03_stream.practice;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	 static class Student{
	        String name;
	        int age;
	        int score;
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
	        public int getScore() {
	            return score;
	        }
	        public void setScore(int score) {
	            this.score = score;
	        }
	        public Student(String name, int age, int score) {
	            super();
	            this.name = name;
	            this.age = age;
	            this.score = score;
	        }
	        @Override
	        public String toString() {
	            return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	        }
	    }
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1,6,2,3,3,4,4,11,9,10);
	        List<String> strlist = Arrays.asList("a" , "a", "b", "b","c","c","d","e","f","g");
	        List<Student> slist = List.of(new Student("홍길동",15, 100),
	                                    new Student("강감찬",16, 80),
	                                    new Student("이순신",25, 80),
	                                    new Student("김말똥",29, 90),
	                                    new Student("아무개",23, 70));
	        String[] wordArr = { "a b c d", "홍 길동", "h el lo wor ld" };
	        IntStream dan = IntStream.range(1, 10);
	        // 1. list에서 중복을 제거한 후 짝수만 출력하는 프로그램을 만드시오.(스트림활용)
	        //    결과 : 6 2 4 10
	       list.stream().distinct().filter(num->num%2==0)
	    		   .forEach(System.out :: println);
	      
	       
	       // 2. list에서 중복을 제거한 후 값이 5 이상이면서 홀수를 오름차순 출력 하는 프로그램
	        //결과 : 9 11
	       list.stream().distinct().filter(num-> num>=5 && num%2!=0).sorted()
	       .forEach(System.out::println);
	       
	       
	       // 3. list에서 각 요소에 3을 곱한후 오름차순 출력하는 프로그램
	        // 3 6 9 9 12 12 18 27 30 33
	       list.stream().map(num->num*3).sorted().forEach(System.out::println);
	    	   
	      
	        // 4. strlist에서 각 문자를 대문자로 변경한 후 List로 반환하는 프로그램
	        //[A, A, B, B, C, C, D, E, F, G]
	       strlist.stream().map(num->num.toUpperCase()).collect(Collectors.toList());
	       
	       //->> 리스트로 반환하는건 toList 메소드 사용 이외에도 TOString 등 사용 잊지말자, 
	       //>>한개의 메소드에서는 그 메서드에세 주워진 코드만을 실행한다. 
	       
	       
	        // 5. strlist에서 중복값을 제거후 각 문자를 하나의 문자열로 합쳐서 반환해주는 프로그램
	       strlist.stream().distinct().collect(Collectors.joining());
	        //abcdefg
	       
	       
	        // 6. slist에서 학생의 이름과 나이를 학생이름기 오름차순 정렬하여 출력.
	        // 이름: 나이
	        //강감찬 : 16 김말똥 : 29 아무개 : 23 이순신 : 25 홍길동 : 15
	   //   slist.stream().sorted(s->s.)
	        // 7. slist에서 20살 이상인 학생의 평균점수를 구하는 프로그램
	        // 80.0
	       double re= slist.stream().filter((s->s.age>=20).
//	      System.out.println(score);
	        // 8. wordArr내부요소의 공백을 모두 제거한후 List<String>으로 변환하는 프로그램
	        // 출력결과 : [abcd, 홍길동, helloworld]
	       
	     List<String> wlist =Arrays.stream(wordArr).map(e->e.replace(" ", "")).collect(Collectors.toList());
	       
	        // 9. dan을 활용하여 구구단 2단~9단까지 출력하는 프로그램을 만드시오
	        //      ex) 2 * 1 = 2
	        //          2 * 2 = 4
	       dan.reduce((sum, n)->{
	    	   for(int i=2; i<10; i++) {
	    		   sum+=i*n;
	    	   }
	       }).get();
	//
	        // 10. wordArr내부요소의 공백을 제거한 문자열의 길이가 8이상인 요소가 있는지 검사하는 프로그램
	        // 출력결과 : true/false값
	       boolean wList2 =Arrays.stream(wordArr).map(w->w.replace(" ", ""))
	    		   .anyMatch(l->l.length()>=8);
	       System.out.println(wList2);
	    }
	
}
