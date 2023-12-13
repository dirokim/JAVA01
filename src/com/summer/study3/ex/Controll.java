package com.summer.study3.ex;

import java.util.Scanner;

public class Controll {
	
	Scanner sc = new Scanner(System.in);


	public void start() {
		Function function = new Function();
		View view = new View();
		Data data = new Data();
		Data [] datas = null;		
		boolean check = true;
		while(check) {
			System.out.println("1.데이터 목록");
			System.out.println("2.데이터 디테일");
			System.out.println("3.데이터 추가");
			System.out.println("4.데이터 수정");
			System.out.println("5.디테일 ?");
			System.out.println("6.프로그램 종료");
			int num = sc.nextInt();			
				  if(num==1) {
				System.out.println("1.데이터 목록");
				view.list(datas);
			}else if(num==2) {
				System.out.println("2.데이터 디테일");
				view.detail(datas);
			}else if(num==3) {
				System.out.println("3.데이터 추가");
				datas =	function.add(datas);
			}else if(num==4) {
				System.out.println("4.데이터 수정");
			}else if(num==5) {
				System.out.println("5.목록 삭제");
				datas = function.minus(datas);
			}else {
				System.out.println("프로그램 종료");
				check = false;	
			}
			
			
		}
		
	}
}
