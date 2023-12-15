package com.summer.study4.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	private String info;
	
	public StudentService() {
		
		this.info="winter-1-50-60-80";
		this.info=this.info+"-iu-2-85-94-74";
		this.info=this.info+"-karina-3-78-78-98";
		

	
	}
		
	public ArrayList<Student> init() {
		 StringTokenizer students = new StringTokenizer(info,"-");
		 ArrayList<Student> students1 = new ArrayList<>();
		 while(students.hasMoreElements()) {
				Student student = new Student();
			 student.setName(student.getName());
			 student.setNumber(Integer.parseInt(students.nextToken()));
			 student.setKorean(Integer.parseInt(students.nextToken()));
			 student.setEnglish(Integer.parseInt(students.nextToken()));
			 student.setMath(Integer.parseInt(students.nextToken()));
			 student.setTotal(student.getKorean()+student.getEnglish()+student.getMath());
			 student.setAvg(student.getTotal()/3);
			 students1.add(student);
			
		 }
		 return students1;
	}
	public void findByName(ArrayList<Student> students1) {
		System.out.println("학생 이름을 입력하세요");
		String name = sc.next();
		for(int i=0;i<students1.size();i++) {
			
			if(name==students1.get(i).getName()) {
				System.out.println(students1.get(i));
			}
		}
		
	}
	public void studentAdd() {
		
	}
	public void studentDelete() {
		
	}
	//init 메소드 준비 
	//info 를 pasing 해서 스튜던트 클래스 선언 멤버선언  + 총점 평균 
	//학생정보검색 findByName 이름으로 검색
	//학생정보추가 studentAdd
	//학생정보삭제 studentDelete 이름으로 검색해서 삭제 
}
