package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;


public class NetworkTest {
	public static void main(String[] args) {
		NetworkTest nt = new NetworkTest();
		nt.test1();
		//nt.test2();
		//nt.test3();
	}

	/*
	 * IP 
	 * -10.10.10.10 형태로 4바이트로 이루어진 주소값
	 * -hostname :naver.com, iei,or.kr(도메인 명)
	 *  -InetAddress(자바에서 IP주소를 가지고 있는 클래스)
	 */
	public void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress google = InetAddress.getByName("google.com");
			System.out.println(google.getHostAddress());
			
			InetAddress [] arr= InetAddress.getAllByName("google.com");
			System.out.println(Arrays.toString(arr));
			
			//내 컴퓨터의 아이피 주소 얻어오는 법
			//InetAddress.getLocalHost();
			InetAddress local =InetAddress.getLocalHost();
			System.out.println(local);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test2() {
		/*
		 * URL
		 *  -인터넷상에 존재하는 서버들의 자원에 접근할수 있는 주소
		 *  -자바에서는 클래스를 통해 URL자원을 닿룰수 있다.
		 *  -실제 URL자원에 대한 객체를 생성하여 지원에 연결하고 데이터를 읽어올수이싸.
		 *  
		 *  URL구조 
		 *  - https://kh-academy.co.:kr443/project/teamView.kh?no=5403&cpage=1
		 *  
		 *  protocol : 통신구약(http, https,wmtp ...}
		 *  hostname : 도메인 이름(ip 주소) /kh-academy
		 *  port : 서비스번호 : 호스트 내에 특정 서비스를 가리키는 논리적인 번호 
		 *  프로포트 별보 다양한 서비스를 제공할 수 있다.
		 *  각 프로토콜의 기본포트는 생략이 가능하다/
		 *  hpps 기본 포트 443,hpps 80,ftp 20
		 *  자원경로(path) : hostname과 port내부에 자원 존재하는 세부 ㅈ경로 
		 *  			/ptoject/teamView.kh
		 *  qyertstring : 자원을 얻기위헤 버에 전달해야하는 ㄴ값들
		 *  			!no=xxx&cpage=1
		 * 
		 */
		try {
			URL url = new URL("https://kh-academy.co./project/teamView.kh?no=5403&cpage=1");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test3() {
		/*
		 * URLConnection 
		 * -네트워크 상의 원격 서버와 통신하여 자원을 입출력 할수 있는 스트림을 제공하는 클래스
		 * -URl로 연결할 자원을 ㅅ기술하고, URLConnection으로 입출력 스트림을 사용하여 입출력할수 있다.
		 */
		String adress= "https://khedu.co.kr/upload/project/2025062512331962_1.png";
		BufferedInputStream br = null;
		BufferedOutputStream bw = null; 
		
		try {
			URL url = new URL(adress);
			try {
				URLConnection conn = url.openConnection();
				br= new BufferedInputStream(conn.getInputStream());
				
				bw=new BufferedOutputStream(new FileOutputStream("project.png"));
				
				int data = 0;
				while((data= br.read())!=-1){
					bw.write(data);
				}
				System.out.println("검색겴괴 왼료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
