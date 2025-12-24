package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		/*
		 * �궗�슜�옄濡쒕��꽣 �븳 媛쒖쓽 媛믪쓣 �엯�젰 諛쏆븘 1遺��꽣 洹� �닽�옄源뚯��쓽 �닽�옄�뱾�쓣 紐⑤몢 異쒕젰�븯�꽭�슂.
		 * �떒, �엯�젰�븳 �닔�뒗 1蹂대떎 �겕嫄곕굹 媛숈븘�빞 �빀�땲�떎. 留뚯씪, 1 誘몃쭔�쓽 �닽�옄媛� �엯�젰�릱�떎硫� ��1
		 * �씠�긽�쓽 �닽�옄瑜� �엯�젰�빐二쇱꽭�슂�앷� 異쒕젰�릺硫댁꽌 �떎�떆 �궗�슜�옄媛� 媛믪쓣 �엯�젰�븯�룄濡� �븯�꽭�슂.
		 * ex. 1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : 4 1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : 0 1 2 3 4 1
		 * �씠�긽�쓽 �닽�옄瑜� �엯�젰�빐二쇱꽭�슂. 1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : 8 1 2 3 4 5 6 7 8
		 */

		while (true) {
			System.out.println("1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1�씠�긽�쓽 �닽�옄瑜� �엯�젰�빐二쇱꽭�슂.");
			} else {
				for (int i = 1; i <= num1; i++) {
					System.out.print(i + " ");
				}
				// if瑜� �뮘濡� 蹂대궡怨� 洹몃깷 �떎�뻾肄붾뱶 �떎�떆 遺덈Ⅴ硫� �맖 practice1();
			}

		}
	}

	public void practice2() {

		/*
		 * �궗�슜�옄濡쒕��꽣 �븳 媛쒖쓽 媛믪쓣 �엯�젰 諛쏆븘 1遺��꽣 洹� �닽�옄源뚯��쓽 紐⑤뱺 �닽�옄瑜� 嫄곌씀濡�
		 * 異쒕젰�븯�꽭�슂. �떒, �엯�젰�븳 �닔�뒗 1蹂대떎 �겕嫄곕굹 媛숈븘�빞 �빀�땲�떎. 留뚯씪 , 1 誘몃쭔�쓽 �닽�옄媛�
		 * �엯�젰�릱�떎硫� ��1 �씠�긽�쓽 �닽�옄瑜� �엯�젰�빐二쇱꽭�슂�앷� 異쒕젰�릺硫댁꽌 �떎�떆 �궗�슜�옄媛� 媛믪쓣
		 * �엯�젰�븯�룄濡� �븯�꽭�슂. ex. 1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : 4 1�씠�긽�쓽 �닽�옄瑜�
		 * �엯�젰�븯�꽭�슂 : 0 4 3 2 1 1 �씠�긽�쓽 �닽�옄瑜� �엯�젰�빐二쇱꽭�슂. 1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂
		 * : 8 8 7 6 5 4 3 2 1
		 */

		while (true) {
			System.out.println("1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂 : ");
			int num1 = sc.nextInt();

			if (num1 < 1) {
				System.out.println("1�씠�긽�쓽 �닽�옄瑜� �엯�젰�븯�꽭�슂");
			} else {
				for (int i = num1; i >= 1; i--) {
					System.out.println(i + " ");
				}

			}

		}
	}

	public void practice3() {

		System.out.println("�젙�닔瑜� �븯�굹 �엯�젰�븯�꽭�슂 : ");
		int num1 = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num1; i++) {
			sum += i;
			System.out.print(i + (i != num1 ? "+ " : "= "));

		}
		System.out.println(sum);

	}

	public void practice4() {

		System.out.println("泥ル쾲吏� �닽�옄瑜� �엯�젰�븯�꽭�슂 : ");
		int num1 = sc.nextInt();

		System.out.println("�몢踰덉㎏ �닽�옄瑜� �엯�젰�븯�꽭�슂 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 && num2 < 1) {
			System.out.println("1 �씠�긽�쓣 �엯�젰");
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
			System.out.println("�닽�옄 : ");
			int num1 = sc.nextInt();

			if (num1 > 9) {
				System.out.println("9�씠�븯留� ");
				continue;
			}
			for (int dan = num1; dan < 10; dan++) {
				System.out.println("=====" + dan + "�떒 =====");
				for (int i = num1; i < 10; i++) {
					System.out.println();
				}
			}
			break;
		}
	}

	public void practice6() {
		System.out.println("�떆�옉 �닽�옄 : ");
		int num1 = sc.nextInt();

		System.out.println("怨듭감 : ");
		int gong = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " ");
			num1 += gong;
		}

	}

	public void practice7() {
		while (true) {
			System.out.println("연산자 : ");
			String oper = sc.next();
			char ch =oper.charAt(0);
			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;// 와일 참일때 브레키트 없으면 아래코드 실행안되면서 오류남
			} else {

				System.out.println("정수1 : ");
				int num1 = sc.nextInt();

				System.out.println("정수2 : ");
				int num2 = sc.nextInt();
				
				// if (num2 < 0) {
				// System.out.println("0으로 안돼 ㄷㅏ시 입력");
				// continue;
				// }
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
						System.out.println("0으로 안돼 ㄷㅏ시 입력");
						continue;
					}
					break;
				case "%":
					System.out.println(num1 % num2);
					break;
				default:
					System.out.println("연산자 없음");
				}

			}
		}

	}

	public void practice8() {
		System.out.print("정수1 입력 :");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void practice9() {
		System.out.print("정수 입력 :");
		int num = sc.nextInt();

		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {

		System.out.print("숫자 입력 :");
		int num = sc.nextInt();
		/**
		 * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한 // * //
		 */
		if (num < 2) {
			System.out.println("잘못입력");
			return;
		}
		/*소수판별식
			/*for (int i = 1; i <= num; i++) {
		
		if (num%i == 0) {
			System.out.print("소수 아닙니다.");
			*/
		for (int i = 1; i <= num; i++) {
			int re = num % i;
			if (re == 0) {
				System.out.print("소수 아닙니다.");
			}

			else {
				System.out.println("소수입니다.");
			}

		}

	}

	public void practice11() {
		System.out.print("숫자 :");
		//아닌 코드를 먼저 이프로 만들고 브레으크?/왜ㅑ 리턴이지?
		int num1 = sc.nextInt();
		if (num1 > 2) {
			for (int i = 2; i <= num1; i++) {
				System.out.print(i);
			}
			System.out.println("2부터" + num1 + "까지의 소수의 개수는" + "개입니다.");
		} else {
			System.out.println("잘못");
		}
	}

	public void practice12() {
		System.out.print("자연수 하나 입력:");
		int num1 = sc.nextInt();

		int gong2 = num1 % 2;
		int gong3 = num1 % 3;
		int count = 0;
		for (int bs = 2; bs < num1; bs += 2) {
			System.out.print(bs);
			
		}
		System.out.println(" ");
		for (int bs = 3; bs < num1; bs+= 3) {
			System.out.print(bs+ " ");
			
		}

		if (gong2% 2==0) {
			
		}
		if (gong2% 2==0) {
			//2와 3배수랑 공배수로
		}
	}

	public void practice111() {
		System.out.print("숫자 :");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			System.out.println(i + " ");
		}
		if (num1 < 1) {
			System.out.println("이상을 입력해");
			practice111();
		}
	}

	public void practice22() {
		System.out.print("숫자 입력");
		int num1 = sc.nextInt();

		for (int i = num1; i >= num1; i--) {
			System.out.println(i + " ");
		}
	}
}
