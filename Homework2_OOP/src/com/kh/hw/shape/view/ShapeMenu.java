package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

   private Scanner sc = new Scanner(System.in);
   private SquareController scr = new SquareController();
   private TriangleController tc = new TriangleController();

   public void inputMenu() {
      while (true) {
         System.out.println("====도형 프로그램====");
         System.out.println("\n3. 삼각형");
         System.out.println("4. 사각형");
         System.out.println("9. 프로그램 종료");
         System.out.print("메뉴 번호 : ");
         int num = sc.nextInt();
         if (!(num == 3 || num == 4 || num == 9)) {
            System.out.println("잘못된 번호입니다. 다시 입력하세요 ");
            continue;

         }

         if (num == 3) {
            triangleMenu();
         }
         if (num == 4) {
            squareMenu();
         }
         if (num == 9) {
            System.out.println("프로그램 종료 ");
           return;
         }
      }

   }

   public void triangleMenu() {
      while (true) {
         System.out.println("\n1.삼각형 면적");
         System.out.println("2. 삼각형 색칠");
         System.out.println("3. 삼각형 정보");
         System.out.println("9. 메인으로 ");

         System.out.println("메뉴번호 ");
         int num2 = sc.nextInt();
         if (!(num2 == 1 || num2 == 2 || num2 == 3 || num2 == 9)) {
            System.out.println("잘못된 번호입니다. 다시 입력하세요 ");
            return;
         }
         if (num2 == 1) {
            this.inputSize(3, 1);
            continue;
         }
         if (num2 == 2) {
            this.inputSize(3, 2);
            continue;
         }
         if (num2 == 3) {
            this.inputSize(3, 3);
            continue;
         }
         if (num2 == 9) {
            System.out.println("메인으로 돌아갑니다.");
            return;

         }
      }
   }

   public void squareMenu() {
      while (true) {
         System.out.println("1.사각형 둘레");

         System.out.println("2. 사각형 면적");

         System.out.println("3. 사각형 색칠");

         System.out.println("9. 메인으로 ");

         System.out.println("메뉴번호 ");
         int num3 = sc.nextInt();
         if (!(num3 == 1 || num3 == 2 || num3 == 3 || num3 == 9)) {
            System.out.println("잘못된 번호입니다. 다시 입력하세요 ");
            return;
         }
         if (num3 == 1) {
            this.inputSize(4, 1);
            continue;
         }
         if (num3 == 2) {
            this.inputSize(4, 2);
            continue;
         }
         if (num3 == 3) {
            this.inputSize(4, 3);
            continue;
         } else if (num3 == 9) {
            System.out.println("메인으로 돌아갑니다. ");
            return;

         }
      }
   }

   public void inputSize(int type, int menuNum) {
      if (type == 3 && menuNum == 1) {
         System.out.println("높이 : ");
         int theight = sc.nextInt();
         System.out.println("너비 : ");
         int twidth = sc.nextInt();
         System.out.print("면적 : " + tc.calcArea(theight, twidth));
         return;
      }
      if (type == 4 && menuNum == 1) {
         System.out.println("높이 : ");
         int sheight = sc.nextInt();
         System.out.println("너비 : ");
         int swidth = sc.nextInt();
         System.out.println("사각형 둘레 : " + scr.calcArea(sheight, swidth));
         return;
      }
      if (type == 4 && menuNum == 2) {
         System.out.println("높이 : ");
         int sheight = sc.nextInt();
         System.out.println("너비 : ");
         int swidth = sc.nextInt();
         System.out.println("사각형 면적: " + scr.calcArea(sheight, swidth));
         return;
      }
      if (type == 4 && menuNum == 3) {
         System.out.println("색깔을 입력하세요: ");
         String color = sc.next();
         scr.paintColor(color);
         System.out.println("색이 수정되었습니다. ");
         return;
      }

   }
   public void printInformation(int type) {
		if(type==3) {
			tc.print();
		}
		if(type==4) {
			scr.print();
		}
	}
	
}
