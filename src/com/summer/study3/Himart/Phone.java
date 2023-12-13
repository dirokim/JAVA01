package com.summer.study3.Himart;

public class Phone extends Himart {

	private int pixel;
	private String model;
	
	
	public Phone() {
		this.pixel=200;
		this.model="S";
		
	}
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
