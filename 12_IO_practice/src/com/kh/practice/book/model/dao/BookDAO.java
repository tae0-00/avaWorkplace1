package com.kh.practice.book.model.dao;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class BookDAO {
	private Book [] bArr = new Book[10];
	
	public BookDAO() {
		
	}
	public void fileSave(Book [] bArr) {
try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book [] fileRead() {
		Book [] b = new Book[10];
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));){
			while(true){
				try {
					b =(Book[])ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return b;
	}
}
