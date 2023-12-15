package com.summer.study4.util;

import java.util.ArrayList;

public class StudyList3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		StudyList3 st3 = new StudyList3();
		st3.add(ar);
		
		for(Integer i : ar) {
			System.out.println(i);
		}
	}

}
