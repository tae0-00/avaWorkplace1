package com.kh.practice.chap02.loop.copy;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc= new Scanner(System.in);
	
	public void practice1(){
		/*
		 * ?‚¬?š©?ë¡œë??„° ?•œ ê°œì˜ ê°’ì„ ?…? ¥ ë°›ì•„ 1ë¶??„° ê·? ?ˆ«?ê¹Œì??˜ ?ˆ«??“¤?„ ëª¨ë‘ ì¶œë ¥?•˜?„¸?š”.
?‹¨, ?…? ¥?•œ ?ˆ˜?Š” 1ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ì•„?•¼ ?•©?‹ˆ?‹¤. ë§Œì¼, 1 ë¯¸ë§Œ?˜ ?ˆ«?ê°? ?…? ¥??‹¤ë©?
??1 ?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”?ê? ì¶œë ¥?˜ë©´ì„œ ?‹¤?‹œ ?‚¬?š©?ê°? ê°’ì„ ?…? ¥?•˜?„ë¡? ?•˜?„¸?š”.
ex.
1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 4 1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 0
1 2 3 4 1 ?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”.
1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 8
1 2 3 4 5 6 7 8
		 */

		while (true) {
			System.out.println("1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”.");
			} else {
				for (int i = 1; i <= num1; i++) {
					System.out.print(i + " ");
				}
			// ifë¥? ?’¤ë¡? ë³´ë‚´ê³? ê·¸ëƒ¥ ?‹¤?–‰ì½”ë“œ ?‹¤?‹œ ë¶ˆë¥´ë©? ?¨ practice1();
			}

		}
	}
	public void practice2(){
		
		/*
		 * ?‚¬?š©?ë¡œë??„° ?•œ ê°œì˜ ê°’ì„ ?…? ¥ ë°›ì•„ 1ë¶??„° ê·? ?ˆ«?ê¹Œì??˜ ëª¨ë“  ?ˆ«?ë¥? ê±°ê¾¸ë¡? ì¶œë ¥?•˜?„¸?š”.
?‹¨, ?…? ¥?•œ ?ˆ˜?Š” 1ë³´ë‹¤ ?¬ê±°ë‚˜ ê°™ì•„?•¼ ?•©?‹ˆ?‹¤. ë§Œì¼ , 1 ë¯¸ë§Œ?˜ ?ˆ«?ê°? ?…? ¥??‹¤ë©?
??1 ?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”?ê? ì¶œë ¥?˜ë©´ì„œ ?‹¤?‹œ ?‚¬?š©?ê°? ê°’ì„ ?…? ¥?•˜?„ë¡? ?•˜?„¸?š”.
ex.
1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 4 1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 0
4 3 2 1 1 ?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”.
1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : 8
8 7 6 5 4 3 2 1
		 */
		
		while (true) {
			System.out.println("1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1?´?ƒ?˜ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š”");
			} else {
				for (int i = num1; i >= 1; i--) {
					System.out.println(i + " ");
				}

			}

		}
	}

	public void practice3() {

		System.out.println("? •?ˆ˜ë¥? ?•˜?‚˜ ?…? ¥?•˜?„¸?š” : ");
		int num1 = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num1; i++) {
			sum += i;
			System.out.print(i + (i != num1 ? "+ " : "= "));

		}
		System.out.println(sum);

	}

	public void practice4() {

		System.out.println("ì²«ë²ˆì§? ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : ");
		int num1 = sc.nextInt();

		System.out.println("?‘ë²ˆì§¸ ?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : ");
		int num2 = sc.nextInt();

		if (num1 < 1 && num2 < 1) {
			System.out.println("1 ?´?ƒ?„ ?…? ¥");
			practice4();
			return;
		}
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			System.out.println(i + " ");
		}

	}

	public void practice5() {
		while (true) {
			System.out.println("?ˆ«? : ");
			int num1 = sc.nextInt();

			if (num1 > 9) {
				System.out.println("9?´?•˜ë§? ");
				continue;
			}
			for (int dan = num1; dan < 10; dan++) {
				System.out.println("=====" + dan + "?‹¨ =====");
				for (int i = num1; i < 10; i++) {
					System.out.println();
				}
			}
			break;
		}
	}

	public void practice6() {
		System.out.println("?‹œ?‘ ?ˆ«? : ");
		int num1 = sc.nextInt();

		System.out.println("ê³µì°¨ : ");
		int gong = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " ");
			num1 += gong;
		}

	}

	public void practice7() {
		while (true) {
			System.out.println("¿¬»êÀÚ : ");
			String oper = sc.next();

			if (oper.equals("exit")) {
				System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
				break;
				
			} else {

				System.out.println("Á¤¼ö1 : ");
				int num1 = sc.nextInt();

				System.out.println("Á¤¼ö2 : ");
				int num2 = sc.nextInt();

				
				
				switch (oper) {
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				case "/":
					System.out.println(num1 / num2);
					if (num2 == 0) {
						System.out.println("0À¸·Î ¾ÈµÅ ¤§¤¿½Ã ÀÔ·Â");
						continue;
					}
					break;
				case "%":
					System.out.println(num1 % num2);
					break;
				default:
					System.out.println("¿¬»êÀÚ ¾øÀ½");
				}

			}
		}
		
			 
		 }
	 public void practice8() {
		 System.out.print("Á¤¼ö ÀÔ·Â :");
		 int num = sc.nextInt();
		 
		 for(int i=1; i<num; i++) {
			 System.out.print("*");
		  for (int j = 1; j < num; j++ ) {
			
		 }
		 System.out.println("");
		 }
		 
		
		 
	 }
	 public void practice9() {
		 System.out.print("Á¤¼ö ÀÔ·Â :");
		 int num = sc.nextInt();
		 
		 for(int i=num; i>=num; i--) {
			 for (int j = 1; j < 5; j++ ) {
			 System.out.print("*");
			 }
			 System.out.println("");
		 }
	 }
//	 public void practice10() {
//		 System.out.print("¼Ò¼ö ÀÔ·Â :");
//		 int num = sc.nextInt();
//		 /** ¡®¼Ò¼ö¡¯´Â nÀ» 1ºÎÅÍ n±îÁö·Î ³ª´©¾úÀ» ¶§ ³ª´©¾î ¶³¾îÁö´Â ¼ö°¡ 1°ú n»ÓÀÎ ¼ö¸¦ ¸»ÇÑ
//		  * 
//		  */
//		 int so =num%1
//		for(int i= num%1) {
//	
//		}
		 
		 
		 
	 
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 /*public void practice11(){
		 System.out.print("¼ıÀÚ ÀÔ·Â");
		 int num1 =sc.nextInt();
		 for(int i=1; i<=num1; i++) {
			System.out.println(i+" "); 
		 }
		 if(num1<1) {
			 System.out.println("ÀÌ»óÀ» ÀÔ·ÂÇØ");
			 practice11();
		 }
	 }
	 public void practice22(){
		 System.out.print("¼ıÀÚ ÀÔ·Â");
		 int num1 =sc.nextInt();
		 
		 for(int i=num1; i>=num1; i--) {
				System.out.println(i+" "); 
		 }
	} */