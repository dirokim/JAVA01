package com.summer.study3.rpg;

public abstract class Character {
	private String name;
	private int hp;
	
	
	public void superInfo() {
		System.out.println(this.name);
		System.out.println(this.hp);
	}
	public abstract void attack() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
	
}
