package com.kh.practice.thread;

public class Provider extends Data{

	private Data data;

	public Provider(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {		
			data.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
