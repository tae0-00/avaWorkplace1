package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Dao는 데이터 어세스 오브젝트
   //>>데이터에 연결하기 위한 용도의 클래스를 관리하는 패키지
public class FilebyteDao {

	//자바프로그램에서 외부매체로 데이터를 출력하는 프로그램
	public void fileSave()  {
		FileOutputStream fout = null;
	
		//FileOutputStream : 파일로 데이터를 1byta단위로 출력하는 스트림(통로)
		//[표현법]
		//>>new FileOutputStream(입출력할파일객체 혹은 파일명 );->예외처리해줘야함
		try {
			//1.FileOutputStream 객체생성 == 입출력할 파일과 연결
			//-매개변수로 전달한 파일이 존재하지 않으면 해당파일을 새로 생성하먄서 통로가 개설된다.
			//-존재하는 파일이 잇으면 즉시 통로 연결
			//-true 미작성시 : 기존에 해당 파일에 덮어씌우기방식으로 출력 1234
			//-true 작성시 :  이어쓰기 방식으로 출력한다. 121231234 식으로  
			 fout = new FileOutputStream(new File("a_byte.txt"));//이건 객체 생성 
			
			//2.연결통로로 데이터 출력
			//-Write():-128에서 127까지의 숫자만 전달 //즉, 영문자만 제대로 표현가능 
			fout.write(97);//두번째 좀 긴 캐치트라이로 해야함 
			fout.write(65); //'A'
			fout.write(66); //'B'
			//fout.write('민'); //일반 바이트스트림으로는 한글과 같은 유니코드문자는 표현이 불가능함
			
			byte [] bArr= {99,100,101};
			fout.write(bArr);//cde
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//어떤 예외가 발생했든 안했든, 반드시 실행하는 구문을 작성하는 블럭 
			
			//3. 다 쓴 스트림은 반납하기
			try {
				fout.close();//트라이 캐치 해야함 
			} catch (IOException e) {
				e.printStackTrace();
			}//변수 선언는 트라이블럭 밖에서 해야함 null로 해줘야함 	}
		}
	}
	
	
	//자바 프로그램으로 데이터를 입력받는 기능
	public void fileRead() {
		
		FileInputStream fin =null;//try블럭과 파이널리 블럭 동시에 사용하기 위해
		
		//1. 입출력 객체 생성하기
		try {
			fin = new FileInputStream("a_byte.txt");
			//반드시 존재하는 파일를 제시해야한다. 파일명 틀리면 안됨
			
			//2.입력매체로부터 데이터 읽어오기
			//read () :int
			//1byte씩 데이터 읽어온다
			//이건
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());//더이상 읽을 값이 없는경우 -1 반환 
			System.out.println(fin.read());//더이상 읽을 값이 없는경우 -1 반환 
			
//			int value =fin.read();
//			while(value !=-1) {
//				System.out.println(value);
//				value = fin.read();
//			}
			int value =fin.read();
			while( (value=fin.read()) !=-1) {
				System.out.println(value);
				//뒤에 value = fin.read();를 붙여도 같은 의미임 
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
