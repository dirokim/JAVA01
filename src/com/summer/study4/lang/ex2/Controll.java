package com.summer.study4.lang.ex2;

import java.util.Scanner;

public class Controll {
	Scanner sc = new Scanner(System.in);
	Service service = new Service();
	
	public void start() {
		
		System.out.println("주민번호 입력"); //991225-1234567
		String sum = sc.next();
		boolean check = true;
	
		
				
			
		
		while(check) {
			System.out.println("1.남자여자 구별");
			System.out.println("2.대략나이");
			System.out.println("3.태어난계절");
			System.out.println("4.주민 타당");
			System.out.println("5.프로그램 종료");
			
			int num = sc.nextInt();
			switch(num) {
			
			case 1 :
				service.gender(sum);
				break;
			case 2 :
				service.age(sum);
				break;
			case 3 : 
				service.weather(sum);
				break;
			case 4 :
				service.tadang(sum);
				break;
			case 5 :
				check=false;
				break;
				
			
			
			}
			
		}
		
		
		
	}
}
