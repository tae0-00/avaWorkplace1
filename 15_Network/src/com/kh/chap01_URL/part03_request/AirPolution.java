package com.kh.chap01_URL.part03_request;

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

public class AirPolution {

	public static void main(String[] args) {

		/*
		 * 1)API서버로 데이터 요청(Request)
		 * 
		 * 1.  API(Application Programming Interface)
		 * 	- 어플리케이션에 상호작용을 위한 인터페이스 
		 * 	- 자바 API : 자바 어플리케이션 개발에 도움을 주는 클래스
		 *  - API 서버 
		 *  	-URL로 데이터에 대한 요청을 보내면 응답데이터를 반환해주는 서버로, 애플리케이션들 중 
		 *  	데이터나 서비스를 제공하는 역할을 API서버라고 부른다.
		 *  	-A에플리케이선 에플리케이선에 필요한 데이터가 있는 경우, B에플리케이션의 API서버를 통해
		 *  	요청(request)를 보내고 B API서버는 요청에 대한 응답을 돌료준가
		 *  	-단, API서버에 요청시에는 해당 API서버가ㅣ 정한 규칙에 맞춰 요청을 보내야한다
		 *  
		 *  2. API 서버 요청 방식(Http method)
		 *  -API서버에 지정한 규칙에 따라야 하며, 전통적인 방식의 API요청방법은 2가지
		 *  1)Get 방식
		 *  	-URL에 요청변수(queryParameter)를 붙여서 요청하는 방식
		 *  	-요청변수는 key=value형태로 작성하며 여려개의 요청변수가 있을 경우 &로 구분한다
		 *  	-get방식은 주로 데이터를 단순히 조회할때 사용한다.
		 *  	
		 *  2)POst
		 *  	-요청변수를 Http바디에 담아쇼 요청하는 방식
		 *  	-주로 데이터를 생성, 수정,ㅡ 삭제할떄 사용한다
		 *  	-쿼리스트링은 URL에 노출되지 않는다? 로그인시 비번이나 아이디 안보이는 방식
		 *  
		 *  3. API응답데이터 향식 및 처리방법
		 *  1)XML유형의 데이터
		 *  <course>
		 *   //....
		 *   </coure>
		 *   2) JSON유형의 데이터(표준)>>제이슨이라함 
		 *   { "name" : :"mkm"}// 문자열 형ㅌ태의 자바스크립 객체 
		 *   3)처리방법
		 *    -xml,json 등 해당 탕ㅂ에 맞는 파서를 이용하여 내 프로그래밍언어에 맞는갹체로 변환한다.
		 *    
		 *    4. ApI 응답 상태코드 
		 *    -200 : 성공 
		 *    -404 : 찾고자하는 자원이 없는 경우 전달하는 상태값
		 *    -400 : 요청 오류 
		 *    -401 : 인증 오류시 전달하는 상태값 
		 *    -500 : API 서버상의 오류가 발생하는 경우 전달하는 상태값 
		 */
		//API 사용하기 만들기
		String serviceKey="cf5ae4d175b051762c72e75a128f4dbd0725c4ded5687849d7e7eb1a3f7b17d6";
		String serviceUrl="http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		
		
		try {
			serviceUrl+="?serviceKey="+serviceKey;
			serviceUrl+= "&sidoName="+ URLEncoder.encode("서울","UTF-8");
			
			System.out.println(serviceUrl);
			
			URL url = new URL(serviceUrl);
			URLConnection conn =url.openConnection();
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					BufferedWriter bw = new BufferedWriter(new FileWriter("환경오염.xml"));
					){
				String line = null;
				while((line =br.readLine())!=null){
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
