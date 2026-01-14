package com.kh.practice.thread;

public class Data{
	private int value ;
	private boolean isEmpty=true;
	
	public Data() {
		
	}
	public void setValue(int value) {
		synchronized (this) {
			if(isEmpty==false) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.value = value;
			isEmpty=false;
			notify();
		}
	}


	public int getValue() throws EmptyException{
		synchronized (this) {
			if(isEmpty==true) {
				try {
					wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
					isEmpty=true;
					return value;
			
		}
				
			
		
		
		


	public void run() {
		// TODO Auto-generated method stub
		
	}
}
