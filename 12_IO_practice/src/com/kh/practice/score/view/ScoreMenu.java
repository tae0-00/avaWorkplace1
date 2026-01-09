package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;
import com.kh.practice.score.model.dao.ScoreDao;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public ScoreMenu() {
		
		
	}
	public void mainMenu() {
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("3. 끝내기");
			System.out.print("메누ㅠ입력");
			int menu= sc.nextInt();
			
			switch(menu) {
			case 1: 
				saveScore();
				break;
			case 2: 
				readScore();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못입력 다시 입력");
			}
		}
	}	
	public void saveScore() {
		int num= 0; 
		while(true) {
		//for(int i=0; i<=num; i++) {
			System.out.println(++num+ "번째 학생 정보 기록");
	//	}
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("국어 점수 :");
		int kor = sc.nextInt();
		System.out.println("영어 점수 :");
		int eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		
		scr.saveScore(name, kor, eng, math, sum, avg);
		System.out.println("그만 입력하시려면 N또는 입력 계속은 아무키 누륵세여");
		char ch= sc.next().toUpperCase().charAt(0);
		
		if(ch=='n') {
			return;
			}
		}
	}
	public void readScore() {
		int count =0;
		int sumAll=0;
		double avgAll=0.0;
		//ScoreDao [] arr= new ScoreDao[6];
		
		try {
			DataInputStream dis = scr.readScore();
			
			while(true) {
				try {
				System.out.println("이름 \t국어\t영어");
					String name= dis.readUTF();
					int kor = dis.readInt();
					int eng = dis.readInt();
					int math = dis.readInt();
					int sum =dis.readInt();
					double avg = dis.readDouble();
					
					count++;
					sumAll++;
					avgAll++;
					
					
				}
					
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(EOFException e) {
					System.out.println(count+"\t"+sumAll+"\t"+avgAll);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
