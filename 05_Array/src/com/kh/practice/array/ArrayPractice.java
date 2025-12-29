package com.kh.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		int[] org = new int [10];
		int value =10; 
		for(int i=0; i<org.length; i++ ) {
			org[i]=value--;
			System.out.print(org[i]+ " ");
		}
		
	
	}
	public void practice100(){
		int [] arr = new int [10];
		int value = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=value--;
			System.out.print(arr[i]);
		}
		
	}
	public void practice200(){
		System.out.print("양 정수: ");
		int num =sc.nextInt();
		
		int [] arr = new int [num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]);
		}
	}
	
	public void practice300(){
		int [] arr= new int [10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]);
		}
		
	}
	
	
	public void practice400(){
		
		String [] arr = {"월 " , "화","수","목", "금","토", "일" };
		
		System.out.print( " 0~6");
		int num =sc.nextInt();
		
		if (num<0 || num>6) {
			System.out.println("잘못 입력");
			return;}
		for(int i=0; i<arr.length; i++) {
			
			//fo문에 프린하면 배열의 길이 만큼 다 프린트 되니까 한번 출력은 포문 밖에서,,
		}	
		System.out.println(arr[num]+"요일");
		
	}
	
	public void practice500(){
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		int [] arr= new int [num];
		int sum=0;
		for(int i=0; i <arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
			sum += arr[i]; 
			
		}
		System.out.println("\n종합 : "+ sum);
	}
	
	public void practice600(){
		
//			문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
			System.out.print("문자열 : ");
			String str = sc.next();
			char[] arr = str.toCharArray();
			
			System.out.print("문자열에 있는 문자 : ");
			int count = 0;
			// 전체 문자 반복
			for(int i =0; i< arr.length; i++) {
				char ch = arr[i]; // 중복인지 검사하고자 하는 문자.
				
				// 문자 중복 검사
				// 현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인.
				boolean isDup = false;
				for(int j = 0; j<i; j++ ) {
					if(ch == arr[j]) {
						// 중복
						isDup = true;
						break;
					}
				}		
				if(!isDup) {
					System.out.print(ch + ", ");
					count++;
					
				}
			}
			System.out.println("\n문자 개수 : "+count);
//			문자의 개수와 함께 출력하세요
		

	}
	public void practice601(){
		System.out.print("문자열 : ");
		String str= sc.next();
		
		char [] arr = str.toCharArray();// 이건 문자열로 받은 값을 배열에 하나씩 저장하고 싶을떄 사용
				// 위에 있는 월화수목 문제랑 다른 이유는 월화수는 이미 월화수가 배열에 문자로 들어가 있는거
				// 그러기때문에 굳이 to차트를 사용할 필요가 없었다. 
		
		 		//인트였다면 이게 int [] srt = new int [str];
		System.out.print("문자열에 있는 개수 : ");
		int count = 0;
		for(int i= 0; i<arr.length; i++) {
			char ch = arr[i];//이거를 해야하는 이유가 뭐까나?,, ch의 값을 설정해서 arr[i}의 각각의 결과 값과 
			//				ch가 같으면 중복이 되는걸 설정해야하니까 자리..? 설정은 필요가없나,,? 아 그래서 다시 for문하는구나
			//  			근데 못하겠어,,이핵ㅏㅜ퓡ㅍ 
			
			
			//for(int j=0; j<i j++)// 0의 자리값에,,  i,,? 여기서 i가 뜻하는게 뭐지? arr[i]의 길이값?은 아니고,,
			// arr[i]의 하나씩 나온 결과값 전부를말하건가,,? 그러면 0일때 a가되고 1때 p가 2일때 P가되지요.. 아닌데 이건 위에 배열값인데,,
			//저기에서 내가 궁금한거가 j가 0부터 시작이고 i보다는 작은건데 아 이건 그냥 반복문이니까 배열이랑 상관이 없이 위에 i가 에 숫자가 아니지 않나?
			//아 아니네 i가 위에서 이미 배열로 application이 완성된건가?.. 아 이게 포문 안에 포문으로 되니까 외부가 도는동안 내부는 항상 
			//i 완성인 application이 완성 될떄까지 도니까 위에 i가 0이여서 a면 j는 그냥 중복을 확인할 문자가 없는거고 에 아닌데
			//아 이게 포문 안에 포문으로 되니까 외부가 도는동안 내부는 항상 
			//i 완성인 application이 완성 될떄까지 돈다? 이 의미 아니지야 j도 i가 =3일때 app까지만 도는 의미인거지? (i보다 작다)
			
			boolean isdup= false;
			
			for (int j=0; j<i; j++) {
				if (ch==arr[j]) {//그럼 arr[i]의 결과값들인 ch이랑 
					isdup= true;// 이 아이들이 필요한 이유는 뭐지 이게 참 트루로 결과를 실행할지 안할지 만드는거라서 얘가 트루 일때만 실행이되니까
					//중복일때만 값이 나가고 아니면 멈추고 이걸 실행돌리게 만드는 코드로 인식 바로 잘해야함 인트나 스트링으로 보면 안됌 
					break;
				}
				}
			if(!(isdup)){//위에랑 똑같이 얘가 이제 트루가 되니까 그값들을 나오게 함  
				//그리고 위에 포문은 포문안에 포문이니까 이 이프는 위에 포문의 이프로 잘 인식해야해 안그럼 의미가 헷갈려
				System.out.print(ch+ " , ");
				count++;
			}
			}
		
		System.out.println("\n문자 개수 : "+ count);
		}
	
	public void practice602() {
		System.out.print("문자열을 입력하세요 : ");
		String str =sc.next();
		
		int count =0;
		char [] arr =str.toCharArray();
		System.out.print("문자열에 있는 문자 :");
		for(int i=0; i<str.length(); i++) {
			char ch = arr[i];
			 
		
		boolean isDup = false;	 
		for(int j=0; j<i; j++) {
			if(ch==arr[j]) {
				isDup = true;
				break; 
			}
			}
		if(!(isDup)) {
			System.out.print(ch +  ", ");
			count++;
		}
		}
		System.out.println("\n문자 개수: "+ count);
	}
	
	public void practice2(){
		System.out.print("양의 정수:" );
		int num =sc.nextInt();
		
		
		int [] org = new int [num];
		
		for( int i=0; i<org.length; i++) {
			org[i]=i+1;//1을 추가한 이유는 1부터 입력받은 값을 구해야해서
			System.out.print(org[i] + " ");
		}
	}
	public void practice3() {
		
		
		int [] org = new int[10];
	
		for(int i=0; i<org.length; i++) {
			org[i]=(int)(Math.random()*10+1);
			
			System.out.print(org[i]+" "); 
		}
		//System.out.println(Arrays.toString(j));
		}
		
		
		

	
	
	public void practice4() {
		
		String [] org = { "월","화","수","목","금","토","일"};
		System.out.print("\n0~6 사이의 숫자 입력:");
		int num =sc.nextInt();
		
		if(num>6|| num<0) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
			
			System.out.println(org[num]+"요일");
			// org 배열에 num의 값인 자리의 숫자를 넣었을때 나오는 값
						
		}
	 public void practice5(){
		 System.out.print("정수");
		 int num=sc.nextInt();
		 
		 int [] arr = new int[num];
		
		 for( int i=0; i<arr.length; i++) {
			 arr[i]=sc.nextInt();
		 }
		 for( int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]);
			
		 }
	 }	
	 
		
	 public void practice6(){
		 //전체문자 반복
		 //중복인지 검사하고자 하는 문자
		 
		 //현재 위치에서 앞쪽의 단어들 중 현재 단어와 일피하는 값이 있는지 확인
		 //중복이 아닌 애들이 구해뎠을때만 카운트를 더함 
		 
	 }
		
		public void practice7() {
			System.out.print("문자열을 입력:" );
			String str =sc.next();
			
			char [] arr = str.toCharArray();//문자열을 문자배열로 뱐환하느느 메서드
			
			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);
			
			
			System.out.print(str + "에 " + ch+"가 존재하는 위치(인덱스): ");
			int count =0;
			//여기서 이제 인덱스 값이랑 그 ch랑 같아지는 순간의 인덱스값을 노게 만들어야하는데
			//인덱스는 일단 i일테고 if문으로 음 
			//
			for(int i=0; i< arr.length; i++) {
				if(arr[i]==ch) {//이 부분이 잘 이해가 안돼 아니야 그니까 arr[i]배열이 돌고 있을때 
					//ch랑 같아지면 인덱스 i(자리 값)을 나오게 한다는건데 
					//arr[i]이게 전체의 application을 말하는거 아니고 
					//arr[1,2,3,4,5,6] 이런식으로 돌다가 그때 ch랑같은 값을 출력하는 번호가 되면 출력된다..!?
					count++;
					System.out.print(i + " ");
				}
			}//나 이거 개수 안했다,,
		}
		public void practice8() {
			System.out.print("주민번호를 입력하세요 : ");
			String num = sc.next();// 중간에 들어가는-때문에 문자열로 받아야한다는거 잊지 않기!!
			
			
			
		    char [] org = num.toCharArray();
		    
		    char [] copy = Arrays.copyOf(org,org.length);// 여기에 num으로 넣으면 안더ㅣㅁ
		    //											위에서 org배열 만들었으니까 org배열로 써야함
		   
		    boolean isDup= false;//나 이거 왜 함?
		    for(int i=0; i<copy.length;i++ ) {
		    	if(i>=8) {
		    		
		    		System.out.print("*");
		    	}
		    	else {
		    	 System.out.print(copy[i]);
		    	}
		    }
		   
			
		}
		
		public void practice9() {
			int [] arr =new int[10];
			
			for(int i=0; i< arr.length; i++) {
				arr[i]=(int)(Math.random()*10)+1;//여기서 나는 랜덤값을 1부터 뽑고싶으니까 +1을 함 만약 0부터 하는거거나 배열안에 문자로 있으면 
												//안해야 함
				
				System.out.print(arr[i]+" ");//선생님 출력ㅁㄴ 항사 ㅇ포문 만들어야하나여?
			}
				int max= arr[0];
				int min =arr[0];
				for(int i=1; i<arr.length; i++) {
					if(arr[i]> max ) {//이게랜덤값이라는걸 잘 이해야하람
						max= arr[i];
						
					}
					if(arr[i]<min) {
						min= arr[i];
						
					}
				}
				System.out.print("\n최대값 :" + max);
				System.out.print("\n최소값 :"+ min);
				
				//궁금증1. 나는 지금 랜덤값을 arr에 잘 입력한거같은데?왜 랜덤값이 나오지 않는거,,
				//=>>랜덤값은 잘 나오긴 함,,다만 코드 배치문제와 코드를 잘못 짬 (아래서 설명) 
				
				//궁금증 2. if로 i가 최대값인 arr.length을 만나면 최대값을 출력하게 한거같은데 왜 나오지도 않는지 	
				//=>>출력이 안된다는건 내가 조건식을 잘못썻다는거같은데 뭐가 문제지?
				//이건 내 실수 위에서 당연히 길이보다 적게 돌게 했으니까  길이에 -1을 해줘야 하고
				
			
				//궁금증3번. 지금 최소값은 제대로 나오고 있는건지 /저 6은 뭔지..??.
				//=>> 코드를 아예 잘못짬 안나오는건 아니지만 내가 랜덤값을 출력하기 때문에 
				//랜덤값의 자리의 순서(첫번째 마지막)를 최대 최소로 출력 하고 있는거임
				//그러기에 최댁값으로 마지막에 출력한 6이 최대로 출력된거임
				//그러기에 최대 최소를 구하는 for문의 코드를 새로 짜야함!!!!
				
				// 궁금증 4번. 왜 최소값 뒤에 랜덤값이 나오고 있는거 같은데 왜 그런지
				//=>>일단 이런식으로 출력이 꼬인이유는 내가 FOR문 안에 IF를 넣으면서 IF의 조건을 먼저 만족시켜버리는 
				//최소값의 값을 출력해내고 있음 그래서 최소값 뒤에 랜덤값들이 출력되고 있는거임 저 10은 먼저 위에 쓴 포문의 출력이고 
				//if를 만나면서 최소값 출력 뒤에 램덤값이 나오고 있음
				//
				//최대 최소 비교 포문 
				//저기는 1부터 시작하는 이유는 값이 1부터 나오게 하려고 한거니까 저기서의 i는 출력값 i를 말하는건가,,?
				//그래서 1부터인거고 ?? 초기식한 max보다 크다는 의미는 
				//{1,2,3,4,,9,10}보다 크면 max라는건데 그러면 11이자나? 아닌가? 
				//똑같이 min도 작으면 0이라는거 아냐?? 이해가 안돼,,
				//>>그니까 이미 배열안에 있는 값들로 비교를 하는거고 그 안에서 arr[i]의 값들이 하나씩 비교되는데 
				// 우리는 초기를0으로 했고 그럼 사실 123456789까지 계석 코드는 트루트루로 나오다가 마지막10에서 딱 끝난거고
				//  min은 사실 그냥 1딱 비교하고 바로 트루가 나오고 그 뒤에는 다 거짓이니까 처음 1값이 나온다?
				
				//i랑 비교하는게 아니라 배열안에 들어가 있는 값들고 비교하는거니까
				//i가 아니라 arr[i]랑 비교해야 함
				//괄호 또 실수 함 첫번재 포문은 끝내고 랜덤값은 뽑아야함
				//쟤를 if문 다 끝나고 놓으면 arr[i]의 값이 최소값으로 변해있음?? 이 의미 맞을까? 아님
				 //>>arr[i]의 값이 변한게 아니라 min이 변하면서 이렇게 됨
				//0이 나오는 이유도 중괄호를 첫번째 포문 밖에 놓으면 ? 
				 //랜덤 대입전 출력을 했다?? 내가 하려는게 뭔지 잘 파악해보자,, 
			
		}
		public void practice10() {
			int [] arr= new int[10];
			
			for (int i = 0; i < arr.length; i++) {

				while (true) {
					boolean isdup = false;
					arr[i] = (int) (Math.random() * 10 + 1);
					int random = arr[i];

					for (int j = 0; j < i; /* 이거렁 arr.legth랑 같은의미인지 */ j++) {
						if (arr[j] == arr[i]) {
							isdup = true;
							break;
						}
					}
					if (!(isdup)) {
						break;
					}
				}
				System.out.print(arr[i] + " ");
			}
		}
		public void practice1001() {
			int [] arr = new int[10];
			
			
			for(int i=0;i<arr.length; i++ ) {
			
				arr[i]=(int)(Math.random()*10+1);
			
			while(true) {	
				boolean isDup=false;
				for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
					isDup= true;
					break;
					}
				}	
			if(!(isDup)) {
				break;
			}
			}
			System.out.print(arr[i]+ " ");
		}
	}
		public void practice11() {
			
			System.out.print("정수 :");
			int num =sc.nextInt();
			
			if(num<4 || num%2==0) {
				System.out.println("다시 입력하세요.");
				practice11();//이거 잊지 말기 
				return;
			}
			int [] arr= new int[num];
			for(int i=0;i<arr.length; i++) {
				int result=arr[i];//일단 이건 의미 없는건 나도 알긴해
				//일단 여기서 i는 num값의 시작이 아니라 인덱스 인거 잊지 말기
				//포문은 인덱스0부터 시작해야 돼
				arr[i]=i+1;
		
				if (i <= num / 2) {
					arr[i] = i + 1;//i의 인덱스는 인덱스용으로만 사용하고 안에서 사용은 안하는걸 추천
				}else {
					arr[i]=num -i;//mid 만들어서 해야할듯 
				}
				System.out.print(arr[i] + " ");
			}
		}
		public void practice1100() {
			System.out.print("정수 :");
			int num = sc.nextInt();
			if(num%2==0|| num<4) {
				System.out.println("다시입력하세요.");
				practice1100();
				return;
			}
			
			int [] arr = new int [num];
			
			for(int i=0; i<arr.length; i++) {
				if(i<num/2) {
					arr[i]= i+1;
				}
				else {
					arr[i]= num-i;
				}
				System.out.print(arr[i]);
			}
		}			
		public void practice12() {
			System.out.print("배열의 크기를 입력하세요: ");
			int num1 =sc.nextInt();
			
			sc.nextLine();//개행문자 제거
		
			String [] arr = new String [num1];
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+"번째 문자열: ");
				arr[i]=sc.nextLine();//띄어쓰기포함. 
			}
			while(true) {
			System.out.print("\n더 값을 입력하시겠습니까? (y/n) :");
			char ch =sc.nextLine
					().charAt(0);
			
			if(ch=='n'||ch=='N') {
				break;
			}
			if(ch=='y'||ch=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				
				String [] arr2 = new String [num2+arr.length];
				for(int i=0; i<arr.length; i++) {
					arr2[i]=arr[i];
				}
				for(int i=arr.length; i<arr2.length; i++) {
					System.out.print((i+1) +"문자열: ");
					arr2[i]= sc.next();
				}
			
			arr=arr2;//이걸 그냥 이렇게만 해도 배열의 값들이 변하나?
			}
			}	
			 System.out.println(Arrays.toString(arr));
		} 	
			
			
}
