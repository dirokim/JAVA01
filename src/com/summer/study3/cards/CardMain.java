package com.summer.study3.cards;

public class CardMain {
	public static void main(String[]args) {
		
		Card card = new Card(10,1,"dia","red");
		Card card2 = new Card(10,1,"Heart","red");
		Card.size=50;
		card.info();

		card2.info();
		//클래스 변수
		//클래스명.변수명


	}
}
