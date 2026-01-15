package com.kh.chap02_protocol.tcp.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//1. 연결하고자하는 ip주소와 port번호 저장
		int serverPort =30000;
		String serverIp="192.168.10.36";
		Socket socket =null;
		//2. 
		try {
			socket = new Socket(serverIp,serverPort);
			System.out.println("서버연결 성공 ");
			
			//3. 서버와 연결된 입출력 슼트림 생성
			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
					
					Scanner sc = new Scanner(System.in);
					){
				while(true) {
					System.out.println("서버에 보낼 메시지 :");
					String msg = sc.nextLine();
					
					pw.println(msg);
					
					
					if(msg.equals("exist")) {
						System.out.println("잡속종료");
						break;
					}
				}
				System.out.println("받은 메세지 :"+br.readLine());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
