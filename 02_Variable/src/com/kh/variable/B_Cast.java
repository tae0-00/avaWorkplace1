package com.kh.variable;

public class B_Cast {
	/*
	 * (�ڷ�)����ȯ : ���� �ڷ����� �ٲٴ� ����
	 *  
	 * ��ǻ���� �� ó�� ��Ģ
	 * 1. �� ���� �����Ҷ��� �׻� ���� �ڷ������θ� �����ؾ� �Ѵ�.
	 *    =(���Կ�����)�� ���������� ���ʰ� ������ ���� ���ƾ���.
	 *    ����, ���� �������� �ڷ����� ���� �ٸ��ٸ�, ������ ����ȯ ������Ѵ�. 
	 * 
	 * ����ȯ�� ����
	 * 1. �ڵ�����ȯ 
	 *  - �ڵ����� ����ȯ�� ����Ǳ� ������ ���� ���� ����ȯ�� �ʿ䰡 ����.
	 *  - ��������Ʈ�� �ڷ��� => ū����Ʈ�� �ڷ���
	 *  
	 * 2. ��������ȯ
	 *  - �ڵ�����ȯ�� �Ұ����� ���, ���� ���� ����ȯ �����߸� ����Ͽ� ��ȯ
	 *  - ū����Ʈ�� �ڷ��� => ��������Ʈ�� �ڷ���
	 *  */
	public void autoCasting() {
		
		// 1. int -> double
		//     4  ->  8
		int i1 = 10;
		double d1 = /*(double)*/ i1; // double�ڷ������� ����ȯ
		
		System.out.println("d1 : " + d1);
		
		int i2 = 1000;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 + d2;
		System.out.println("result : " + result);
		
		// 2. int -> long
		//     4      8
		int i3 = 1000;
		long l3 = /* (long) */ i3;
		
		// Ư�����̽� 3. long -> float
		//             8       4
		// �Ǽ��� ����ǥ����� ����ϱ� ������ long�ڷ������� ���� �� �ִ�
		// "���� ����"�� �ξ� ũ��.
		long l5 = 100000000000L;
		float f5 = l5;
		
		// Ư�����̽� 4. char <-> int
		//             2       4
		char ch = 48124; // 65 == 'A'
		System.out.println("ch : " + ch);
		
		int num = 'A';
		System.out.println("num : " + num);
		
		// Ư�����̽� 5. byte�� short
		byte b1 = 17;
		byte b2 = 12;
		
		// byte�� byte�� ����, short�� short���� ��������
		// �׻� int�� ����Ѵ�.
		byte b3 = (byte)(b1 + b2);
	}
	
	public void forceCasting() {
		
		// 1. double -> float
		float f1 = 4.0f;
		
		double d2 = 8.0;
		float f2 = (float) d2;
		
		// 2. double -> int
		double d3 = 10.89;
		int i3 = (int) d3;
		System.out.println("i3 : " + i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum;
		// �ذ��� 1. �������� int�� ���� ��������ȯ
		int iSum = (int)(iNum + dNum);
		
		// �ذ��� 2. ���� ���� ���� dNum�� int�� ��������ȯ
		int iSum2 = iNum + (int)dNum;
	}
	
	
	
	
	
	
	
	
	
	
	
}	
