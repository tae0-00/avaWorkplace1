package com.kh.chap01_innerClass.prat02_static.model.dto;

import java.sql.Date;

public class KakaoUserInfoResponse {
	/*
	 * DTO(Data Transfer Object 데이터 전송 객체)
	 * -값을 전달하기 위해 사용하는 클래스
	 * -API서버, DB서버 등에서 데이커를 송/수신 하기 위한 용도의 객체들을 정의하는 클래스,
	 * -VO클래스와는 다르게 데이터의 "송/수신"이 주 목적이기 떄문에 불필요한 메서드들이 존재하지 않는다.
	 * (equals, hashcode ,setter...) 그냥 값을 보내면 되니까 
	 * -api서버들에는 다양한 서비스들이 존재하며, 각 서비스마다 요구하는 데이터의 형식 및 
	 *            반환되는 응답의 형식이 다양하기 때문에 굉장히 많은 양의 클래스들이 나온다
	 * -이렇게 너무 많은 DTO클래스가 파일로 존재하면 관리가 힘들어지므로 팔요한 클래스들을 
	 * 하나의 파일로 모아서 관리하는것이 일반적이다. 
	 * 
	 * VO(value Object 값을 전달하는 )
	 * -가치가 있는 클래스를 표현하기 위한 목적으로 사용하는 클래스
	 * -객체지향으로 설계된 클래스
	 * -application의 핵심적인 역할을 수행하는 클래스를 정의하는 클래스며, 데이터의 불변성이
	 * 유지되어야 하기 때문에 데이털,ㄹ 중간에 변경할수 있는 setter메서드는 저의하지 않는다
	 * -캡슐화 밒 상속리 구현이 되어 있으며, equals&hashcode 등 객체의 기능을 정의하는 메서드들이 있다. 
	 * 
	 */
	private Long id;
	private Date synchedAt;
	private KakaoAccount KakaoAccount;
	
	public static class KakaoAccount{
		private boolean profileNeedsAgreement;//프로필 제공 동의 항목
		private Profile profile;
	}
	public static class Profile{
		private String nickname;
		private String thunmbnailImageUrl;
	}
}
