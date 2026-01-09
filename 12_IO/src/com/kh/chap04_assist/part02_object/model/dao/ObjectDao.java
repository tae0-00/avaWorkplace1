package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	public void fileSave() {
		//파일에 저장할 객체 생성
		Phone p = new Phone("아이폰 ",11000,"1234");
		
		//ObjectOutputStream :객체단위 출력을 지원하는 보조 스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.txt"));){
			
			//객체단위 풀력메서드
			oos.writeObject(p);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	
	public void fileRead() {
		try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream("Phone.txt"));){
			
			try {
				Phone p =(Phone)ois.readObject();
				System.out.println(p);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
