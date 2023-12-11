package com.summer.study3.rpg;

public class Magiction {
	

	String name;
	int hp;
	int mp;
	
	public void info() {
		//String name = "abc";
		//맴버 메서드 내에서 멤버 변수를 접근해서 사용 가능
		//name="iu";
		System.out.println(this);
		System.out.println("Name:"+this.name);
		System.out.println("HP:"+this.hp);
		this.t1();
		t1();
	}

	
	public void t1 () {
		System.out.println("Test 메서드 입니다");
		this.info();
	}
}
