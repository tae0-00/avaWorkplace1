package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.*;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;


public class PhoneController {

	private String [] result = new String [2];
	public String [] method() {
		
		
		Phone [] arr = new Phone [2];
		arr[0]= new GalaxyNote9();
		arr[1]= new V40();
		
		
		//1안 2안 
		for(int i=0; i<arr.length;i++) {
			result [i]= ((SmartPhone)arr[i]).printInformation();
			
		}
		return result;
	}
}
