package com.kh.chap01_thread.moel.thread;

public class ThreadA extends Thread{

	public void run() {
		for(int i='A'; i<='Z';i++) {
			System.out.println("대문자 정렬" +i);
			
		}
	}
	
}
