package laambda_pratice;

public class LamdaPractice4 {

	public static void main(String[] args) {
		
		 MyFunction2 <String, Integer> printer=(name , score)->{
			    char grade ='F';
				switch (score) {
				case 90:
					grade ='A';
					break;
				case 80:
					grade ='B';
					break;

				case 70:
					grade ='C';
					break;

				case 60:
					grade ='D';
					break;
				default :
					grade ='F';
				}
				System.out.printf(name, grade);
		 };
		 printer.accept("홍길동", 95);
		 printer.accept("이순신", 88);
//			 System.out.println(name+ score);
//			if(score>=90) {
//				System.out.println("A");
//			}else if(score>=80) {
//				System.out.println("B");
//			}else if(score>=70) {
//				System.out.println("C");
//			}else if (score>=60) {
//				System.out.println("D");
//			}
			
		
	}
	@FunctionalInterface
	interface MyFunction2< K, A>{
		void accept(K k, A a);
	}
}
