package package3.controller;


import package3.model.vo.*;
//부모 자식 클랫스는 이걸 항상 바꿀것 

public class AnimalManager {
	public static void main(String[] args) {
		Animal [] arr= new Animal[5];
		arr[0]= new Cat("키티","고양이","집","하양");
		arr[1]= new Dog("멍멍이","강아지",10);
		arr[2]= new Dog("코비","큰개",30);
		arr[3]= new Cat("나비","냐옹이","길","노랑");
		arr[4]= new Dog("흰둥이","흰강아지",7);
		
		for(Animal an : arr) {
			an.speak();
		}
		//for(int i=0; i<arr.length;i++) {
			//arr[i].speak();
		//}
	}
	
}
