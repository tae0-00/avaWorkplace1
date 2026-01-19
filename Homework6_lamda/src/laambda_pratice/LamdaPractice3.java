package laambda_pratice;

public class LamdaPractice3 {

	public static void main(String[] args) {
		MyFunction<String, String > first= str->{
			return str.toUpperCase();
		};
		
		MyFunction<String, Boolean> sencond= str->{
			 return str.length()>=5;
		};
		
		MyFunction<String, String > third= str->{	
		String [] arr= str.split("");
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("-");
		}
			return sb.toString();
		
		};
		System.out.println(third.apply("lamda"));
		System.out.println(first);
		System.out.println(sencond);
		System.out.println(third);
	}
	@FunctionalInterface
	interface MyFunction <V,B>{
		B apply (V v);
	}
}
