package com.kh.chap02_lamda.part02_pratice;

import com.kh.chap02_lamda.model.functional.LambdaTest1;
import com.kh.chap02_lamda.model.functional.LambdaTest2;

public class LambdaPratice {

	public static void main(String[] args) {
		//람다식 문법
		//1. 기본형태
		LambdaTest1 lam = (int x, int y)->{
			return x+y;
		};
		
		//2. 매개변수의 자료형은 생략가능
		lam=(x,y)->{
			return x+y;
		};
		//3.매개변수() 생략가능
		//단, 매개변수가 딱 1개인 경우만
		LambdaTest2 lam3= str->{
			System.out.println(str);
		};
		//4. 중괄효 생략가능.
		//단, 실행할 코드가 한문장인 경우
		LambdaTest2 lam4=str->System.out.println(str);
		LambdaTest1 lam5=(x,y)-> x+y;
		
		// - 실습문제 -
		/*
        // 각 람다식을 가장 간결한 형태로 표현하기
        // 1. ((int x) -> { return (x * x); });
		//	x->x*x;
		 * 
        // 2. (String str) -> { return (str.length()); };
         * str->str.length();
         * 
        // 3.  (int x) -> { System.out.println(x); return x; };
         * x->{ System.out.println(x); return x; };
         * 
        // 4. (String str) -> { return (str.toUpperCase()); };
         * str->str.toUpperCase();
         * 
        // 5. (int x , int y) -> { return (x * y); };
         * ( x ,  y) ->x * y;
         * 
        // 6. ((int x , int y) -> { return (x % y == 0); });
         * ( x ,  y)->(x % y == 0);
         * 
        // 7. (int x , String str1) -> { return (str1 + x); };
         * ( x ,  str1) ->str1 + x;
         * 
        // 8. ((int x , String str1) -> { System.out.println(x + str1); });
         * ( x ,  str1)->System.out.println(x + str1);
         * 
        // 9. ( arr) -> (Math.max(Math.max(arr[0], arr[1]));

        // 10. ((String str1, String str2) -> { String result =  (str1.conact(str2)); return result; });
		( str1,  str2)->{ String result =  (str1.conact(str2)); return result; });
		
		 */
		
	}
}
