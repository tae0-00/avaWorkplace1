package com.kh.practice.thread;

import java.util.Random;

public class Provider extends Thread{

	private Data data;

	public Provider(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {		
			int ran= new Random().nextInt(100)+1;
			data.setValue(ran);
			System.out.println("입력");
			System.out.println("put V"+ran);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
