package package3.model.vo;

public class Cat extends Animal {

	private String location;
	private String color;
	
	public Cat() {
		
	}

	public Cat( String name, String kinds,String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClolr() {
		return color;
	}

	public void setClolr(String color) {
		this.color = color;
	}

	
	
	@Override
	public void speak() {
		System.out.println(super.toString());
		System.out.println(location+ "에 서식하며, 색상은 "+ color+"입니다.");
		
	}
	
}
