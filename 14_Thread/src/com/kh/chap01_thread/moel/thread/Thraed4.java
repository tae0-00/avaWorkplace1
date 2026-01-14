package com.kh.chap01_thread.moel.thread;

public class Thraed4 extends Thread {

	public void run() {
		for(int i='a'; i<'z';i++) {
			System.out.println("소문자 정렬" + i);
		}
	}
}
