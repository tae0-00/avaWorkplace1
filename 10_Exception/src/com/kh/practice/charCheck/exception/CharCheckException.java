package com.kh.practice.charCheck.exception;

import com.kh.practice.charCheck.controller.CharacterController;

public class CharCheckException  extends Exception {
	
	public CharCheckException() {
		
	}

	public CharCheckException( String msg) {
		super(msg);
	}
}
