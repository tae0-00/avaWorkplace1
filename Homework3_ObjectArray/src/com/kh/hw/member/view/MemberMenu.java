package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc= new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}

	public void mainMenu() {
		while(true){
	System.out.println("최대등록 가능한 회원수는 "+ MemberController.SIZE+"명 입니다.");
		System.out.println("현재등록된 회원 수는 "+ mc.existMemberNum()+"명 입니다.");
		if(!(mc.existMemberNum()==MemberController.SIZE)) {
			System.out.println("1. 새 회원 등록 : ");
		}
		else {
		System.out.println("회원수가 모두 찼기때문에 일부 메뉴만 오픈됩니다.");
		}
		System.out.println("2. 회원 검색 : ");
		System.out.println("3. 회원 수정 : ");
		System.out.println("4. 회원 삭제 : ");
		System.out.println("5. 모두 출력 : ");
		System.out.println("9. 끝내기 ");
		System.out.print("메뉴번호 : ");
		
		int num = sc.nextInt();
		if(!(num==1 || num==2 || num==3|| num ==4|| num==5|| num==9)) {
			System.out.println("잘못입력하셔습니다. 다시 입력해 주세요");
			continue;
		}
		if(mc.existMemberNum()==MemberController.SIZE&&num==1) {
			System.out.println("잘못입력했습니다. 다시 입력해주세요. ");
			continue;
		}
		
		switch(num) {
		case 1: insertMember();
		break;
		case 2 : searchMember();
		break;
		case 3 : updateMember();
		break;
		case 4 : deleteMember();
		break;
		case 5 : printAll();
		break;
		case 9 : System.out.println("프로그램 종료합니다. ");
		return;
		}
	}
	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 :");
		String id = sc.next();
		while(mc.checkId(id)) {
			
			System.out.println("중복된 아이디입니다.  다시 입력헤주세요 ");
			System.out.print("아이디 : ");
			id = sc.next(); 
			
		}
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("성별(M/F) :");
		char gender;
		while(true) 
		{ gender = sc.next().charAt(0);
		if(gender=='f'||gender=='F'||gender=='m'||gender=='M') {
			
			break;
		}	
		System.out.println("다시 입력하세요. ");
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, password, email,gender,age);
		
	}
	public void searchMember() {
		
		System.out.println("1. 아이디 검색하기 ");
		System.out.println("2.이름으로 검색하기 ");
		System.out.println("3. 이메일로 검색하기 ");
		System.out.println("9. 메인으로 돌아가기 ");
		System.out.print("메뉴번호 :");
		int num = sc.nextInt();
		if(!(num==1||num==2||num==3|| num==9)) {
			System.out.println("잘못입력하셨습니다.");
			mainMenu();
			return;
		}
		switch(num) {
		case 1 : 
		searchId();
		break;
		case 2 : 
		searchName();
		break;
		case 3 : 
		searchEmail();
		break;
		case 9 : System.out.println("메인메뉴로 돌아갑니다.");
		mainMenu();
		return;
		}	
	}
	public void searchId() {
		System.out.println("검색할 아이디를 입력하세요 : ");
		String id=sc.next();
		 String result =mc.searchId(id);
		if(result==null) {
			System.out.println("검색 결과 없습니다");
			mainMenu();
			return;
		}
		else {	
			
			System.out.println("찾으신 회원 조회 결과입니다. ");
			System.out.println(result);
			}
		
	}
	public void searchName() {
		System.out.println("검색할 이름");
		String name = sc.next();
		
		Member [] result =mc.searchName(name);
		
		if(result==null||result.length==0) {//여기서 길이가 0인거 넣어줘야함, 
			System.out.println("검색 결과 없습니다.");
			mainMenu();
			return;
		}
		else {
			for(int i=0; i<result.length; i++) {
				System.out.println("찾으신 회원 조회 결과 입니다.  ");
				System.out.println(result[i].inform());
			}
		}
	}
	public void searchEmail() {
	
		System.out.println("검색할 이메일 입력 : ");
		String email = sc.next();
		
		Member [] result = mc.searchEmail(email);
		
		if(result==null|| result.length==0) {
			System.out.println("검색 결과가 없습니다. ");
			
		}
		else {
			for(Member m:result ) {
				System.out.println("찾으신 회원 조회 결과 입니다.");
				System.out.println(m.inform());
			}
		}
	}
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기 ");
		System.out.println("2. 이름 수정하기 ");
		System.out.println(" 3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호");
		int num=sc.nextInt();
		
	
			if(!(num==1||num==2|| num==3||num==9)) {
				System.out.println("잘못입력");
				mainMenu();
				return;
			} else {
				switch (num) {
				case 1:
					updatePassword();
					break;
				case 2:
					updateName();
					break;
				case 3:
					updateEmail();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다 ");
					mainMenu();
					return;
				
			}
		}
	}
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디 ");
		String id= sc.next();
		
		System.out.println("수정할 비밀번호 : ");
		String newpsw = sc.next();
		
		boolean change = mc.updatePassword(id, newpsw);
		if(change) {
			
			System.out.println("수정이 성공적으로 되었습니다. ");
			mainMenu();
			return;
		}
		else {
		System.out.println("존재하지 않음");
		mainMenu();
		return;
		}
	}
	public void updateName() {
		System.out.println("수정할 회원의 아이디");
		String id = sc.next();
		System.out.println("수정할 회원의 이름 ");
		String newname = sc.next();
		
		boolean update =mc.updateName(id, newname);
		
		if(update) {
			System.out.println("수정이 성공적으로 되었습니다 ");
			mainMenu();
			return;
			
		}
		else {
			System.out.println("존재하지 않은 아이디입니다.");
			mainMenu();
			return;
		}
		
	}
	public void updateEmail(){
		System.out.println("수정할 회원의 아이디 ");
		String id = sc.next();
		
		System.out.println("수정할 이메일 : ");
		String newemail= sc.next();
		
		boolean update= mc.updateEmail(id, newemail);
		
		if(update) {
			System.out.println("수정이 성공적으로 되었습니다.");
			mainMenu();
			return;
		}
		else {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
			return;
		}
	}
	public void deleteMember() {
		System.out.println("1. 특정회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기 ");
		System.out.println("9. 메인 돌아가기 ");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		
		if(!(num==1|| num==2 || num==9)) {
			System.out.println("잘못 입력하셨습니다. ");
			mainMenu();
			return;
		}
		else {
			switch(num) {
			case 1 : deleteOne();
			break;
			case 2 : deleteAll();
			break;
			case 9 : 
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			}
		}
	}
	public void deleteOne() {
		System.out.println("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.println("정말 삭제 하겠습니까? (y/n)");
		String yes = sc.next();
		if(yes.equals("Y")||yes.equals("y")) {
			boolean delete= mc.delete(id);
			if(delete) {
				System.out.println("성공적으로 삭제했습니다.");
				mainMenu();
				return;
			}
			else {
				System.out.println("존재하지 않는 아이디입니다.");
				mainMenu();
				return;
			}
		}	
		
		else {
			System.out.println("삭제가 취소됬습니다. ");
			mainMenu();
			return;
		
		}
	}
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까? (y/n)");
		String yes=sc.next();
		
		if(yes.equals("y")||yes.equals("Y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다 .");
			mainMenu();
			return;
		}
		else {
			System.out.println("삭제가 취소됬습니다. ");
			mainMenu();
			return;
		}
	}
	public void printAll() {
		Member [] all= mc.printAll();
		if(all==null||all.length==0) {
			System.out.println("저장된 회원이 없습니다. ");
		}
		else{
		for(Member m : all) {
			//if(!(m==null)) 굳이 안해도 되긴함?
				System.out.println(m);
			}
		}
	}

}



