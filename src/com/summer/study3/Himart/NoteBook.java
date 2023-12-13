package com.summer.study3.Himart;

public class NoteBook extends Himart{

	private String cpu;
	
	public NoteBook() {
		
		this.cpu="gefoce500";
		this.setBrand("apple");
		this.setPrice(110);
		this.setSize(20);
		this.setPoint(10);
	}
	

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
