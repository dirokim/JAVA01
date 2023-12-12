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
	
	public Student [] addStudent(Student[]students) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.err.println("이름을 입력");
		student.name = sc.next();
		System.err.println("번호를 입력");
		student.name = sc.next();
		System.err.println("학점을 입력");
		student.jumsu = sc.nextDouble();
		
		Student [] newStudents = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			newStudents[i]=students[i];
		}
		newStudents[students.length] = student;
		
		return newStudents;
		

		
	}
	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생 번호 입력");
		int num = sc.nextInt();
		Student student= null;
		for(int i=0;i<students.length;i++) {
			if(num==students[i].num) {
				//return students[i];
				student = students[i];
				break;
			}
		}
		
		return student;
		
	}
}

