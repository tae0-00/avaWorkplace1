
package laambda_pratice;

public class LamdaPractice2  {

	public static void main(String[] args) {
		Calculator <Integer>adder=(a ,b)->
			 a*b; 
		
		Calculator <Integer>finMax=(v1, v2)->
			Math.max(v1, v2);
			//Math::max
			System.out.println(finMax.operate(10, 20));
		
		Calculator <String>combiner =(v1, v2)->v1+"-"+v2;
			
	}
	
	@FunctionalInterface
	interface Calculator <V>{
		V operate (V v1, V v2);
}
}
