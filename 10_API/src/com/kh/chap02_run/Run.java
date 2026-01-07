package com.kh.chap02_run;

import com.kh.chap02_String.controller.C_StringTokenizer;
import com.kh.chap02_String.controller.D_StringMethod;
import com.kh.chap02_controller.A_StringPool;
import com.kh.chap02_controller.B_StringBuilderAndBuffer;

public class Run {

	public static void main(String[] args) {

		A_StringPool ap= new A_StringPool();
		//ap.method1();
		//ap.method2();
		//ap.method3();
		B_StringBuilderAndBuffer b=new  B_StringBuilderAndBuffer();
		b.method2();
		
		C_StringTokenizer c= new C_StringTokenizer();
		c.method();
		D_StringMethod d = new D_StringMethod();
		//d.method();
	}

}
