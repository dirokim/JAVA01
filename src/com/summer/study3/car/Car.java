package com.summer.study3.car;

public class Car {
	String name;
	String company;
	String color;
	int price;
	Engine engine;
	
	// 가스 , 2000 , hp 80000
	public Car() {
		this.company="Kia";
		this.name="K5";
		this.color="Red";
		this.price=3000;
		this.engine=engine;
	}
	public Car(Engine engine) {
		
	}
	

	
//	{
//		//초기화 블럭 
//		this.company="Benz";
//		}
//public Car() {
////기본생성자 default
//	//생성자 내에서 다른 생성자를 호출할경우 사용 
//	this("Black");
//	
//	
//}
//
//public Car(String color) {
//	this("K5",color);
//	
//}
//public Car(String name, String color) {
//	this.company="Kia";
//	this.name=name;
//	this.fuel="Gas";
//	this.color=color;
//	this.price=3000;
//	this.cc=2000;
//}
//
//public void info() {
//	System.out.println("company : "+this.company);
//	System.out.println("name : "+this.name);
//	System.out.println("fuel : "+this.fuel);
//	System.out.println("color : "+this.color);
//	System.out.println("price : "+this.price);
//	System.out.println("cc : "+this.cc);
//}

}
