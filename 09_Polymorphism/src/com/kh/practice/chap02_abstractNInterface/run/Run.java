package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;
import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class Run {

	public static void main(String[] args) {

		PhoneController pp= new PhoneController();
		String [] arr = pp.method();
		
		
		for(String str : arr)  {
			System.out.println(str);
		}
		
		
	}

}
