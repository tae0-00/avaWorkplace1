package com.kh.chap03_protocol.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClientRun {

	public static void main(String[] args) {

		InetAddress server;
		try {
			server = InetAddress.getByName("loclahst");
			
			int serverPort =300001;
			
			DatagramSocket socket = new DatagramSocket();
			
			String msg="데이터 종료 요철";
					byte [] sndData= msg.getBytes();
			DatagramPacket sentPocket =
					new DatagramPacket(sndData,sndData.length, server, serverPort);
			socket.send(sentPocket);
			
			byte [] data = new byte [1024];
			DatagramPacket reci = new DatagramPacket(data, data.length);
			
				socket.receive(reci);
				
				String recive = new String(reci.getData(), 0 ,reci.getData().length);
				System.out.println(recive);
				socket.close();
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
