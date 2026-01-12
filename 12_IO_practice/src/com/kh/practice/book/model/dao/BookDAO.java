package com.kh.practice.book.model.dao;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;



public class BookDAO {
	private Book [] bArr = new Book[10];
	
	public BookDAO() {
		
	}
	public void fileSave(Book [] bArr) {
		
try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));){
	
	
	for(int i=0; i<bArr.length; i++) {
		if(bArr[i]!=null) {
			oos.writeObject(bArr[i]);
		 }
	 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public Book [] fileRead() {//이부분은 항상헷갈려/여기는 클로즈 안해도 되니?/
		
		Book [] bArr = new Book[10];
		int ind=0;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));){
			while(true){
				try {
					Book b =(Book)ois.readObject();
					bArr[ind]=b;
					ind++;
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return bArr;
	}
}
