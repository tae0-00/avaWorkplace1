package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {

	public static void main(String[] args) {
//http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty
		String serviceKey="cf5ae4d175b051762c72e75a128f4dbd0725c4ded5687849d7e7eb1a3f7b17d6";
		String serviceUrl="http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
		
		
			String stationName;
			try {
				stationName = URLEncoder.encode("종로구","UTF-8");
				String dataTerm=URLEncoder.encode("DAILY","UTF-8");
				
				
				
				serviceUrl+="?serviceKey"+serviceKey;
				serviceUrl+="&stationName="+stationName;
				serviceUrl+="&dataTerm="+dataTerm;
				
				System.out.println(serviceUrl);
				
				URL url= new URL(serviceUrl);
				URLConnection conn = url.openConnection();
				try(BufferedReader br =new BufferedReader(new InputStreamReader(conn.getInputStream()));
						BufferedWriter bw = new BufferedWriter(new FileWriter("대기오염.xml"));
						){
					String line=null;
					while((line=br.readLine())!=null) {
						bw.write(line);
						bw.newLine();
					}
				}
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		
	}
}