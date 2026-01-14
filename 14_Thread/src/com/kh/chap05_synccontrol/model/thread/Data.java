package com.kh.chap05_synccontrol.model.thread;

//공유자원 
public class Data {

	private int item;//생산 및 소비되는 아이템
	//1== 생산 0== 소비
	private boolean empty= true;
	//item의 상태를 저장하고, 스레드의 흐름을 제어하기 위한 변수
	
	//item 소비 메서드
	public void getData() {
		// 만약 아이템이 생산되기 전이라면 아이템을 소비하지 않도록 웨이팅 상태로 전환
		synchronized (this) {
			if(empty) {
				try {
					//다른 스레드가 깨우기 전까지 대기상태로 전환된다.. 
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//아이템소비
			item=0;
			empty=true;
			System.out.println("소비자가 아이템을 소비했습니다,");
			notify();
		}
	}
	//아이템 공급용 메소드
	public void setData() {
		synchronized (this) {
		if(empty==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		item =1;
		empty=false;
		System.out.println("생산자ㅏ가 아이템을 생산했습니다.");
		notify();//컨슈머가 대기중인경우 꺠우는 메서드 
		}
	}
}
