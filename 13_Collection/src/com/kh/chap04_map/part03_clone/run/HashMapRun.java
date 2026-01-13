package com.kh.chap04_map.part03_clone.run;



public class HashMapRun <K, V>{
	private Entry<K, V>[] table;
	private int capacity;//객체배열의 크기로서 사용된다.
	private int size;//객체배열 내부의 초기화된 객체 수 
	
	class Entry < K, V>{
		K key;
		V value; 
		Entry<K,V>next;
		
		public Entry( K key ,V value, Entry<K,V>next) {
			this.key =key;
			this.value=value;
			this.next=next;
		}
	}
	
	//객페 생성시 반드시 객체베열의 크기를 지정
	public HashMapRun(int capacity) {
		this.capacity=capacity;
	}
	public int getIndex(K key) {
		/*
		 * 113355%10이라면?==5번 인덱스
		 * 1234%10== 4번 인덱스
		 * 123456789?? 9번인덱스
		 * 199922222222== 2번인덱스 
		 */
		
	}
	public void put(K key, V value) {
		
	}
	public V get(K key) {
		
	}
	public boolean containsKey(String key) {
		
	}
	public void remove(String key) {
		
	}
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e : table) {
			if(e == null) continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");	
			
			Entry next = e.next;
			do {
				if(next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");	
					next = next.next;
				}
			}while(next != null); //
		}
		//sb.append(Arrays.toString(table));
		
		sb.append('}');
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
