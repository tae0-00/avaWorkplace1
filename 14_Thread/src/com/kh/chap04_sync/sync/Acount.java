package com.kh.chap04_sync.sync;

//공유자원으로 사용한다
//n개의 Atm(스레드)가 하나의 Acount(공유자원)에서 출금하는 메서드를 호출하는 상황을 만들 예정
public class Acount {

	private int balcnce =10000;
	
	public int getbalcnce() {
		return balcnce;
	}
	//출금 메서드
	/*동기화하는 방법
	 * 1. synchronized 메소드 만들기
	 * -메서드 전체에대해 락을 걸고 메서드 종료시 락이 풀린다. 
	 * 2. synchronized block 사용하기(권장방식은 이방식)
	 * -동기화가 필요한 일부 내용에만 락을 건다
	 * -동기화 블럭이 끝나는 순간 락이 풀린다.
	 * -임계영역이 아닌 지역까지는 모든스레드가 접근이 가능하기 떄문에, 메소드 전체를 임계영역으로 지정하는것보다
	 * 효울이 좋ㄹ다
	 */
	public /*동기화 방법 1번 . synchronized*/ void withdraw(int money) {
		
		//동기화 방법 2번 synchronized 블럭 사용 
		String name = Thread.currentThread().getName();
		synchronized(this) {
			System.out.println("현재 잔액은 : "+balcnce);
			if(money<=balcnce) {
				balcnce-=money;
				System.out.printf
				("[%s] %d원 출금>>> 잔액 : %d원\n",name,money,balcnce);
				
			}else {
				System.out.printf("[%s]%d원 출금시도 하였으나 잔액이 부족함",name, money);
			}
		}
	}
}
