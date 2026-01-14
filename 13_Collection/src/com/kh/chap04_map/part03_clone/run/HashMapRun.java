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
		this.table= new Entry[capacity];
	}
	public int getIndex(K key) {
		/*
		 * 113355%10이라면?==5번 인덱스
		 * 1234%10== 4번 인덱스
		 * 123456789 9번인덱스
		 * 199922222222== 2번인덱스 
		 */
		
	}
	public void put(K key, V value) {
		//현재 엔츠리가 마지막인결루
				//다ㅡㅇ믕로 뽑은 에ㅐㄴ측리거가 중복인경우 
				//마지막 사이즈를 추가할때 추가되면 안되는 애들ㅇㄴ 리텀 
	}
	public V get(K key) {
		//getIndex함수 호출후 반환값으로 table index에 접근 
		//
	}
	public boolean containsKey(K key) {
		int index=getIndex(key);
		Entry<K,V> en=table[index];
	}
	public void remove(K key) {
		//인덱스 값 받아와서 엔트리값으로 테이블에 넣음
		//먼역 엔츠리가 널이면 종료
		//객체가 있다면 앤트리 키와 키ㄱ밧이 같가면
		//do while,문을 활용 테이블 인덱스를 통해 삭제
		//첫번째 엔틀인 경우 테이블 인덷ㅅ스를 이룡해 삭제 
		//테이블의인덱스의 값과 넥슽의 인넥슥밧이 일치하는지 확인
		//두본째 이상의 엔트리인 경우 넥스트필드의 값ㅇ르 null로 변경하여 삭제 
		//삭제를 하면 사이즈ㄱ밧 감소 
		//저장할 변수명도 필요함 이전의 엔트리값을 보관하기 위함
		//이전 값 보관하고 
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
