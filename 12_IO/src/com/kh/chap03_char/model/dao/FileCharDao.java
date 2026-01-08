package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	public void fileSave() {
		//FileWriter : 파일로 데이토를 2byte단위로 출력하는 스트림
		FileWriter fw= null;
		
		try {
			fw = new FileWriter("b_ char.txt");//파일이 없다면 생성하고 이어쓰려면 true안에 같이 넣기
			
			fw.write("재밌는 시간\n");
			fw.write("잘 지내고 있나여\n");
			fw.write(' ');
			
			 char [] arr = {'a','c','e'};
			 fw.write(arr);
			
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead() {
		FileReader fr = null;
		
//		try {
//			fr= new FileReader("b_char.txt");
//			int value =0;
//			
//			while((value= fr.read())!=-1) {
//					System.out.println((char)value);
//			}
//			try {
//				fr.read();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		try {
			fr = new FileReader("b_char.txt");
			int value= fr.read();
			while((value=fr.read())!=-1) {
				System.out.println((char)value);
				
			}
			fr.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
