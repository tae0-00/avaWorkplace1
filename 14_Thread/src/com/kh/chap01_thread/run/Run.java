package com.kh.chap01_thread.run;

import com.kh.chap01_thread.moel.thread.Thread1;
import com.kh.chap01_thread.moel.thread.Thread2;

public class Run {

	public static void main(String[] args) {

		/*
		 * 프로그램
		 * -어떤 작업을 실행할수 있는 파일
		 * -코드 형태로 이루어져있다.
		 * -실행 전단계(cpu를 할당받지 못함)
		 * 
		 * 프로세스
		 * -현재 동작하고 있는 프로그램
		 * -작업을 위한 cpu를 할당받은 상태이다.
		 * 
		 * 스레드
		 * -프로세스를 수행하는 실제 작업단위(일꾼)
		 * -모든 프로세스는 반드시 한개 이상의 스레드가 존재한다.
		 * -스레드는 메인 스레드 1개와 n개의 일반스레드가 존재한다.
		 * 
		 * 싱글스레드 
		 * - 메인스레드 1개 가지고 작업을 처리한다.
		 * - 한 작업을 순차적으로 처리한다.
		 * 
		 * 멀티스레드
		 *  -메인스레드와 추가 스레드를 이용하여 동시에 여려 작업을 처리하낟. 
		 *  
		 * 멀티스레드의 장점
		 * 1)작업의 효율성이 증가한다. 
		 * 	-a스레드 b스레드 나눠서 작업 하므로 훨씬 더 빨리 작업완료가 가능
		 * 
		 * 2)응답성이 향상
		 * 	-사용자 입장에서 일처리가 빠르게 보인다.
		 * 
		 * 
		 * 
		 * 3)cpu를 효율적으로 사용 가능
		 * 	- 멀티스레드 환경에서는 여러 작업이 동시에 수행되므로, cpu의 댁기시간이 줄어든다.
		 * 
		 * 멀티스레드 프로그래밍시 주의점
		 * -동기화 처리가 복잡해진다.
		 * -스레드가 많을수록 메모리공간이 줄어든다(stack)
		 * -프로그램이 복잡해진다. 
		 */
		
		//싱글스레드
		//-실행할 작업을 순차적으로 수행.
		
		for(int i=1; i<=100; i++) {
			System.out.println("작업1["+i+"]");
		
		}
		for(int i=1; i<=100; i++) {
			System.out.println("작업2["+i+"]");
	}
		
		//스레드 생성 방법
		//1.Thread클래스를 상속받아 생성
		Thread th1 = new Thread1();
		
		//스레드 실행
		th1.start();
		//메인스레드 생성->stack메모리 할당->main()메서드 실행 
		//일반스레드 생성->stack메모리 할당->run()메서드 실행 
		
		//스레드 생성 방법 2.
		//2.Ruunable 인터페이스 구현
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		//스레드 생성 방법 3.
		//내부 클래스를 활용하는 방법
		class Thread3 extends Thread{
			
			public void run() {
				System.out.println("Thread3 가동");
				
			}
		}
		Thread3 th3 = new Thread3() ;
		th3.start();
			
		//4. 익명
		Thread th4= new Thread() {
			public void run() {
				System.out.println("4가동");
			}
		};
		th4.start();//이코드는 하나의 클래스임 
	
		//5. 람다식을 활용한 스레드 설정
		Thread th5 = new Thread(()->{
			
			System.out.println("5번 가동");
		});
		th5.start();
		
		
		/*
		 * 스레드의 특징
		 * 1. 동시성
		 * 	- 멀티스레드 프로그래밍에서 여려개의 스레드가 "동시"에 실행되는것 처럼 보이는 현상으로
		 *  실제로는 os의 "스케쥴러"에 의해 스레드의 전환이 순시간에 이루어져 동시에 실ㄷ행되는것처럼
		 *  보이는 현상이다
		 *  -단, CPU코어의 개숫가 많다면 실제로 여려개의 스레드가 동시에 실핸된다.
		 *  
		 *  2. 병렬성의 특징
		 *  -멀티스레드 프로그래밍에서 여려개의 스레드가 동시에 실행되는 특징
		 *  -코어의 개수만큼 동시에 실행된다.
		 *  
		 *  3. 독립성의 특징을 가진다
		 *  -각 스레드는 독립적으로 실행되며, 다른 스레드릐 영향을 받지 않는다.
		 *  -개별적인 실행 르흠을 보장하기 위해 고유 stack영역을 할당받는다.
		 *  -메인스레드가 종료되더리ㅏ도, 개별스레드가 실행중이라면 프로세스가 종료되지 않는다. 
		 */
		 System.out.println("메인메서드 끝!");
		 /* 	
			[실습문제]
			알파벳 A~Z 까지 출력하는 스레드 생성
			알파벳 a~z 까지 출력하는 스레드 생성
			각 스레드 생성후 main스레드에서 실행.
			출력예시 :
			[대문자쓰레드 시작]
			[소문자쓰레드 시작]
			[대문자쓰레드 : A]
			[대문자쓰레드 : B]
			[소문자쓰레드 : a]
			[대문자쓰레드 : C]
			[소문자쓰레드 : b]
			....
			[소문자쓰레드 : z]
			[대문자쓰레드 : Z]
			[대문자쓰레드 종료]
			[소문자쓰레드 종료]
		*/
		 Thread th6 = new Thread(()->{
			 System.out.println("[대문자 스레드 시작]");
			 for(char i='A'; i<='Z';i++) {
				System.out.println("대문자 스레드" +i);
				}
			 System.out.println("[대문자 스레드 종료]");
			});
			
			
			Thread th7 = new Thread(()->{
				 System.out.println("[소문자 스레드 시작]");
				 for(char i='a'; i<='z';i++) {
					System.out.println("소문자 스레드" +i);
				}
				 System.out.println("[소문자 스레드 종료]");
			});
			th6.start();//중간중간 섞여있으니까 한번에 같이 
			th7.start();
		 
	}
}
