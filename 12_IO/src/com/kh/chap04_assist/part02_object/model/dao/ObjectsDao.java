package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	public void fileSave() {
		Phone [] arr = new Phone[3];
		
		arr[0]= new Phone("아이폰",123344,"1234");
		arr[1]= new Phone("갤럭시",36644,"1456");
		arr[2]= new Phone("아이패드",99994,"8888");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone_arr.txt"));){
			for(Phone p : arr) {
				oos.writeObject(p);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void fileRead() {
		
		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone_arr.txt"));){
			
			try {
				//더이상 읽어드릴 객체가 없는 경우, EOFExecption을 발생
				while(true){
					Phone p=(Phone)ois.readObject();
					System.out.println(p);
				}
				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(EOFException e) {//순서도 중요함 아이오이 위에 있어야힘 
			System.out.println("읽을 객체 없다");
		}
		catch (IOException e) {

			e.printStackTrace();
		}
	}
}
