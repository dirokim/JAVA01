package com.summer.study1;

import java.util.Scanner;

public class Study4For {
	public static void main(String[]agrs) {
		//서든 FPS 
		//총알 : 30발 탄창 3
		//1.단발모드 1발
		//2.점사모드 10발
		Scanner sc = new Scanner(System.in);
		System.out.println("모드를 정하세요1or2");
		int num = sc.nextInt();
		
		if(num ==1){
			for(int i =1;i<=3;i++) {
				for(int j = 1;j<=30;j++) {
					System.out.println(j);
					
			}
			}
	
		}else if(num ==2) {
			for(int i=1;i<=3;i++) {
				for(int j = 1; j<31;j++) {
					j+=10;
					j-=1;
					System.out.println(j);
				}
			}
		}

	}
}