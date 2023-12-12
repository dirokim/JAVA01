package com.summer.study3.school;

import java.util.Scanner;

public class SchoolController {

		public void start() {
			Scanner sc = new Scanner(System.in);
			SchoolService schoolService = new SchoolService();
			SchoolView schoolView = new SchoolView();
			Student [] students = null;
			System.out.println("번호를 입력하세요");
			boolean check = false;
			while(check==false) {		
				System.out.println("1.학생정보입력");
				System.out.println("2.학생정보출력");
				System.out.println("3.학생정보검색");
				System.out.println("4.학생정보추가");
				System.out.println("5.프로그램종료");
				int num = sc.nextInt();		
				if(num==1) {
					System.out.println("1.학생정보입력");
					schoolService.makeStudents();
				}else if(num==2) {
					System.out.println("2.학생정보출력");
					schoolView.view(students);
				}else if(num==3) {
					System.out.println("3.학생정보검색");
					Student s = schoolService.findByNum(students);
					if(s != null) {
						schoolView.view(s);
					}else {
						schoolView.view("학생이 없다");
					}
					break;
				}else if(num==4) {
					System.out.println("4.학생정보추가");
				students = schoolService.addStudent(students);
				}else if(num==5) {
					System.out.println("5.프로그램종료");
					check = true;
					break;
				}
			}
		}
}
