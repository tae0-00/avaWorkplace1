package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//BufferedWriter/Reader
	
	public void FileSave() {
		
		BufferedWriter bw = null;
		
		try {
			//보조스트림이 Writer계열이라면, 기반스트림도 Writer로 생성해줘야함
			bw= new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
			
			bw.write("안녕");
			bw.newLine();//개행문자 넣어주는 메서드
			bw.write("안녕하심\n");
			
			bw.flush();//버퍼 공간(8kb)을 비워주는 메서드. close 호출시 자동 호출. 
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void flieRead() {
		/*
		 * try ~with ~ resource구문(jdk 7이상)
		 * 
		 * try(스트림객체 ;.... 많이 선언 가능)
		 * 실핼할 코드
		 * }catch(예외클래스){
		 * 
		 * }
		 * 스트림객체를 try에 붙여 넣으면 스트림객체 생성 후 해다ㅇ 블록의 구문이 시행 완룐되면서 알아서 자원을
		 * 반납(
		 * 
		 * 
		 */
		try(BufferedReader br= new BufferedReader(new FileReader("c_bubber.txt"));){
			System.out.println(br.readLine());//한줄씩 값을 문자열로 반환 
			
			String v= " ";
			while((v=br.readLine())!=null) {
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
