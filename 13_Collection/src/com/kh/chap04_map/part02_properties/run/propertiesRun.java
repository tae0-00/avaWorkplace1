package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.chap04_map.part01_hashmap.model.vo.Snack;

public class propertiesRun {

	public static void main(String[] args) {

		/*
		 * Properties
		 * - map계열 인터페이스를 구현한 클래스로, key,value쌍으로 값을 저장
		 * -단, 모두 key, value값을 모두 String으로 관리하는것을 권장하며, 파일입출력메서드를(io)를 지원한다. 
		 * -주로 프로젝트의 설정정보를 기록하는게 사용한다. 
		 * 
		 */
		Properties prop= new Properties();
		
		//map계열 인터페이스 구현하였기에 put메서드 사용 가능 
		//prop.put("다이제", new Snack("초코맛",500)); 
		//이건 사용안함
		
		///1. setProperty (String, String)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashMap");
		prop.setProperty("Map", "HashMap");//마지막으로 값이 변해서 얘는 없어짐
		prop.setProperty("Map", "properties");
		
		System.out.println(prop);
		//그다지 많이 사용 안함
		
		//2.getProperty(String key)
		//key에 저장된 value 값을 가져오는 메서드
		System.out.println(prop.getProperty("Set"));
		
		//3.store(Output os , String Comments)
		//prop에 담긴 key, value룰 모두 출력스트림을 활용하여 출력
		
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");
			System.out.println(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//4. load( is ) : properties를 읽어오는데 사용하는메서드
		Properties prop2 = new Properties();
		
		
		System.out.println(prop2);
		
		try {
			prop2.load(new FileInputStream("test.properties"));
			
			System.out.println(prop2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
