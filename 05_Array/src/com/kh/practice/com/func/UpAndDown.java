package com.kh.practice.com.func;

import java.util.Arrays;
import java.util.Scanner;

public class UpAndDown {
Scanner sc= new Scanner(System.in);

	public void upDown() {
		
		int random= (int)(Math.random()*100+1);
		int count =0;
		
		while(true) {
			System.out.print("\n1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
		
		if( num<1|| num>100) {
			System.out.print("1~100사이의 숫자를 입력해 주세요");
			continue;
		}
		if(random <num) {
			System.out.print("down !");
			count++;
		}
		else if(random>num) {
			System.out.print("up !");
			count++;
	}
		else  {
			System.out.println("정답입니다!");
			System.out.println(count + "회만에 맞춤");
			count++;
			break;
		}	
		
	}
}
	public void rps() {
		System.out.print("당신의 이름을 입력해주세요: ");
		String name =sc.next();
		
		
		String[] arr= {"가위","바위", "보"};
			
			int count1=0;
			int count2=0;
			int count3=0;
			while(true) {
			System.out.print("\n가위바위보 : ");
			String str =sc.next();
			
			if(str.equals("exit")) {
				break;
			}
			if(!(str.equals("가위")||str.equals("보")||str.equals("바위"))) {
				System.out.println("잘못입력");
				continue;
			}
			
			int random =(int)(Math.random()*3);//여기가 왜 *3+1이 아닌지?
			
			System.out.print("컴퓨터: "+arr[random] );
			System.out.print( "\n"+name+ ": "+str);
			String com= arr[random];
			
			if(com.equals(str)) {//이거는 비겼다는 의미가 아닌건지?
				System.out.print("\n비김");
				count1++;
			}
			
			else if((com.equals("보")&&str.equals("가위"))||
					(com.equals("가위")&& str.equals("바위"))||
					(com.equals("바위")&& str.equals("보"))
					) {
				System.out.println("\n이김! ");
				count2++;
			}
			else {
				System.out.println("\n져쓰ㅠㅠ");
				count3++;
			}
			
		}
			System.out.println(count1+count2+ count3+ "전"+ count2+"승"
								+count1+"무"+count3+"패");
	}
	public void upDown3() {
		int count =0;
		int random= (int)(Math.random()*100+1);
		while(true) {
			
			
			System.out.print("\n임의의 난수를 맞춰보세요 : ");
			int num =sc.nextInt();
			
			if(num<1||num>100) {
				System.out.println("1~100사의 숫자를 입력하세요. ");
				continue;
			}
			if(num<random) {
				System.out.print("\n up! ");
				count++;
			}
			else if(num>random) {
				System.out.print("\n Down ! ");
				count++;
			}
			else {
				System.out.println("정답입니다! ");
				count++;
				break;
			}
		}	System.out.println(count+"회만에 맞추셨습니다.");
	
	}
	public void rps2() {
		System.out.print("이름을 입력: ");
		String name = sc.next();
		
		String [] arr= {"가위","바위", "보"};
		
		int random= (int)(Math.random()*3);
		String com= arr[random];
		int count1= 0;
		int count2= 0;
		int count3= 0;
		while(true) {
			System.out.print("\n가위바위보 :");
			String str = sc.next();
			
			if(str.equals("exit")) {
				System.out.println("");
				break;
			}
			if(!(str.equals("가위")||str.equals("바위")||str.equals("보"))) {
				System.out.println("잘못입력하였습니다. ");
				continue;
			}
			System.out.println("컴퓨터 :"+ arr[random]);
			System.out.println(name + ": "+ str);
			
			
			 if (str.equals(com)) {
				System.out.println(" 비겼습니다. ");
				count1++;
			}
			 else if (str.equals("보")&&com.equals("바위")||
					 str.equals("가위")&&com.equals("보")||
					 str.equals("바위")&&com.equals("가위")){
				 System.out.println("이겼습니다.");
				 count2++;
			 }
			 else {
				 System.out.println("졌습니다ㅠㅠ");
				 count3++;
			 }
		}
		System.out.println(count1+count2+count3+"전"+count2+"승"
		                     +count1+"무"+count3+"패");
	}
}