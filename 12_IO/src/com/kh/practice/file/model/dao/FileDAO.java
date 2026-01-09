package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.AbstractDocument.BranchElement;

public class FileDAO {

	public FileDAO() {
		
	}
	public boolean checkName(String file) {
		File f1 =new File(file); 
		
		return f1.exists();
		//이프절 만들필요도 없음 
		//있는 코드 사용해서 불린담기 가능
	}
	public void fileSave(String file, String s) {
		File f1 =new File(file);
		try {
			FileWriter fw = new FileWriter(f1);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
//		 StringBuilder sb = new StringBuilder();
//		 
//		if(checkName(file)) {
//			return sb;
//		}
//		BufferedReader br;
//		
//		try {
//			br = new BufferedReader(new FileReader(file));
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//		
//		
//		
//		return sb;
//		
		FileReader fr =null;
		 StringBuilder sb = new StringBuilder();
		 try {
			fr = new  FileReader(file);
			
			int v =0;
			while((v =fr.read())!=-1) {
				sb.append((char)v);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return sb;
		
		
	}
	public void fileEdit(String file, String s) {//이거 파일로 다시 만들기
		StringBuilder sb = new StringBuilder();
		if(checkName(file)==false) {
			return;
		}
		try {
			BufferedWriter br =new BufferedWriter(new FileWriter(file,true));
			br.write(s);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
