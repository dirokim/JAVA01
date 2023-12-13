package com.summer.study3.rpg;

public class Magiction extends Character {
	
	
	private int mp;
	
	
	
	public void info() {
		//String name = "abc";
		//맴버 메서드 내에서 멤버 변수를 접근해서 사용 가능
		//name="iu";
	super.superInfo();
	System.out.println(this.mp);
	}

	
	public void t1 () {
		System.out.println("Test 메서드 입니다");
		this.info();
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
	
}
