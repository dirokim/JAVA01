package com.summer.study4.lang.ex2;

import java.util.Scanner;

public class Ex2Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	//이름 ,주민	
		Controll controll = new Controll();
		System.out.println("주민번호 입력");//9912125 -1234567
		controll.start();
		//1. 남자 여자 구별 
		//2. 대략 나이 
		//3. 태어난 계절 ? /
		//4. 주민 타당 
	}	//	9 9 1 2 2 5 - 1 2 3 4 5 6 7 
		//  2 3 4 5 6 7   8 9 2 3 4 5 
		//  총합 구하기
		// ex/122 (총합을) 11 로 나눈 나머지 구함  마지막번호랑 비교
		//  11에서 나머지를 뺸 결과를 체크 용번호와 비교 
		//	 나머지가 두자리라면 그나머지를 10으로 나눈 나머지를 구함
		//	그 나머지를 체크번호와 일치하는지 확인 
		//  이름,주민
}
