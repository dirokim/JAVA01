package com.summer.study3.star;

public class Marine {
	//접근지정자 [그외지정자] 데이터타입 변수명;
	
	
	int hp;
	Gun gun;
	
	
	
	//생성자 선언 문법
	//접근 지정자 메서드명은 클래스명과 동일([매개변수선언]){};
	public Marine() {
		System.out.println("생성자");
		this.hp=200;
		this.gun= new Gun();
	}
}
