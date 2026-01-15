package com.kh.practice.thread;

public class Customer extends Thread{

	private Data data;

	public Customer(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run (){
		
			for(int i=0; i<10; i++) {
				try {
					data.getValue();
				} catch (EmptyException e) {
					System.out.println("값이 비었습니다.");
					e.printStackTrace();
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		
	}
	
	
}
