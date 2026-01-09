package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {
 
	public static void main(String[] args) {
	/*
	 * 보조스트림
	 * - 기반스트림의 부족한 성능이나 기능을 추가할 수 있는 스트림
	 * -단독으로는 사용이 불가능하다
	 * 
	 * [표현볍]
	 * 보조스트림(ObjectOutputStream 등 이런게 다 보조스트림중 하나인거임) 변수명 = new 보조스트림(기반스트림객체);
	 * 보조스트림1 변수명 = new 보조스트림1(new 보조스트림2(기반스트림객체));
	 * 
	 * Bufferedxxx
	 *  - 속도 성능 향상 목적의 보조 스트림
	 *  -내부적으로 버퍼공간을 제시하여 데이터를 모아뒀다가 한번에 입출력을 진행
	 *    
	 * 
	 */
		BufferedDao br = new BufferedDao();
		br.FileSave();
}
}
