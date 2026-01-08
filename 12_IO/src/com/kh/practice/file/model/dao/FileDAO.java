package com.kh.practice.file.model.dao;

import java.io.File;

public class FileDAO {

	public FileDAO() {
		
	}
	public boolean checkName(String file) {
		boolean t;
		if(checkName(file)) {
		t=true;
		}else {
			t=false;
		}
		return t;
	}
	public void fileSave(String file, String s) {
		File file1 =new File();
	}
	
	public StringBuilder fileOpen(String file) {
		
	}
	public void fileEdit(String file, String s) {
		
	}
}
