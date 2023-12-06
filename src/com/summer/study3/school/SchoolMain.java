package com.summer.study3.school;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//객체를 생성
		//클래스명 변수명 = new 클래스명();
	
		
		
		//학생의 수를 입력 받아서 
		//학생의 정보를 입력 받아서
		//학생의 정보 입력받기  name num jumsu
		
	
			System.out.println("학생 수를 입력하세요");
			int sum = sc.nextInt();
			Student [] students = new Student[sum];
			
			
	
			for(int i=0;i<sum;i++) {
				Student stu = new Student();
					System.out.println("이름을 입력하세요");
					stu.name = sc.next();
					System.out.println("번호를 입력하세요");
					stu.num = sc.nextInt();
					System.out.println("점수를 입력하세요");
					stu.jumsu = sc.nextDouble();
	
					students[i] = stu;
			}
			
			for(int i=0;i<students.length;i++) {
			
				System.out.println(students[i].name);
				System.out.println(students[i].num);
				System.out.println(students[i].jumsu);
				
			}
		
		
		
	}
}

