package com.summer.study1;

import java.util.Scanner;

public class Study4For {
	public static void main(String[]agrs) {
		//1.로그인 처리
		//1,로그인하겠다 2.종료하겠다.
		//-id,pw 무제한 
		//2.MMORPG 게임
		//레벨은 1부터 
		//골드 0 
		//몬스터의 경험치는 같다
		//1->2 3마리
		//2->3 6마리
		//3->4 9마리  
		//14->15 end
		//프린트 레벨축하 한마리씩 사냥할떄마다 프린트
		//레벨이 5렙 달성시 1000G 지급
		//레벨이 10렙 달성시 2000G 지급
		//최종레벨이 15 렙 달성시 3000G 지급
		//최종 레벨 과 골드를 출력하고 게임종료 
		Scanner sc = new Scanner(System.in);
	
			int id = 1234;
			int pw = 123;
			int num = 0;
			int gold = 0;
			int c = 1;
			boolean yes = true;

		while(yes) {	
			System.out.println("1.로그인하겠다,2종료하겠다");
			int answer = sc.nextInt();
			if(answer==1) {
				System.out.println("아이디를 입력하세요");
				int userid = sc.nextInt();
				System.out.println("패스워드를 입력하세요");
				int	userpw = sc.nextInt();
				if(userid==id && userpw==pw) {
					System.out.println("로그인 되었습니다");
					break;
				}else {System.out.println("로그인 실패");}
			}else {yes=false;}
		}
			
		if(yes==true) {
			System.out.println("게임시작");
			for(int i =1;i<=14;i++) {
					num +=3;
			for(int j = 1;j<=num;j++) {
					System.out.println(j+"마리 잡았습니다.");
					}
					System.out.println("축하합니다 레벨업하셨습니다!!현제레벨:"+i);
			if(i==5||i==10||i==14) {
					gold+=1000*c;
					System.out.println(gold+"G 지급");
					c++;
			}

			if(i==14){
				System.out.println("최종레벨:"+i+"최종골드:"+gold);}
		}
		
		}
}
}