package com.summer.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {

		
	//학생들의 모든 정보를 출력
	public void view(ArrayList<StudentData>students) {
		//향상된 포문
		//for(모은데이터타입 변수명:collection 변수명){ 컬렉션에서 변수명에담을떄
			for(StudentData student:students) {
				System.out.println(student.getName());
				System.out.println(student.getAvg());
				System.out.println("=========================");
				
			}
		
		
		
		
		
	
	
	}
	
	
	
	//학생 한명의 모든 정보를 출력
//	public ArrayList<StudentData> view(ArrayList<StudentData> students) {
//		
//		
//		return students;
//	}
//	public void view(ArrayList<StudentData> students) {
//		
//	}
	//메세지를 추력
	
	
	
}
