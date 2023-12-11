package com.summer.study3.school;

public class SchoolView {
	//view
	//
	public void view(Student [] students) {
		for(int i=0;i<students.length;i++) {
		System.out.println("이름 :"+students[i].name);
		System.out.println("번호 :"+students[i].num);
		System.out.println("점수 :"+students[i].jumsu);
		
		}
	}
	
}
