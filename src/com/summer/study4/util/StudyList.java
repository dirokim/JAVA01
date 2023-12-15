package com.summer.study4.util;

import java.util.ArrayList;

public class StudyList {
	public static void main(String[]args) {
		//배열과 비슷 
		//선언시 따로 갯수를 선언하지 않음
		
		ArrayList ar = new ArrayList();
		//추가 add
		ar.add("first");//다형성 오브젝트타입 
		ar.add("second");
		ar.add(3);//int > Integer auto boxsing 되면서 담김
		ar.add('a');//char > character 로 바뀜 
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
