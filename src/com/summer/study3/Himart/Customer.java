package com.summer.study3.Himart;

public class Customer {
	
	private int money;
	private int point;
	
	
	
	public Customer() {
		this.money=2000;
		this.point=10;
	}
	
	public void buy(Himart p) {
		//물건값 계산 
		//최종 돈과 포인트를 출력
		//돈에서-물건값
		this.money =  this.money - p.getPrice();
		this.point = this.point + p.getPoint();
				System.out.println("Money:"+this.money);
				System.out.println("Point:"+this.point);
				
		System.out.println(p instanceof Tv);
	}
}
