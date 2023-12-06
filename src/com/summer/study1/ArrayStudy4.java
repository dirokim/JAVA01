package com.summer.study1;

import java.util.Scanner;

public class ArrayStudy4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//1.학생 정보생성
		// - 학생수 입력 받음
		// - 학생수 만큼 이름 ,번호 , 학점
		// 2.학생 정보 출력
		// 3.학생 정보 검색
		// - 검색할 학생 번호를 입력 받아서 해당 학생의 정보를 출력
		// 4.성적순출력
		// 5.프로그램 종료
		boolean abc = false;
		String [] name = null;
		int [] number1 = null;
		String [] grade = null;
		while(abc) {
			int num1 = sc.nextInt();
			System.out.println("1학생 정보 생성");
			System.out.println("2학생 정보 출력");
			System.out.println("3학생 정보 검색");
			System.out.println("4성적순 출력");
			System.out.println("5.프로그램 종료");
			
			if(num1==1) {
				
				System.out.println("1학생 정보 생성");
				int num = sc.nextInt();
				for(int i =0;i<num;i++) {
					System.out.println((i+1)+"번쨰 학생 이름은 무엇입니까?");
					name[i]= sc.next();	
					System.out.println((i+1)+"번쨰 학생 번호는 무엇입니까?");
					 number1[i] = sc.nextInt();
					System.out.println((i+1)+"번쨰 학생 학점은 무엇입니까?");
					grade[i] = sc.next();
					}
			}else if(num1==2) {
				System.out.println("2학생 정보 출력");
				for(int j=0;j<name.length;j++) {
				System.out.println(name[j]);
				System.out.println(number1[j]);
				System.out.println(grade[j]);
			}
			
		}else if(num1==3) {
			System.out.println("3학생 정보 검색");
			
				int find = sc.nextInt();
			for(int k=0;k<1;k++) {
				if(number1[k]==find){
				
			System.out.println(number1[k]);
			System.out.println(name[k]);
			System.out.println(grade[k]);
		}else if(num1==4) {
			System.out.println("4성적순 출력");
			for(int i = 0;i<grade.length-1;i++) {
				for(int j=0;j<grade.length-1;j++) {
					if(grade[i]>grade[j]) {
						int sum = grade[i];
						grade[j]= grade[i];
						grade[i]= sum;
					}
				}
			}
			
			
		}else if(num1==5) {
			System.out.println("5.프로그램 종료");
			
		}
		}	
	}
}
}			
}
