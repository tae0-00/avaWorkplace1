package package3.model.vo;

public class  Dog extends Animal {

	public static String place="애견카페";
	private int weight;
	
	public  Dog() {
		
	}
	public Dog(String name, String kinds,int weight) {
		super(name, kinds);
		this.weight=weight;
		
	}

	public static String getPlace() {
		return place;
	}
	public static void setPlace(String place) {
		Dog.place = place;
	}
	public int getWeigtht() {
		return weight;
	}
	public void setWeigtht(int weight) {
		this.weight = weight;
	}
	@Override
	public void speak() {
		System.out.println(super.toString());
		System.out.println("몸무게는 "+ weight+ "kg 입니다");
	}

	
	
}
