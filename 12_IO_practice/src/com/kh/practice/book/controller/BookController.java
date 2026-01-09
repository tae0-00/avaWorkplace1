package com.kh.practice.book.controller;

import java.awt.print.Book;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;

public class BookController {

	private BookDAO bd = new BookDAO();
	
	public BookController() {
		
	}
	public void makeFile() {
		File file =new File("text.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave ( Book [] bArr) {
		
	 bd.fileSave(bArr);
	}
	public Book [] fileRead() {
	
		return bd.fileRead();
}
}
