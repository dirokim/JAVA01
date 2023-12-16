package com.summer.study4.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class StudySetInfo {
	//로또 번호 생성
	//1~45,6개
	private int number;
	int num=0;
	Random random = new Random();
	public void ex0 () {
		//배열 통해서
		StudySetInfo [] numbers;
		
		
			
			for(int i=0;i<6;i++) {
				StudySetInfo number = new StudySetInfo();
				num = random.nextInt(45)-1;
				number.setNumber(num);
				numbers[i]=number.getNumber();
						
			}
		

		
		
	}
	public ArrayList<Integer> ex1() {
			//6개 구해서 보관
			//ArrayList
		
		
		Random random = new Random();

		ArrayList<Integer> ar = new ArrayList<>();
		int i =0;
		while(ar.size()!=6) {
			num = random.nextInt(45)+1;
			
			if(!ar.contains(num)) {
				ar.add(num);
			}
			
							
					
				
				
		}
	}
	public void ex2 (ArrayList<Integer> ar) {
		//HashSet
		HashSet<Integer> hr = new HashSet<>();
		
		
		while(hr.size()!=6) {
			hr.add(random.nextInt(45)+1);
		}
		Iterator<Integer> it = hr.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
			
		}
		
			}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
