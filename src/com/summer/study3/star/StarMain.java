package com.summer.study3.star;

public class StarMain {
	public static void main(String[]args) {
		//field
		//Marine 라는 객체선언
		// marine 라는 변수 선언 
		Marine marine = new Marine();
		Marine [] marines = new Marine[8];
		
		
		for(int i = 0;i< marines.length;i++) {
			Marine m = new Marine();
			
			marines[i]=m;
			marines[i].hp=40;
			
		}
		//멤버 메서드 선언 function
		// public static void main (String[]args)
		// 접근 지정자[그외지정자]리턴타입 메소드명 (매개변수 선언);
		
		
	}
}
