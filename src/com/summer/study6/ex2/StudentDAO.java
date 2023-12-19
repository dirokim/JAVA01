package com.summer.study6.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	public ArrayList<StudentDTO> getstudent() throws Exception {
		File file = new File("c:\\study\\student.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		//이름 ,번호 , 국어, 영어,수학,총점 ,평균(double)
		br.readLine();
		ArrayList<StudentDTO> list = new ArrayList<>();
		
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}
			StudentDTO studentdto = new StudentDTO();
			StringTokenizer ar = new StringTokenizer(s,"-");
			studentdto.setName(ar.nextToken());
			studentdto.setNumber(Integer.parseInt(ar.nextToken()));
			studentdto.setKorean(Integer.parseInt(ar.nextToken()));
			studentdto.setEnglish(Integer.parseInt(ar.nextToken()));
			studentdto.setMath(Integer.parseInt(ar.nextToken()));
			studentdto.setTotal(Integer.parseInt(ar.nextToken()));
			studentdto.setAvg(Double.parseDouble(ar.nextToken()));
		
			list.add(studentdto);	
		}
		
			for(StudentDTO sum : list) {
				System.out.println(sum.getName());
				System.out.println(sum.getNumber());
				System.out.println(sum.getKorean());
				System.out.println(sum.getEnglish());
				System.out.println(sum.getMath());
				System.out.println(sum.getTotal());
				System.out.println(sum.getAvg());
				
			}
		return list;
	
	}
}
