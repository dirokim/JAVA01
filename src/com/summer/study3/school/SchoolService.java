package com.summer.study3.school;

import java.util.Scanner;

public class SchoolService {
	//메서드 makeStudents
	//학생수를 입력 받아서 수만큼 학생의 정보입력

	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수는 몇명인가요?");
		int sum = sc.nextInt();
 		Student [] students = new Student[sum];
		
 		for(int i =1;i<=sum;i++) {
			Student student = new Student();
			
		System.out.println("학생 이름은 무엇");
		student.name = sc.next();
		
		System.out.println("학생 번호는 무엇");
		    student.num = sc.nextInt();
		
		System.out.println("학생 점수는 무엇");
			student.jumsu = sc.nextDouble();
			
			students[i]= student;
	
		}
 		
 		return students;
		
	}
}

