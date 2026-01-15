package com.kh.chap01_URL.part02_web_cralwer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCralwer {
	public static void main(String[] args) {
		WebCralwer wc = new WebCralwer();
		wc.test1();
	}

	/*
	 * URl을 활용한 웹 크롤링 -웹페이즈를 탐색하여 HTML내부의 원하는 데어트를 추출하는 작업 -수집한 데이터를 분석하기 위하여 사용한다
	 * -다만 웹페이지의 소유주나 운영자의 허락없이 크롤링시 법적 책임이 따를 수 있다.
	 */
	public void test1() {

		String address = "https://khedu.co.kr/project/team.kh";
		List<String> arr = new ArrayList<>();

		try {
			URL url = new URL(address);
			try {
				URLConnection conn = url.openConnection();

				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				// 읽어온 데이터를 저장할 StringBuider
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");

				}
				System.out.println(sb.toString());

				// 내가 원하는 문자열을 추출하는 방법
				// 정규표현식
				// <img src=""
				String regex = "<img\s+src=\"([^\"]+)\"";
				Pattern pa = Pattern.compile(regex);
				Matcher match = pa.matcher(sb);
				while (match.find()) {
					String image = match.group(1);
					System.out.println(image);
					arr.add(image);
				}
				System.out.println("검색왼료");

				saveFile(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private void saveFile(List<String> arr) {
		// 이미지 리스트의 길이만큼 반복하여 ,URL객체를 생성하고, 이미지를 다운로드
		for (String imaPath : arr) {
			
			if(!(imaPath.startsWith("/upload/prject"))){
				continue;
			}
			String fileName = imaPath.substring(imaPath.lastIndexOf("/"));
			String savePath = "C:/upload/kh/project";

			File dir = new File(savePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
			try {
				URL url = new URL("https://khedu.co.kr" + imaPath);
				URLConnection conn;
				conn = url.openConnection();
				try (BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
						BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(dir + fileName))) {
					int v = 0;
					while ((v = is.read()) != -1) {
						os.write(v);
					}
					System.out.println(fileName + "저장와ㅣㄴ료 ");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
