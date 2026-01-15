package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		URL url = new URL("https://kh-academy.co./project/teamView.kh?no=5403&cpage=1");
//		System.out.println(url.getProtocol());
//		System.out.println(url.getHost());
		System.out.println("호스트명 입력 :");
		String hostname= sc.nextLine();
		
		try {
			InetAddress [] arr = InetAddress.getAllByName(hostname);
			
			System.out.println(hostname+"은"+arr.length+"개의 주소가짐");
			
			int count =1;
			for(InetAddress ia : arr) {
				System.out.println(count ++ +"번 IP ="+ia.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
