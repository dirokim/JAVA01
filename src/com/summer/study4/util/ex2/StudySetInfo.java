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
		
	}
	public ArrayList<Integer> ex1() {
			//6개 구해서 보관
			//ArrayList
		Random random = new Random();

		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()<6) {
			num = random.nextInt(45)+1;
			ar.add(num);
				for(int i=1;i<ar.size();i++) {
					
					for(int j=0;i<ar.size();j++) {
						if(ar.get(i)!=ar.get(j)) {
							
						
					}
					
					}
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
			System.out.println(it.next());
		}
		
			}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
