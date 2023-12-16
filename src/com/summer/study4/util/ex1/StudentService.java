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
		
	public ArrayList<StudentData> init() {
		 StringTokenizer students1 = new StringTokenizer(info,"-");
		 ArrayList<StudentData> students = new ArrayList<>();
		 while(students1.hasMoreElements()) {
				StudentData student = new StudentData();
			 student.setName(student.getName());
			 student.setNumber(Integer.parseInt(students1.nextToken()));
			 student.setKorean(Integer.parseInt(students1.nextToken()));
			 student.setEnglish(Integer.parseInt(students1.nextToken()));
			 student.setMath(Integer.parseInt(students1.nextToken()));
			 student.setTotal(student.getKorean()+student.getEnglish()+student.getMath());
			 student.setAvg(student.getTotal()/3);
			 students.add(student);
			
		 }
		 return students;
	}
	public void findByName(ArrayList<StudentData> students) {
		System.out.println("학생 이름을 입력하세요");
		String name = sc.next();
		for(int i=0;i<students.size();i++) {
			
			if(students.get(i).getName()==name) {
				System.out.println(students.get(i).getName());
				System.out.println(students.get(i).getNumber());
				System.out.println(students.get(i).getKorean());
				System.out.println(students.get(i).getEnglish());
				System.out.println(students.get(i).getMath());
				System.out.println(students.get(i).getTotal());
				System.out.println(students.get(i).getAvg());
			}
		}
		
	}
	public ArrayList<StudentData> studentAdd(ArrayList<StudentData> students) {
				System.out.println("학생 정보 추가");
				StudentData student = new StudentData();
				System.out.println("학생 이름은?");
				student.setName(sc.next());
				System.out.println("학생 번호는 ?");
				student.setNumber(sc.nextInt());
				System.out.println("학생 국어 점수");
				student.setKorean(sc.nextInt());
				System.out.println("학생 영어 점수");
				student.setEnglish(sc.nextInt());
				System.out.println("학생 수학 점수");
				student.setMath(sc.nextInt());
				students.add(student);
				
		
		return students;
	}
	public void studentDelete() {
		
	}
	//init 메소드 준비 
	//info 를 pasing 해서 스튜던트 클래스 선언 멤버선언  + 총점 평균 
	//학생정보검색 findByName 이름으로 검색
	//학생정보추가 studentAdd
	//학생정보삭제 studentDelete 이름으로 검색해서 삭제 
}
