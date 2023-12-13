package com.summer.study3.Himart;

public class Tv extends Himart {

	private String color;
	
	
	//생성자 기본값넣기
	
	
	public Tv() {
		this.color="black";
		this.setSize(100);
		this.setPrice(1000);
		this.setBrand("Samsung");
		this.setPoint(25);
		
	
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
