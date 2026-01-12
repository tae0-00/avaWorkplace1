package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	public MusicView() {
		
	}
	public void mainMenu() { 
		while(true) {
			System.out.println("***** 메인메뉴 *****");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가 ");
			System.out.println("3. 전체 곡 목록 출력 ");
			System.out.println("4. 특정 곡 검색 ");
			System.out.println("5. 특정 곡 삭제 ");
			System.out.println("6. 특정 곡 정보 수정 ");
			System.out.println("7. 곡명 오름차순 정렬  ");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료  ");
			System.out.println("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못입력");
			}
		}
	}
	public void addList(){
		System.out.println("***마지막 위치에 곡 추가 ***");
		System.out.println("곡 명을 입력하세여");
		String title = sc.nextLine();
		
		System.out.println("가수명을 입력하세요");
		String singer = sc.next();
		
		Music music = new Music(title, singer);
		int re = mc.addList(music);
		
		while(re==1) {
			System.out.println("추가성공");
		}
		System.out.println("추가실패");
	
	}
	public void addAtZero(){
		System.out.println("****첫 위치에 곡 추가****");
		
		System.out.println("곡 명을 입력하세여");
		String title = sc.nextLine();
		
		System.out.println("가수명을 입력하세요");
		String singer = sc.next();
		System.out.println("추가성공");
		Music music = new Music(title, singer);
		int re = mc.addAtZero(music);
		while(re==1) {
			System.out.println("추가성공");
		}
		System.out.println("추가실패");
	}
	public void printAll(){ 
		List list =mc.printAll();
		System.out.println("****전체 곡 목록 출력****");
		System.out.println(mc.printAll());//(list)
	}
	public void searchMusic(){
		System.out.println("****특정 곡 검색****");
		
		System.out.println("특정 곡 명을 입력하세여");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(m==null) {
			System.out.println("검색한 곡이 없습니다");
		}
		else {
			System.out.println("검색한 곡은 "+ m.getTitle()+m.getSinger()+ "입니다.");
		}//그냥 m은 안되나?
	}
	public void removeMusic(){ 
		System.out.println("****특정 곡 삭제****");
		
		System.out.println("특정 곡 명을 입력하세여");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m==null) {
			System.out.println("삭제할 곡이 없습니다");
		}
		else {
			System.out.println( m+ "을 삭제했습니다.");
		}
	}
	
	public void setMusic(){ 
		System.out.println("****특정 곡 정보 수정****");
		
		System.out.println("검색할 곡 명을 입력하세여");
		String title = sc.nextLine();
		
		System.out.println("수정할 특정 곡명 : ");
		String edtitle =sc.nextLine();
		
		System.out.println("수정할 특정 곡 가수명 : ");
		String singer =sc.nextLine();
		
		//mc.setMusic(edtitle, singer);
		//여기서 내가 해보기 
		Music mm=mc.setMusic (title, new Music(edtitle , singer));

	}
	public void ascTitle(){
		int re =mc.ascTitle();
		if(re==1) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
	}
	public void descSinger(){ 
		int re= 
	}
}
