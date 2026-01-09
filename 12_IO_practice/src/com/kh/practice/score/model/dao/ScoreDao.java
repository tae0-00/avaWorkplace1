package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDao {
	
	public ScoreDao() {
		
	}
	public void saveScore(String name, int kor, int eng , int math, int sum, double avg) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("점수.txt", true));){
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public DataInputStream readScore()  throws FileNotFoundException {
		 DataInputStream dis = new DataInputStream(new FileInputStream("점수.txt"));
		 
		 return dis;
	}
	

}
