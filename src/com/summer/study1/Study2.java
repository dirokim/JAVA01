package com.summer.study1;

import java.util.Scanner;

public class Study2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	


		int id = 1234;
		int pw = 5678;

		//아이디와 패스워드를 입력받습니다.
		//로그인 성공 유무 판단
		boolean check=false;//false면 로그인실패
		for(int i = 1;i<=5;i++) {
			System.out.println("아이디를 입력하세요");
			int num = sc.nextInt();
			System.out.println("비밀번호를 입력하세요");
			int num1 = sc.nextInt();
			if(num==1234 && num1==5678 ){
//				System.out.println("로그인 성공");
				check = true;
				break;
			}
			
		}
		System.out.println(check==true?"로그인 성공":"로그인 실패");
//		if(check) {
//			System.out.println("로그인성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
	}
}
