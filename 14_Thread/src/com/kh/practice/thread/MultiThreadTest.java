package com.kh.practice.thread;

public class MultiThreadTest extends Data
{

	public static void main(String[] args) throws EmptyException {
		Data data = new Data();  //공유데이터 
       // Thread putThread; 
       // Thread getThread;
        Thread putThread= new Thread(()->{
        	for(int i=0; i<10; i++) {
        		data.setValue(i);
            	System.out.println("값이 입력됬습니다");
        	}
        	
        });
        
        
        Thread getThread = new Thread(()->{
        	
        		try {
					data.getValue();
				} catch (EmptyException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		System.out.println("값을 꺼냈습니다." );
        	
        	try {
				data.getValue();
			} catch (EmptyException e) {
				System.out.println("현재 입력된 값이 없습니다 기다리시오 ");
				e.printStackTrace();
			}
        	
        });
        putThread.start();
        getThread.start();
	}
}
