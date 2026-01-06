package com.kh.practice.chap02_abstractNInterface.model.vo;
//실선은 익스펜드 점선은 인플리
public interface Phone {

	char [] NUMBERPAD = {'1','2',
			'3','4','5','6','7','8','9','*','0','#'};
	String makeCall();
	String takeCall();
	
}
