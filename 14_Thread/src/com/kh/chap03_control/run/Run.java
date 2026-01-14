package com.kh.chap03_control.run;

import java.util.Scanner;

public class Run {
	//스레드 상태를 제어하는 메서드들 
	
	public static void main(String[] args) {
	Run r = new Run();
	//r.test1();
	r.test2();
	}
	public void test2() {
		/*
		 * 스레드 컨트롤 메서드
		 *  -일시정지(TimeWaiting)상탱;ㄴ 스레드를 다시 런어블로 변경하는 메서드
		 *  1) notify/notifyAll
		 *  -동기화된 블럭안에서만 사용하며, 대기중인 스레드를 꺠우는(runnable) 메서드
		 *  interrupt()
		 *  2)
		 *  -sleep이나 join에 의해 일시정지된 메서드를 깨우는 역화의 메서드로
		 *  강제 발생시킴
		 */
		Thread cnt = new Thread(()->{
			for(int i=100; i>0;i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break;//interrupt메서드 호출시 종료
				}
			}
		});
		cnt.start();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("종료하려면 ex 입력");
			String str = sc.nextLine();
			if(str.equals("ex")) {
				cnt.interrupt();
			}
		}
	}
		public void test1() {
		/*
		 * 1.Thread.sleep
		 *  작업중인 스레드를 일시정지상태로 변경하는 메서드
		 *  -지정괸 시간아 지나면 다시 실행대기 상태로 변경
		 *  
		 *  2. wait()
		 *  -동기화 블럭 안에서만 사용 지정된 시간이 지나거나 다른 스레드가 호출 전깢비 대기시키는메서드 
		 *  
		 *  3.join(ms)
		 *  -지정된 시간동안 다른 스래들를 실행시키고 현재 스레드는 대기시키는 메소드
		 *  -지정된 시간이  지나거나, 다른 스레드의 작업이 종룓회면 다시 runnable상태로 변경
		 *  
		 *  4. IO Block
		 *  -입출력메서드에 의해 잀시정지된 상태로 일출력 왼료시 다시 상태로 변경
		 */
			//0.05초 일시정지하는 스레드 
			Thread a = new Thread(()->{
				for(int i=0; i<100;i++) {
					System.out.print("-");
					
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			Thread b = new Thread(()->{
				for(int i=0; i<100;i++) {
					System.out.print("|");
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
				}
			});
			a.start();
			b.start();
	
	}
}
